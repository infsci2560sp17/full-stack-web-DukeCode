package edu.infsci2560.controllers;

import edu.infsci2560.models.StrategyHelp;
import edu.infsci2560.repositories.StrategyHelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class StrategyHelpController {
    @Autowired
    private StrategyHelpRepository repository;

    @RequestMapping(value = "officialStrategyHelp", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("officialStrategyHelp", "officialStrategyHelp", repository.findAll());
    }

    @RequestMapping(value = "officialStrategyHelp/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid StrategyHelp strategyHelp, BindingResult result) {
        repository.save(strategyHelp);
        return new ModelAndView("officialStrategyHelp", "officialStrategyHelp", repository.findAll());
    }

}