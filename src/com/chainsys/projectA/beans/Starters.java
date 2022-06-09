package com.chainsys.projectA.beans;

public abstract class Starters {
	public String name;
}
class Chicken extends Starters
{
	public Chicken() {
		name="HoneyChicken";
	}
}
class Soup extends Starters{
	public Soup() {
		name="sweetcon";
	}
}
class Vegroll extends Starters{
	public Vegroll() {
		name="cabageroll";
	}
}
