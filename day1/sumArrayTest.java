package day1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class sumArrayTest {
	
	@Test
	public void testSum()
	{
		int a[] = {1,-1,2,-2};
		int actualSum = sumArray.sum(a);
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testSumRecursive()
	{
		int a[] = {1,-1,2,-2};
		int actualSum = sumArray.sumRecursive(a,a.length-1);
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	

}
