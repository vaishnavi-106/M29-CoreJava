package org.tnsif.constructor;

public class ConstructorOverloading {
	private int x ;
	private int y;
	
	//construtor overloading
	public ConstructorOverloading()

	{
		System.out.println("Default construtor ");
	}
	
	public ConstructorOverloading(int x )

	{
		System.out.println("parameteized construtor "+x);
	}
	
	public ConstructorOverloading(int x ,int y)

	{
		System.out.println("parameteized construtor "+x+" "+y);
	}
	
	
}