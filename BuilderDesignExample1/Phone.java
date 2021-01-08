package BuilderDesign;

public class Phone 
{
	private String os;
	private String processor;
	private int battery;
	private double screensize;
	private String company;
	
	public Phone(String os, String processor, int battery, double screensize, String company) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.screensize = screensize;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", battery=" + battery + ", screensize=" + screensize
				+ ", company=" + company + "]";
	}
	
	
	
	
}
