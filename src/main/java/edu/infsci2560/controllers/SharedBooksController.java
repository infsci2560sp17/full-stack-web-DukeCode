package edu.infsci2560.controllers;

import edu.infsci2560.models.SharedBook;
import edu.infsci2560.repositories.SharedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class SharedBooksController {
    @Autowired
    private SharedBooksRepository repository;

    @RequestMapping(value = "allSharedBooks", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("allSharedBooks", "allSharedBooks", repository.findAll());
    }

    @RequestMapping(value = "allSharedBooks/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid SharedBook sharedBook, BindingResult result) {
        repository.save(sharedBook);
        return new ModelAndView("allSharedBooks", "allSharedBooks", repository.findAll());
    }

}