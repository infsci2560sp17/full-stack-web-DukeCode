package edu.infsci2560.controllers;

import edu.infsci2560.models.Book;
import edu.infsci2560.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class BooksController {
    @Autowired
    private BooksRepository repository;

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("books", "books", repository.findAll());
    }

    @RequestMapping(value = "books/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Book book, BindingResult result) {
        repository.save(book);
        return new ModelAndView("books", "books", repository.findAll());
    }

}