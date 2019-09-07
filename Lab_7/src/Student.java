
public class Student extends Person {
	private String campusAddress;
	private double gpa_value;
	private String school_address;
	
	public Student(String name, String home_address, String school_address){
		super(name, home_address);
		this.gpa_value = 0.0;
		this.school_address = school_address;
	}
	
	public String toString(){
		return "{Student: name=" + this.name + ", homeAddress=" + this.homeAddress + ", wa=" + this.school_address +"}";
	}
}
