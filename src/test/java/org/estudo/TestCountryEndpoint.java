package org.estudo;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class TestCountryEndpoint {

	@Test
	public void test() {
		
//		File file = new File("src/main/resources/static/countries.xsd"); 
		File file = new File("src/main/resources/static/countries.xst");
		Assert.assertEquals(true, file.exists());
//		
//		ClassPathResource resource = new ClassPathResource("/home/vinicius/estudoJava/SpringWebServices/src/main/resources/static/countries.xsd");
//		try {
//			File file = resource.getFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}

}
