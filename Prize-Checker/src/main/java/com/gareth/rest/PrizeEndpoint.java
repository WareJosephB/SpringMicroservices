package com.gareth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.service.PrizeService;

@RestController
public class PrizeEndpoint {

	@Autowired
	PrizeService service;

	@RequestMapping("${URL.method}")
	public String getPrize(@PathVariable String accountNumber) {
		String prize = service.getPrize(accountNumber);
		return prize;
	}
}
