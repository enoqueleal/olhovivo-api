package br.com.sptrans.olhovivo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentConfiguration {
	
	@Value("${olhovivo.token}")
	private String token;

	@Value("${olhovivo.url}")
	private String url;
	
	@Value("${olhovivo.resource.login}")
	private String loginURI;
	
	@Value("${olhovivo.resource.lines}")
	private String linesURI;
	
	@Value("${olhovivo.resource.position}")
	private String positionURI;

	public EnvironmentConfiguration url() {
		return this;
	}

	public String loginResource() {
		return this.url.concat(loginURI).concat(token);
	}

	public String lineResource(String lineName) {
		return this.url.concat(linesURI).concat(lineName);
	}

	public String positionResource(String lineNumber) {
		return this.url.concat(positionURI).concat(lineNumber);
	}

}
