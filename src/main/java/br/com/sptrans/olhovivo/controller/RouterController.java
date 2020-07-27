package br.com.sptrans.olhovivo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {

	@RequestMapping(value = "/")
	public String index() {
		return "/olho-vivo";
	}
	
	@RequestMapping(value = "/index")
	public String home() {
		return "/olho-vivo";
	}
	
	@RequestMapping(value = "/olho-vivo")
	public String olhoVivo() {
		return "/olho-vivo";
	}

}
