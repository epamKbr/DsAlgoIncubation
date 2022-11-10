package day1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class sumArrayTest {
	
    private static sumArray sumArray;
    int smallArray[] ={1,-1,2,-2};
    int nullArray[] =null;
    
	@BeforeAll
	public static void init() 
	{
	    sumArray = new sumArray();
    }
	
	@Test
	public void testSum() throws Exception
	{
		
		int actualSum = sumArray.sum(smallArray);
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testSumRecursive() throws Exception
	{
		int actualSum = sumArray.sumRecursive(smallArray,smallArray.length-1);
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testSumNull() throws Exception
	{
		Exception e = assertThrows(NullPointerException.class, () -> sumArray.sum(nullArray));
		System.out.println(e.getMessage());
	}
	
}
