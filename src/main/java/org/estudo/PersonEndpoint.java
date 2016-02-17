package org.estudo;

import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.GetPersonResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {

	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	
	@Autowired
	private PersonRepository personRepository;
	
	@ResponsePayload
	@PayloadRoot(localPart="getPersonRequest" , namespace=NAMESPACE_URI)
	public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request){
		GetPersonResponse response = new GetPersonResponse();
		
		response.setPerson(personRepository.getPersonByName(request.getName()));
		
		return response;
	}
}
