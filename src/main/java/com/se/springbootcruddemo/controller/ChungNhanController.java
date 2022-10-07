package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.service.ChungNhanService;

@RestController
@RequestMapping("/chung-nhan")
public class ChungNhanController {

	@Autowired
	private ChungNhanService chungNhanService;
	
	
	@GetMapping("/findByBoeing")
	public List<String> findByBoeing(){
		return chungNhanService.findByBoeing();
		
	}
	
}
