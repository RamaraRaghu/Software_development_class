
import java.util.*;
public class Lab1Scanner {
	
	
	private static Scanner newscanner;
	
	public static void main(String[] args){
		int[] five_numbers = {0,0,0,0,0};
		int input = 0;
		int average = 0;
		
		newscanner = new Scanner(System.in);
		
		for (int i=0; i<5; i++){
			input = newscanner.nextInt();
			five_numbers[i] = input;
			average = average + input;
		}
		average = average/5;
		System.out.println("The average of " + five_numbers[0] + ", " + five_numbers[1] + ", " + five_numbers[2] + ", " + five_numbers[3] +", and " + five_numbers[4] + ",is " + average);
	}
}
