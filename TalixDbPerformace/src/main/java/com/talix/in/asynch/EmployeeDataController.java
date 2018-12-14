package com.talix.in.asynch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDataController {
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Employee getEmployees()
    {
		Employee emp=new Employee(10,"jai",3120.12f);
		return emp;
    }
}
