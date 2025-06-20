package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void insertData() {
		
		EmployeeDao ed = new EmployeeDao();
		ed.insertData();
		
	}

	public void deleteData() {
		
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();
		
	}

	public void getParticular() {
		
		EmployeeDao ed = new EmployeeDao();
		ed.getParticular();
		
	}

	public void updateData() {
		
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
		
	}

}
