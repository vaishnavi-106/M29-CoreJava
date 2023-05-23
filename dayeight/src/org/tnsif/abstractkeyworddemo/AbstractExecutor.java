package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {

	public static void main(String[] args) {
		Remotechild r =new Remotechild();
		r.name = "durocell";
		r.display();
		r.functionremote();
		r.create();

	}

}