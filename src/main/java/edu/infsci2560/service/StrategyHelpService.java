/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.service;

import edu.infsci2560.models.StrategyHelp;
import edu.infsci2560.repositories.StrategyHelpRepository;
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
@RequestMapping("/public/api/officialStrategyHelp")
public class StrategyHelpService {

    @Autowired
    private StrategyHelpRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<StrategyHelp>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<StrategyHelp> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<StrategyHelp> create(@RequestBody StrategyHelp strategyHelp) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(strategyHelp), headers, HttpStatus.OK);
    }
}