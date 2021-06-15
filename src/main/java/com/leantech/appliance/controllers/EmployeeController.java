package com.leantech.appliance.controllers;

import com.leantech.appliance.constansts.Routes;
import com.leantech.appliance.models.Employee;
import com.leantech.appliance.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.EMPLOYEE)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET,value = Routes.ALL)
    public ResponseEntity<List> getAll(
            @RequestParam(required = false, name = "charge") String charge,
            @RequestParam(required = false, name = "name") String name
    ) {
        return new ResponseEntity(employeeService.getAllByFilter(charge, name), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List> save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<List> delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<List> update(@RequestBody Employee employee) {
        employeeService.update(employee);
        return new ResponseEntity(HttpStatus.OK);
    }

}
