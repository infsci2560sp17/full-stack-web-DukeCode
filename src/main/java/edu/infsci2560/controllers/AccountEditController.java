/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Account;
import edu.infsci2560.repositories.AccountRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class AccountEditController {
    @Autowired
    private AccountRepository repository;

    @RequestMapping(value = "accounts/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {
        Account account = repository.findOne(id);
        return new ModelAndView("accountEdit", "account", account);
    }

    @RequestMapping(value = "accounts/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Account account, BindingResult result) {
        repository.save(account);
        return "redirect:/accounts";
    }
}