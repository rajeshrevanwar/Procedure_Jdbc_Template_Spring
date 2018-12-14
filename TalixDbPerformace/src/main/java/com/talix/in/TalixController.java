package com.talix.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalixController {

	@Autowired
	TalixService talixService;
	
	@RequestMapping(value="/addData",method=RequestMethod.GET)
	public void addOrder() {
		talixService.addData();
	}
	
	@RequestMapping(value="/deleteData", method=RequestMethod.GET)
	public void deleteData() {
		talixService.deleteData();
	}
	
		
}
