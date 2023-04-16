package org.tnsif.superkeyword;

public class Tiger extends Animal {

	//private data members
	public String animalType="Tiger-wild";
	public int noOfLegs=4;
		
	
	
	//default constructor
		public Tiger() {
			//invoking parent class constructor
			//it calls parent class default constructor
			System.out.println("child class constructor");
	}


		public void display()
		{
			//super keyword with method
			super.display();
			//super keyword with variable
			System.out.println(super.animalType);
			System.out.println(super.noOfLegs);
			System.out.println("Animal Type: " +animalType);
			System.out.println("No. of Legs are: " +noOfLegs);
		}


		@Override
		public String toString() {
			return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
		}
		
}
