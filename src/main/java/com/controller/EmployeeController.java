package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		EmployeeService es = new EmployeeService();
		//es.insertData();
		//es.deleteData();
		//es.getParticular();
		es.updateData();
		
	}
	
}
