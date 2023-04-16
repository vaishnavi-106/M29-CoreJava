//program to demonstrate on multilevel inheritance
package org.tnsif.multilevel;
//parent class
public class Country {

	private String countryName;
	private String countryCapital;
	
	//getters and setters
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}
	
	
}
