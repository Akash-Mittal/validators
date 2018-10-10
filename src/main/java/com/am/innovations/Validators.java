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
}
