package com.ce.starbuzz;

import com.ce.starbuzz.beverage.Beverage;
import com.ce.starbuzz.beverage.DarkRoast;
import com.ce.starbuzz.beverage.Espresso;
import com.ce.starbuzz.beverage.HouseBlend;
import com.ce.starbuzz.condimentdecorator.Mocha;
import com.ce.starbuzz.condimentdecorator.Soy;
import com.ce.starbuzz.condimentdecorator.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		System.out.println("Dark Rost: " + beverage2.cost());
		
		beverage2 = new Mocha(beverage2);
		System.out.println("Add Mocha: " + beverage2.cost());
		
		beverage2 = new Mocha(beverage2);
		System.out.println("Add Mocha: " + beverage2.cost());
		
		beverage2 = new Whip(beverage2);
		System.out.println("Add Whip: " + beverage2.cost());
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		
		System.out.println("=============================");
		System.out.println(0.20 + 0.69);
	}

}
