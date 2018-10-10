package com.am.innovations;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Validators extends Predicate<Number> {

	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> input.intValue() == constraint.intValue();
	BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> input.intValue() == constraint.intValue();
	BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> input.intValue() == constraint.intValue();
}
