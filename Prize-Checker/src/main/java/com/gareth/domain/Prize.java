package com.gareth.domain;

public class Prize {

	private String prize;

	public Prize(String prize) {
		super();
		this.prize = prize;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Prize [prize=" + prize + "]";
	}

}
