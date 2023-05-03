package com.sppu.main.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SppuController {

	@GetMapping("/AddmissionDates")
	public String getDates()
	{
		return "Addmissions are open on Any time";
	}
}
