package com.org.wisdomleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.wisdomleaf.service.ClockService;

@RestController
@RequestMapping("api/")
public class SpeakingClockController {
	
	@Autowired
	private ClockService clockService;
	
	@GetMapping("/clock/{time}")
	public String ClockWord(@PathVariable("time") String time) {
		
		return clockService.Showresult(time);
	}

}
