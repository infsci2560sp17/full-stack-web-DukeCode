package edu.infsci2560.controllers;

import edu.infsci2560.models.BookComment;
import edu.infsci2560.repositories.BookCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class BookCommentsController {
    @Autowired
    private BookCommentsRepository repository;

    @RequestMapping(value = "allBookComments", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("allBookComments", "allBookComments", repository.findAll());
    }

    @RequestMapping(value = "allBookComments/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid BookComment bookComment, BindingResult result) {
        repository.save(bookComment);
        return new ModelAndView("allBookComments", "allBookComments", repository.findAll());
    }

}