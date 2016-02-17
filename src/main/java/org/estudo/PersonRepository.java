package org.estudo;

import io.spring.guides.gs_producing_web_service.Person;

public interface PersonRepository {

	Person getPersonByName(String name);
	
}
