package com.leantech.appliance.services;

import com.leantech.appliance.models.Person;
import com.leantech.appliance.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List getAll() {
        return personRepository.findAll();
    }

    public void save( Person person) {
        personRepository.save(person);
    }
}
