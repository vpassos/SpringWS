package org.estudo;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonRepositoryImpl {

	@Test
	public void test() {
		
		PersonRepository personRepository = new PersonRepositoryImpl();
		
		Assert.assertEquals(personRepository.getPersonByName("teste").getAge(),23);
		
	}

}
