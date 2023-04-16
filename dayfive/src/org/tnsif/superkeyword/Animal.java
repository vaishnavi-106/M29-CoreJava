package org.tnsif.superkeyword;

public class Animal {
	//private data members
	public String animalType="wild";
	public int noOfLegs=2;
	
	
	
	public Animal() {
		System.out.println("parent class constructor");
	}


	public void display()
	{
		System.out.println("Animal Type: " +animalType);
		System.out.println("No. of Legs are: " +noOfLegs);
	}


	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	

}
