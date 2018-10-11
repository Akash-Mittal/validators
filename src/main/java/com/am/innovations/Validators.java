package com.am.innovations;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Validators extends Predicate<Number> {

	Predicate<Object> checkIfNotNull = input -> input != null;

	BiPredicate<Object[], Integer> checkIfNotNullAndSizeGreaterThan = (input, size) -> checkIfNotNull.test(input)
			&& Validators.checkIfGreaterThan.test(input.length, size);

	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> input.intValue() == constraint.intValue();
	BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> input.intValue() > constraint.intValue();
	BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> input.intValue() < constraint.intValue();

	enum LIMITS {
		ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

		private LIMITS(int limit) {
			this.limit = limit;
		}

		private int limit;

		public int getLimit() {
			return limit;
		}

		public void setLimit(int limit) {
			this.limit = limit;
		}

	}

}
