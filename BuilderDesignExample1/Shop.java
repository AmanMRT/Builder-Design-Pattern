package BuilderDesign;

public class Shop {

	public static void main(String[] args) 
	{
		Phone p1 = new PhoneBuilder().setCompany("Samsung").setBattery(6000).setOs("Android10").getPhone();
		System.out.println(p1);
		Phone p2 = new PhoneBuilder().setCompany("Htc").setOs("Android10").setScreensize(15.6).getPhone();
		System.out.println(p2);
		Phone p3 = new PhoneBuilder().setBattery(7000).setCompany("Samsung").setProcessor("Intel").getPhone();
		System.out.println(p3);
	}

}
