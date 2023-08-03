package com.sylviadang.zookeeper;

public class Bat extends Mammals {
	
	public Bat() {
//		super(300);
		this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("The bat is airborne!");
		displayEnergy();
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("The bat is satisfied!");
		displayEnergy();
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("The bat is attching the town!");
		displayEnergy();
	}
}
