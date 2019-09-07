import static org.junit.Assert.*;

import org.junit.Test;

public class test_case {

	
	@Test(timeout = 100)
	public void test1(){
		int whichVersion = 0;
		String expression = "10*4";
		assertTrue(Expression.isValid(whichVersion, expression));
		
	}
	
	@Test(timeout = 100)
	public void test2(){
		int whichVersion = 7;
		String expression = "10*+4";
		assertTrue(Expression.isValid(whichVersion, expression));
		
	}
	
	@Test(timeout = 100)
	public void test3(){
		int whichVersion = 7;
		String expression = "10";
		assertTrue(Expression.isValid(whichVersion, expression));
		
	}
	
	@Test(timeout = 100)
	public void test4(){
		int whichVersion = 2;
		String expression = "?";
		assertTrue(Expression.isValid(whichVersion, expression));
		
	}
	
	@Test(timeout = 100)
	public void test5(){
		int whichVersion = 3;
		String expression = "2.2";
		assertTrue(Expression.isValid(whichVersion, expression));
		
	}

}
