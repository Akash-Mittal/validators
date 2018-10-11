package com.am.innovations;

public enum LIMITS {
	ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

	private LIMITS(int limit) {
		this.val = limit;
	}

	private int val;

	public int getVal() {
		return val;
	}

}