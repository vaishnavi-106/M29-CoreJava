package org.tnsif.methodloading;

public class MethodOverloading {
	public int multiplication(int a , int b)
	{
		return a*b;
	}
	public float multiplication(float a ,float  b)
	{
		return a*b;
		
	}
	
	public float  multiplication(int a ,float b)
	{
		return a*b;
		
	}
	
	public float multiplication(float a ,int b)
	{
		return a*b;
		
	}
	
	//method overloading by changing  no of argument
	public String print(String str )
	{
		return str;
	}
	
	public String print(String str ,String str1)
	{
		return str + str1;

	}






}