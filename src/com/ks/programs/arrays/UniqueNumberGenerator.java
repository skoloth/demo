package com.ks.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberGenerator {
	
	
	/**
	 * Solution1 : Using ArrayList and comparing with already added elements to remove duplicate but performance is not good.
	 * @param input
	 * @return
	 */
	public int[] generateArrayWithUniqueNumbersUsingList(int[] input) {
		//the size grows dynamically
		List<Integer> result = new ArrayList<Integer>();

	    for(int i=0; i<input.length; i++)
	    {
	        boolean match = false;
	        for(int j=0; j<result.size(); j++)
	        {
	            //if the list contains any input element make match true
	            if(result.get(j) == input[i])
	                match = true;
	        }
	        //if there is no matching we can add the element to the result list
	        if(!match)
	            result.add(input[i]);
	    }
		return convertToIntArray(result);
	}
	
	/**
	 * Solution2: Using LinkedHasSet for removing duplicates and but do not preserve order as hashset only removes duplicates
	 * @param input
	 * @return
	 */
	public int[] generateArrayWithUniqueNumbersUsingHashSet(int[] inputArray) {
		Set<Integer> asList = new HashSet<Integer>(inputArray.length);
		for(int i : inputArray) {
			asList.add(i);
		}
		return convertToIntArray(asList);
	}

	/**
	 * Solution3: Using LinkedHasSet for removing duplicates and too preserve order. This is most preferable approach due to linkedHashSet.
	 * @param input
	 * @return
	 */
	public int[] generateArrayWithUniqueNumbersUsingLinkedHashSet(int[] inputArray) {
		Set<Integer> asList = new LinkedHashSet<Integer>(inputArray.length);
		for(int i : inputArray) {
			asList.add(i);
		}
		return convertToIntArray(asList);
	}
	
	/**
	 * Solution4: Iterating arrays and checking if duplicate exist and replacing, but as arrays is fixed size, this approach is not effective and doesn't work.
	 * @param input
	 * @return
	 */
	public int[] generateArrayWithUniqueNumbersWithoutUsingCollections(int[] a) {
		Arrays.sort(a);
		int[] result = new int[a.length];
		int count=0;
		for(int i=1;i<a.length;i++){
		if(a[i]!=a[i-1]){
		result[count]=a[i-1];
		count++;
		} 
		if( (i==a.length-1 && a[i-1]!=a[i])){
		result[count]=a[i];
		}

		}
       return result;
	}
	
	

	private int[] convertToIntArray(Collection<Integer> asList) {
		int[] outputArray = new int[asList.size()];
		int index = 0;
		for(Integer i : asList) {
			outputArray[index++] = i;
		}
		return outputArray;
	}

	

}
