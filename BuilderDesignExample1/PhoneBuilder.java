package BuilderDesign;

/* RULES
 * 1-> Create class and initialize variables
 * 2-> Create Setter functions of that variables with datatype of class name(here PhoneBuilder) and return this.
 * 3-> Create method similar to "toString" (here getPhone).
 * 		4---> Create class(here Phone) like in Encapsulation(with constructor(parameterized) and toString() method).
 * 		5---> Create a class used for testing the code(here Shop) and add details you want.
*/
public class PhoneBuilder 
{
	private String os;
	private String processor;
	private int battery;
	private double screensize;
	private String company;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public PhoneBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, processor, battery, screensize, company);
	}

}
