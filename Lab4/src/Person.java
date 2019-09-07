
import java.util.*;
public class Person {
		private String name;
		private int id;
		private ArrayList<Book> read;
		
		public Person(String name, int id, ArrayList<Book> read){
			this.name = name;
			this.id = id;
			this.read = read;
		}
		
		public String getName(){
			return this.name;
		}
		
		public int getId(){
			return this.id;
		}
		
		public ArrayList<Book> getBooks(){
			return this.read;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public boolean addBook(Book b){
			if(b instanceof Book){
				if(this.read.contains(b)){
					return false;
				}
				else{
					this.read.add(b);
					return true;
				}
			}
			return false;
		}
		
		public boolean hasRead(Book b){
			if(b instanceof Book){     //checks that its a book object
				if(this.read.contains(b)){         //checks whether it contains the book
					return true;
				}
				else{
					return false;
				}
			}
			return false;
		}
		
		public boolean forgetBook(Book b){
			if(b instanceof Book){          //checks whether it is a book object
				if(this.read.contains(b)){              //checks whether it contains it
					this.read.remove(b);    //gets rid of the book
					return true;
				}
				else{
					return false;
				}
			}
			return false;
		}
		
		public int numBooksRead(){
			return this.read.size();      //just finds the size 
		}
		
		public boolean equals(Person o){ 
			if(o instanceof Person){     //Just checks that it is a person object
				if(this.id == o.id){            //checks whether the ids are equal 
					return true;
				}
			}
			return false;
		}
		
		public String toString(){
			String output = "";
			for(int i=0; i < this.read.size(); i++){
				output = output + this.read.get(i).toString();
			}
			return "The name of the person is " + this.name + " and this person's id is " + this.id + ". This person read the books specified: "  + output;
		}
		
		public static ArrayList<Book> commonBooks(Person a, Person b){
			ArrayList<Book> common = new ArrayList<Book>();
			for(int i = 0; i < a.read.size(); i++){       //gets the size and iterates through the elements
				if(a.read.contains(b.read.get(i))){
					common.add(a.read.get(i));
				}
			}
			return common;
		}
		
		public static double similarity(Person a, Person b){
			double similar = 0.0;
			ArrayList<Book> simile = new ArrayList<Book>();
			
			for(int i = 0; i < a.read.size(); i++){     //these for loops go through each book list and add the books to the master list. 
				if(simile.contains(a.read.get(i))){     //if a book is already there, it isnt added again.
					
				}
				else{
					simile.add(a.read.get(i));
				}
			}
			
			for(int i = 0; i < b.read.size(); i++){
				if(simile.contains(b.read.get(i))){
					
				}
				else{
					simile.add(b.read.get(i));
				}
			}
			
			if(a.read.isEmpty() || b.read.isEmpty()){         //if either one is empty, it returns back 0.0
				return similar;
			}
			
			similar = (double) commonBooks(a,b).size();     //finds number of common books
			double bottom = (double) (simile.size());        //finds the length of the master list
			similar = similar/bottom;
			BigDecimal simil = new BigDecimal(similar);   //uses math method to convert the double into something that sig figs can be applied to.
			simil = simil.round(new MathContext(2));   //rounds it to two sig figs
			similar = simil.doubleValue();      //turns it back into a double
			return similar;
		}
		
		public static void main(String[] args){
			Book b1 = new Book("bible", "jon");
			Book b2 = new Book("koran", "bob");
			Book b3 = new Book("Bandana", "nan");
			Book b4 = new Book("bible", "jon");
			boolean equal = b1.equals(b4);
			System.out.println(equal);
			System.out.println(b1.toString());
			ArrayList<Book> bb1 = new ArrayList<Book>();
			ArrayList<Book> bb2 = new ArrayList<Book>();
			Person p1 = new Person("bernie", 358, bb1);
			Person p2 = new Person("jolie", 378, bb2);
			p1.addBook(b1);
			p1.addBook(b2);
			p1.addBook(b3);
			p1.addBook(b4);
			if(p1.hasRead(b4) ==  true){
				p1.forgetBook(b4);
			}
			if(p1.hasRead(b4) == true){
				p1.forgetBook(b3);
			}
			p2.addBook(b1);
			p2.addBook(b2);
			p2.addBook(b3);
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(commonBooks(p1, p2));
			System.out.println(similarity(p1, p2));
			
			
		}
		
		
	}
