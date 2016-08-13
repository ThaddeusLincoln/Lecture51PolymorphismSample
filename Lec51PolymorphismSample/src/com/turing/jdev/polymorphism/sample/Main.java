package com.turing.jdev.polymorphism.sample;

public class Main {

	public static void main(String[] args){
		
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		
		Ford ford = new Ford(6, "Ford Focus");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Holden holden = new Holden(6, "Holden Comodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
		
	}
}

class Holden extends Car{

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}
	
	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " --> startEngine()"; 
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() +	" --> accelerate()";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() +	" --> brake()";
	}
}


