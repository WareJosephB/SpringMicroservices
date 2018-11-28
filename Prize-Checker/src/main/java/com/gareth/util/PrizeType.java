package com.gareth.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrizeType {

	@Value("${prize.base}")
	int basePrize;
	@Value("${prize.multiplier}")
	int multiplier;
	@Value("${message.win}")
	String winMessage;
	@Value("${message.lose}")
	String loseMessage;

	public String checkLetter(String accountNumber) {

		String letter = accountNumber.substring(0, 1);
		switch (letter) {
		case "A":
			return winMessage.replaceAll("\uFFFD", "£") + String.valueOf(basePrize);
		case "B":
			return winMessage + String.valueOf(multiplier * basePrize);
		default:
			return loseMessage;
		}

	}
}
