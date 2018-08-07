package com.ce.starbuzz.condimentdecorator;

import com.ce.starbuzz.beverage.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .23 + beverage.cost();
	}

}
