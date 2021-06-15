package com.leantech.appliance.services;

import com.leantech.appliance.models.Employee;
import com.leantech.appliance.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee){employeeRepository.save(employee);}

    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }

    public List getByCharge(String chargeName){return employeeRepository.findByCharge(chargeName);}

    public List getByName(String name) {
        return employeeRepository.findByName(name);
    }

    public void update(Employee employee){
        if(employeeRepository.existsById(employee.getId())){
            employeeRepository.save(employee);
        }
    }

    public List getAllByFilter(String charge, String name) {
        if(charge != null)return getByCharge(charge);
        else if(name != null)return getByName(name);
        else return employeeRepository.findAll();
    }
}
