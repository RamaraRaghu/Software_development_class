import java.math.BigInteger;

public class Hello_Eclipse {
	public static void main(String[] args){
		System.out.println(getOutput(2110));
	}
	
	public static String getOutput(long num){
		BigInteger classNum = BigInteger.valueOf(num +1);
		String output = "Hello Eclipse from CS" + classNum.toString();
		return output;
	}
}
