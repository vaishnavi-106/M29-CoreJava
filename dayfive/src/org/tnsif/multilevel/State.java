package org.tnsif.multilevel;
//parent class2 and child class
public class State extends Country{
	
	//private data members
	private String StateName;
	private String language;
	//getters and setters
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + "]";
	}
	
	

}
