package br.com.sptrans.olhovivo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.sptrans.olhovivo.model.*;
import br.com.sptrans.olhovivo.service.SPTransService;

@Controller
public class SPTransController {

	private SPTransService service;
	private List<Line> lines;

	public SPTransController(SPTransService service) {
		this.service = service;
	}

	@RequestMapping(value = "/buscar-linha-por-nome")
	public String buscarContatoPorNome(@RequestParam(required = true) String parameter, Model model) {

		lines = this.service.getLines(parameter);

		if (lines.isEmpty()) {
			model.addAttribute("noResultsFount", true);
		}

		model.addAttribute("linhas", this.service.getLines(parameter));

		return "/olho-vivo";

	}

	@RequestMapping(value = "/open-modal")
	public String openModal(@RequestParam String identificador, Model model) {

		int id = Integer.parseInt(identificador);

		for (Line line : lines) {

			if (line.getCodigoIdentificador() == id) {
				model.addAttribute("linha", line);
				break;
			}

		}

		Location location = this.service.getLocation(identificador);

		if (location.getOnibus().isEmpty()) {

			model.addAttribute("noResultsFount", true);

			return "/olho-vivo-modal";
			
		} 

		Bus bus = location.getOnibus().get(0);

		model.addAttribute("bus", bus);

		return "/olho-vivo-modal";

	}

}
