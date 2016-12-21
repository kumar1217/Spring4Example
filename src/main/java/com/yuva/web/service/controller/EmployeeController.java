/**
 * 
 */
package com.yuva.web.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yuva.web.model.Employee;
import com.yuva.web.service.EmployeeService;

/**
 * @author kumaraswamy
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired(required=true)
	EmployeeService service;
	
	@RequestMapping(value = "/empsearch", method = RequestMethod.POST)
	public List<String> GetEmployeeInFo(Employee emp){
	int id=	emp.getEmpId();
		System.out.println("id:"+id+"name:"+emp.getName());
		List info=service.getEmployeeInFo();
		return info;
	}
	
@RequestMapping(value="/search",method=RequestMethod.GET)
public ModelAndView employeeSearch(){
	String message="Welcome to Yuvan Techologies";
	return new ModelAndView("employeesearch", "message", message);
	
}

}
