package com.munozmanzano.mb2gspringbootmm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.munozmanzano.model.ShippingAddress;


@RestController
public class ExampleController {

	@RequestMapping(value="/", method={RequestMethod.GET})
	public ShippingAddress getShippingAddress() {
		
		return new ShippingAddress();	
	}
}
