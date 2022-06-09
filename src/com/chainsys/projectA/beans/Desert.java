package com.chainsys.projectA.beans;

public abstract class Desert {
	public String name;
}
class Icecream extends Desert
{
	public Icecream()
	{
		name="Icecream";
	}
}
class Sweets extends Desert
{
	public Sweets()
	{
		name="Sweets";
	}
}
class Cakes extends Desert
{
	public Cakes()
	{
		name="Cakes";
	}
	public Cakes(String name)
	{
		this.name=name;
	}
}