import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Lab1File {

	private static long bytenumber = 0;
	private static Scanner fileScann = null;

	public static void main(String[] args){

		try {
			File theFile = new File("C:/Users/ramara/workspace/Lab_1_Project/data1.txt");
			fileScann = new Scanner(theFile);
			
			bytenumber = theFile.length();
			String name = theFile.getName();
			System.out.println("the number of bytes is: " + bytenumber);
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
