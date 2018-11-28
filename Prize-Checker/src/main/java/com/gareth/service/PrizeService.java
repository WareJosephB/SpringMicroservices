package com.gareth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.util.PrizeType;

@Service
public class PrizeService {

	@Autowired
	PrizeType prizeType;

	public String getPrize(String accountNumber) {
		return prizeType.checkLetter(accountNumber);

	}
}
