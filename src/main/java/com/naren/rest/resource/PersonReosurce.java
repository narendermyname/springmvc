/**
 * 
 */
package com.naren.rest.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren.rest.dto.Person;

/**
 * @author narender
 *
 */
@RestController
@RequestMapping("/person")
public class PersonReosurce {

	/**
	 * 
	 */
	public PersonReosurce() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/list")
	public List<Person> getPersonList(){
		List<Person> personList=new ArrayList<Person>();
		personList.add(new Person(1000,"Narender Singh"));
		return personList;

	}
}
