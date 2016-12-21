/**
 * 
 */
package com.yuva.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author kumaraswamy
 *
 */
@Component
public interface EmployeeService {
	public abstract List<String> getEmployeeInFo();

}
