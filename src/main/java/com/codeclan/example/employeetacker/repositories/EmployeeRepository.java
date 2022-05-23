package com.codeclan.example.employeetacker.repositories;

import com.codeclan.example.employeetacker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
