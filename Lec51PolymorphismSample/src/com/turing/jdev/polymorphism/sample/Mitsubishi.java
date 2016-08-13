package com.turing.jdev.polymorphism.sample;

public class Mitsubishi extends Car {

	// implicit Constructor
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi brake()";
	}
	
}
