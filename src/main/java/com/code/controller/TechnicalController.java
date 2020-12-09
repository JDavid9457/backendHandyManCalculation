package com.code.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.code.dominio.TechnicalRequest;
import com.code.dominio.TechnicalResponse;
import com.code.entity.TechnicalEntity;
import com.code.service.TechnicalService;



@RestController
@RequestMapping("/technical")
public class TechnicalController {
	
	@Autowired
	private TechnicalService technicalService;

	/**
	 * 	Metodo encargado de listar los datos 
	 */
	@GetMapping("api/technical/list")
	public List<TechnicalEntity>list(){
		return technicalService.list();
	}
	
	/**
	 *Metodo encargado de guarda los datos 
	 */
	@PostMapping("api/technical/save")
	public ResponseEntity<String> save(@RequestBody TechnicalRequest tr){
		technicalService.save(tr);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
	@GetMapping("/{identifyTechnical}/{numberWeek}")
	public @ResponseBody TechnicalResponse getReport(@PathVariable(name="identifyTechnical") String identifyTechnical, @PathVariable(name="numberWeek") String numberWeek) {
		
		return technicalService.getTechnicalCalculation(identifyTechnical,numberWeek);
	}
	
	
	
	
	
}
