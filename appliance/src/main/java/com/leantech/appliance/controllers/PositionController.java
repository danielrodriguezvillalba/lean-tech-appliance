package com.leantech.appliance.controllers;

import com.leantech.appliance.constansts.Routes;
import com.leantech.appliance.models.Employee;
import com.leantech.appliance.models.Position;
import com.leantech.appliance.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.POSITION)
public class PositionController {

    @Autowired
    private PositionService positionService;

    @RequestMapping(Routes.ALL)
    public ResponseEntity<List> getPeople() {
        return new ResponseEntity(positionService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<List> save(@RequestBody Position position) {
        positionService.save(position);
        return new ResponseEntity(HttpStatus.OK);
    }
}
