package com.sylviadang.zookeeper;

public class Test {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.climb();
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.displayEnergy();
		
		Bat bat = new Bat();
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.fly();
		bat.fly();
		
		bat.displayEnergy();
	}

}
