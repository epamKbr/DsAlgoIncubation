package day1;

public class sumArray {

	/**
	* Accepts array of integers and returns sum
	* @param a - Integer array
	* @return sum -Sum of elements in array
	* Time complexity : O(n)
	*/
	static int sum(int[] elements)
	{
		int sum = 0;
		for(int i:elements)
			sum+=i;
		return sum;
	}
	static int sumRecursive(int[] elements, int xunit)
	{
        if (xunit < 0) 
           return 0;
        return sumRecursive(elements, xunit-1 ) + elements[xunit];
    }

}
