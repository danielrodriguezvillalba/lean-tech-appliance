package com.leantech.appliance.services;

import com.leantech.appliance.models.Position;
import com.leantech.appliance.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionRepository repository;

    public List getAll() {
        return repository.findAll();
    }

    public void save(Position position) {repository.save(position);}

}
