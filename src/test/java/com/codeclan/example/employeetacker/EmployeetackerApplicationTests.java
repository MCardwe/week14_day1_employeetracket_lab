package com.codeclan.example.employeetacker;

import com.codeclan.example.employeetacker.models.Employee;
import com.codeclan.example.employeetacker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeetackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee gwen = new Employee("Gwen", 12, "gweniscool@maximillianassociates.com", 12345);
		employeeRepository.save(gwen);
	}
}
