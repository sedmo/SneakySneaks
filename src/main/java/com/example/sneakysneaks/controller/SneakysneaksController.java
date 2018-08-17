package com.example.sneakysneaks.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sneakysneaks.database.SneakerRepository;
import com.example.sneakysneaks.objects.Sneaker;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Api(value = "This is the controller for the Sneakysneaks application")
public class SneakysneaksController {
	
//	@Autowired
//	private final SneakerRepository jdbcSneakerRepository;
//	
//	
	
	@ApiOperation(value = "homepage")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {		
		return "Welcome to the Sneakysneaks App";
	}
	
	@ApiOperation(value= "Returns a list of all shoes with the given Brand")
	@RequestMapping(path="/findbrand", method = RequestMethod.POST, produces = "application/json")
	public ArrayList<Sneaker> findSneakerByBrand(String brand){
		//return (ArrayList<Sneaker>) jdbcSneakerRepository.findBrand(brand);
		return new ArrayList<Sneaker>();
		
	}
}
