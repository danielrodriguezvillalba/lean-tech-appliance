package com.leantech.appliance.repositories;

import com.leantech.appliance.models.Employee;
import com.leantech.appliance.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer>{
}
