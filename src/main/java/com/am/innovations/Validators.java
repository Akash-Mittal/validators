package com.am.innovations;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Validators extends Predicate<Number> {

	Predicate<Object> checkIfNotNull = input -> input != null;

	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> input.intValue() == constraint.intValue();
	BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> input.intValue() > constraint.intValue();
	BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> input.intValue() < constraint.intValue();

	BiPredicate<Object[], Integer> checkIfNotNullAndSizeGreaterThan = (input, size) -> checkIfNotNull.test(input)
			&& Validators.checkIfGreaterThan.test(input.length, size);

	BiPredicate<Object[], Integer> checkIfSizeGreaterThan = (input, size) -> Validators.checkIfGreaterThan
			.test(input.length, size);

	interface Expressions {
		/*
		 * These are very simple expressions which should not reply on this
		 * implementations. This is just for demo purpose.
		 */
		BiFunction<Integer, Integer, Integer> AVERAGE = (val1, val2) -> (val1 + val2) / LIMITS.TWO.getVal();
		BiFunction<Integer, Integer, Integer> ADD = (val1, val2) -> (val1 + val2);
		BiFunction<Integer, Integer, Integer> SUBSTRACT = (val1, val2) -> (val1 - val2);
	}
}
