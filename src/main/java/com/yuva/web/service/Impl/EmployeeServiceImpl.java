/**
 * 
 */
package com.yuva.web.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yuva.web.service.EmployeeService;

/**
 * @author kumaraswamy
 *
 */
@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	

	@Override
	public List<String> getEmployeeInFo() {
		ArrayList al =new ArrayList<>();
		al.add("kumar");
		return al;
	}

}
