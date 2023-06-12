//throw and throws keyword example
package org.tnsif.excentiondemo;

import java.io.IOException;

public class throwkeywordexample {
	public static void donate(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
			System.out.println("person eligible to donate the blood");
		else
			//throw keyword is used to throw an expection explicitly
			
			throw new IOException ("Not eligible");
	}

	public static void main(String[] args) {
		try {
			throwkeywordexample.donate(19,45);
		
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled "+e);
			
		}
		

	}

}