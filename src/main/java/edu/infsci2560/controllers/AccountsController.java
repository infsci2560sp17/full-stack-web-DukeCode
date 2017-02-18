package edu.infsci2560.controllers;

import edu.infsci2560.models.Account;
import edu.infsci2560.repositories.AccountRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountsController {
    @Autowired
    private AccountRepository repository;

    @RequestMapping(value = "accounts", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("accounts", "accounts", repository.findAll());
    }

    @RequestMapping(value = "accounts/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Account account, BindingResult result) {
        repository.save(account);
        return new ModelAndView("accounts", "accounts", repository.findAll());
    }

}