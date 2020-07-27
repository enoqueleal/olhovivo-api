package br.com.sptrans.olhovivo.service;

import java.util.*;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.sptrans.olhovivo.configuration.EnvironmentConfiguration;
import br.com.sptrans.olhovivo.model.*;

@Service
public class SPTransService {

	private HttpEntity<String> httpEntity;
	private EnvironmentConfiguration env;
	private RestTemplate restTemplate;

	public SPTransService(EnvironmentConfiguration env, RestTemplateBuilder builder) {
		this.env = env;
		this.restTemplate = builder.build();
		this.httpEntity = getHttpEntity();
	}

	private HttpEntity<String> getHttpEntity() {

		String url = env.url().loginResource();
		
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, Object.class, String.class);

		return new HttpEntity<String>(responseEntity.getHeaders());

	}
	
	public List<Line> getLines(String lineName) {
		
		String uri = env.url().lineResource(lineName);
		
		ResponseEntity<List<Line>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Line>>() {});
		
		return responseEntity.getBody();

	}

	public Location getLocation(String lineNumber){
		
		String uri = env.url().positionResource(lineNumber);
		
		ResponseEntity<Location> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<Location>() {});
		
		return responseEntity.getBody();
		
	}

}
