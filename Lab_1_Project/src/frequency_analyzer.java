import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class frequency_analyzer {
	
	private static Scanner scanner;
	private static String input;
	private static Scanner fileScann;
	private static String data;
	
	public static void main(String[] args){
		System.out.println("Please enter the name of the file:");
		
		try {
			input = scanner.nextLine();
			File inputFile = new File("C:/Users/ramara/workspace/Lab_1_Project/" + input);
			fileScann = new Scanner(inputFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file was not found"); }
		data = fileScann.toString();
		System.out.println(data);
	}
}
