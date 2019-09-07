
public class test_class {

	
	public static void main(String[] args){
		int n = 1;
		double[] d = AlgorithmLab.randomArray(n);
		
		long time = System.nanoTime();
		AlgorithmLab.algorithm7(n);
		System.out.println((System.nanoTime()-time)/1000000000.0);
	}
}
