/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.service;

import edu.infsci2560.models.SharedBook;
import edu.infsci2560.repositories.SharedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author kolobj
 */
@RestController
@RequestMapping("/public/api/allSharedBooks")
public class SharedBooksService {

    @Autowired
    private SharedBooksRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<SharedBook>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<SharedBook> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<SharedBook> create(@RequestBody SharedBook sharedBook) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(sharedBook), headers, HttpStatus.OK);
    }
}