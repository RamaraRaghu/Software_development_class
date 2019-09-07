import java.util.ArrayList;
//Author Rakshith Raghu(rr5de)
//Author Dylan Kong(lk4wh)

public class Course {
	
	private String id;
	//private String dept;
	private String name;
	private ArrayList<Student> roll = new ArrayList<>();

	public Course(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}

	public static void main(String[] args) {
		Course c1 = new Course("cs2110", "CS");
		System.out.println(c1);
		Student s1 = new Student("bob");
		c1.addStudent(s1);
		c1.addStudent( new Student("ali") );
		c1.addStudent( new Student("cat") );
		c1.addStudent( new Student("don") );
		c1.addStudent( new Student("tom") );
		
		
		// Example: testing findStudent()
//		Student result = c1.findStudent("don");
//		if ( result == null ) 
//			System.out.println("not found");
//		else
//			System.out.println("found: " + result);
		System.out.println(c1);
		// Example: testing inClass(). Note we're passing a Student object
		Student target = new Student("tom");
		if ( c1.inClass(target) )
			System.out.println("inClass() found: " + target);
		else
			System.out.println("inClass() did not find: " + target);			
	}
	
	private boolean inClass(Student target) {
		for ( Student item : this.roll ) { 
			if ( item.equals(target) ) // depends on Student.equals()
				return true;
			}
		return false;
		// you know what?  This can be even easier!  Just use contains() on the list!
		//return this.roll.contains(target);
	}
	
	public boolean addStudent(Student person){
		if(this.roll.contains(person)){
			return false;
		}
		else{
			this.roll.add(person);
			return true;
		}
	}
	
	public boolean dropStudent(Student person){
		if(this.roll.contains(person)){
			this.roll.remove(person);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void cancel(){
		if(this.roll.isEmpty()){
			
		}
		else{
			this.roll.removeAll(this.roll);
		}
	}
	private Student findStudent(String studName) {
//		for (int i=0; i < this.roll.size(); ++i) {
//			if ( studName.equals(this.roll.get(i).getName()) )
//				return this.roll.get(i);
//		}
		for ( Student item : this.roll ) {
			if ( studName.equals(item.getName()) )
				return item;
		}
		return null;
	}

	public double averageGPA(){
		double sum = 0.0;
		if(this.roll.isEmpty()){
			return -1.0;
		}
		else{
			for(int i = 0; i < this.roll.size(); i++){
				sum = sum + this.roll.get(i).getGpa();
			}
			sum = sum/this.roll.size();
			return sum; 
		}
	}


	@Override
	public String toString() {
		return "<" + this.id + "," + this.name + "," + this.roll + ">";
	}

}
