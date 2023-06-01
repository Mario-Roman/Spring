package com.codigofacilito.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class indexController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/index-req-mapping", method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
}
