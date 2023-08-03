package com.sylviadang.zookeeper;

public class Gorilla extends Mammals {
	
	
	public void throwSomething() {
		energyLevel -= 5;
		displayEnergy();
	}
	
	public void eatBananas() {
		energyLevel += 10;
		displayEnergy();
	}
	
	public void climb() {
		energyLevel -= 10;
		displayEnergy();
	}

}
