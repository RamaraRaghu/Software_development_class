
public class Book {
	//Rakshith Raghu (rr5de)
	//Homework #2
		private String author;
		private String title;
		
		public Book(String title, String author){
			this.author = author;
			this.title = title;
		}
		
		public String getAuthor(){
			return this.author;
		}
		
		public String getTitle(){
			return this.title;
		}
		
		public boolean equals(Book other){
			if(other instanceof Book){
				if(other.title == this.title && other.author == this.author){   //checks if each individual part is equal
					return true;
				}
			}
			return false;
		}
		
		public String toString(){
			return "The title of the book is " + this.title + " and the author is " + this.author + ".";
		}
	}
