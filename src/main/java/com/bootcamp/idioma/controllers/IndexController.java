package com.bootcamp.idioma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.Saludo;

@RestController
public class IndexController {

	@Autowired
	private Saludo saludo;
	
	public IndexController() {
		
	}
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		return new ResponseEntity<String>(HttpStatus.OK).ok("hola");
	}
	
	@GetMapping("/saludo")
	public ResponseEntity<String> saludo(){
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}
	
}
