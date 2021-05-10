

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	 FizzBuzz testSubject;
	
	@Before
	public void init() {
		testSubject = new FizzBuzz();
	}
	
	@Test
	public void generateFizzBuzzTest() {
		String expectedResult1 = "1";
		String result1 = testSubject.generateFizzBuzz(1);
		
		String expectedResult2 = "2";
		String result2 = testSubject.generateFizzBuzz(2);
		
		assertEquals(result1, expectedResult1);
		assertEquals(result2, expectedResult2);
	}
	
	@Test
	public void generateFizzBuzzTestFizz() {
		String expectedResult1 = "Fizz";
		String result1 = testSubject.generateFizzBuzz(3);
		
		String expectedResult2 = "Fizz";
		String result2 = testSubject.generateFizzBuzz(6);
	
		
//		assertTrue(expectedResult1.equals(result1));
		assertEquals(result1, expectedResult1);
		assertEquals(result2, expectedResult2);
	}
	
	@Test
	public void generateFizzBuzzTestBuzz() {
		String expectedResult1 = "Buzz";
		String result1 = testSubject.generateFizzBuzz(5);
		
		String expectedResult2 = "Buzz";
		String result2 = testSubject.generateFizzBuzz(10);
	
		
//		assertTrue(expectedResult1.equals(result1));
		assertEquals(result1, expectedResult1);
		assertEquals(result2, expectedResult2);
	}
	
	@Test
	public void generateFizzBuzzTestFizzBuzz() {
		String expectedResult1 = "FizzBuzz";
		String result1 = testSubject.generateFizzBuzz(15);
		
	
		
//		assertTrue(expectedResult1.equals(result1));
		assertEquals(result1, expectedResult1);
	}
	
	@Test
	public void createFizzBuzzSequenece() {
		String expectedResult1 = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";
		String result1 = testSubject.createFizzBuzzSequence(15);
		
		System.out.println(result1);
		
//		assertTrue(expectedResult1.equals(result1));
		assertEquals(result1, expectedResult1);
	}

}
