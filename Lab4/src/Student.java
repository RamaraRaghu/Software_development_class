import java.util.*;
//Author Rakshith Raghu(rr5de)
//Author Dylan Kong(lk4wh)
public class Student {

	private String name;
	private double gpa;
	//private double gradePoints;
	//private double creditsAttempted;
	private ArrayList<Course> courses;

	public Student(String name, double gradePoints) {
		//studentName = name;
		if(gradePoints <= 4.0  && gradePoints >= 0){
			this.name = name;
			this.gpa = gradePoints;
		}
		else{
			
		}
	}
	public boolean add(Course aCourse){
		if(this.courses.contains(aCourse)){
			return false;
		}
		else{
			this.courses.add(aCourse);
			return true;
		}
	}
	public boolean drop(Course aCourse){
		if(this.courses.contains(aCourse)){
			this.courses.remove(aCourse);
			return true;
		}
		else{
			
			return false;
		}
		
		
	}
	public void dropAll(){
		if(this.courses.isEmpty()){
			
		}
		else{
			this.courses.removeAll(this.courses);
		}
	}
	
	public Student(String name){
		this.name = name;
		this.gpa = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Course> getCourse(){
		return courses;
	}

	public double getGpa() {
		return this.gpa;
	}

	public void setGpa(double gpa) {
		if(gpa <= 4.0 && gpa >= 0){
			this.gpa = gpa;
		}
		else{
			
		}
}

	
	public static void main(String[] args) {
		Student s1 = new Student("bob", 3.6);
		System.out.println(s1 + " " + s1.getGpa());	
		Student s1Twin = new Student("bob");
		Student notS1 = new Student("bob", 3.6);
		
		System.out.println(s1.equals(s1Twin));
		System.out.println(s1.equals(notS1));
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals("hello"));
	}
	
	// Without this method written correctly, Course.inClass() won't work!
	// Pages 153-154 in the MSD book says a bit about writing equals().
	public boolean equals(Student obj) {
		if ( obj instanceof Student ) {
			return obj.getName().equals( this.name );
		}
		else {
			return false;
		}
	}

	// The following is a version of equals() that works
	//   sometimes but not always. It's NOT the correct way
	//   to do it!
//	public boolean equals(Student s) {
//		System.out.println("hi from Student.equals()");
//		return s.getName().equals( this.name );
//	}
	

	//private void addCourseCredit(double gradePoints, double credits) {
		//this.creditsAttempted += credits;
		//this.gradePoints += gradePoints;
//}

	@Override
	public String toString() {
		return "(" + this.name + "," + getGpa() + ")";
	}

}
