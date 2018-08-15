package com.example.sneakysneaks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//for when i use jdbc
public class SneakysneaksController {
	
	//@ApiOperation(value = "")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getHomeAndHealth() {		
		return "Welcome to the Sneakysneaks App";
	}

}
