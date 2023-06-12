package org.tnsif.singleton;

public class SingletonByEager {
	
private static final SingletonByEager INSTANCE = new SingletonByEager();
	
	//private constructor
	private SingletonByEager() {
		
	}
	
	public static SingletonByEager getInstance() {
		return INSTANCE;
	}

}