package com.leantech.appliance.repositories;

import com.leantech.appliance.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    @Query("SELECT e FROM Employee e WHERE e.position.name = :charge")
    List<Employee> findByCharge(@Param("charge") String charge);

    @Query("SELECT e FROM Employee e WHERE e.person.name = :name")
    List<Employee> findByName(String name);
}
