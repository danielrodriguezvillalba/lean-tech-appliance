package com.leantech.appliance.controllers;

import com.leantech.appliance.constansts.Routes;
import com.leantech.appliance.models.Person;
import com.leantech.appliance.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.PERSON)
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(path = Routes.ALL, method = RequestMethod.GET)
    public ResponseEntity<List> getAll() {
        return new ResponseEntity(personService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List> save(@RequestBody Person person) {
        personService.save(person);
        return new ResponseEntity(HttpStatus.OK);
    }

}
