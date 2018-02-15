package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getDataFallBack() {
    	
    	List<Employee> empList= new ArrayList<>();
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("fallback-manager");
		emp.setEmpId("fallback-1");
		emp.setSalary(3000);
		empList.add(emp);

		return empList;
		
	}
}
