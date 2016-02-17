package org.estudo;

import io.spring.guides.gs_producing_web_service.Person;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	public Person getPersonByName(String name) {
		
		Person person = new Person();

		person.setName("Vinicius");
		person.setAge(23);

		GregorianCalendar c = new GregorianCalendar();
		c.set(1992, 1, 14);
		XMLGregorianCalendar date2;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			person.setBirthDate(date2);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person;
		
	}

}
