package day1;

public class sumArray  {

	/**
	* Accepts array of integers and returns sum
	* @param a - Integer array
	* @return sum -Sum of elements in array
	* Time complexity : O(n)
	 * @throws Exception 
	*/
	int sum(int[] elements) throws Exception
	{
		if (elements == null) throw new NullPointerException("Array is null");
		int sum = 0;
		for(int i:elements)
			sum+=i;
		return sum;
	}
	int sumRecursive(int[] elements, int xunit) throws Exception
	{
		if (elements == null) throw new NullPointerException("Array is null");
        if (xunit < 0) 
           return 0;
        return sumRecursive(elements, xunit-1 ) + elements[xunit];
    }

}
