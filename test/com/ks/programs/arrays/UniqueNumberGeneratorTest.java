package com.ks.programs.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Requirement : Write a class with three methods which returns array with no duplicates
 * Coding Style : Using Test driven Development with Junit
 * @author sudhish koloth
 *
 */
public class UniqueNumberGeneratorTest {

	private UniqueNumberGenerator uniqueNumber;

	@Before
	public void setUp() throws Exception {
		uniqueNumber  = new UniqueNumberGenerator();
	}
	

	@Test
	public void testGivenIntArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersUsingListMethodCalledThenReturnUniqueIntArray() {
		//given
		int[] inputArray = {1,15,27,1,3,7,2,1,8,12,4,12,54};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersUsingList(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {1,15,27,3,7,2,8,12,4,54};
		int expectedlength  = expectedArray.length;
		Assert.assertTrue(expectedlength == actualLength);
		Assert.assertArrayEquals(expectedArray, actualArrays);
	}

	@Test
	public void testGivenEmptyArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersUsingListMethodCalledThenReturnEmptyArray() {
		//given
		int[] inputArray = new int[]{};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersUsingList(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {};
		int expectedlength  = expectedArray.length;
		Assert.assertTrue(expectedlength == actualLength);
		Assert.assertArrayEquals(expectedArray, actualArrays);
	}

	@Test
	public void testGivenIntArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersUsingHashSetMethodCalledThenReturnUniqueIntArrayButWithOutOrder(){
		//given
		int[] inputArray = {1,5,7,1,3,7,2,1,8,12,54,12,54};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersUsingHashSet(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {1,5,7,3,2,8,12,54};
		int expectedlength  = expectedArray.length;
		Assert.assertTrue(expectedlength == actualLength);
		Assert.assertNotEquals(expectedArray, actualArrays);
	}


	@Test
	public void testGivenIntArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersUsingLinkedHashSetMethodCalledThenReturnUniqueIntArrayInSameOrder(){
		//given
		int[] inputArray = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersUsingLinkedHashSet(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {1,2,34,25,45,3,26,85,4,86,43,10000,11,16,19,18,9,20,17,8,15,6,5,10,14,12,13,7};
		int expectedlength  = expectedArray.length;
		Assert.assertTrue(expectedlength == actualLength);
		Assert.assertArrayEquals(expectedArray, actualArrays);
	}

	@Test
	public void testGivenEmptyArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersUsingSetMethodCalledThenReturnEmptyArray() {
		//given
		int[] inputArray = new int[]{};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersUsingList(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {};
		int expectedlength  = expectedArray.length;
		Assert.assertTrue(expectedlength == actualLength);
		Assert.assertArrayEquals(expectedArray, actualArrays);
	}

	@Test
	public void testGivenIntArrayWithRandomNumberWithDuplicatesWhenGenerateArrayWithUniqueNumbersWithoutUsingCollectionsMethodCalledThenReturnDifferentArrayLength() {
		//given
		int[] inputArray = {1,15,27,1,3,7,2,1,8,12,4,12,54};

		//when
		int[] actualArrays = uniqueNumber.generateArrayWithUniqueNumbersWithoutUsingCollections(inputArray);
		int actualLength = actualArrays.length;

		//Then
		int[] expectedArray = {1,15,27,3,7,2,8,12,4,54};
		int expectedlength  = expectedArray.length;
		Assert.assertFalse(expectedlength == actualLength);
	}

	@After
	public void tearDown() throws Exception {
		uniqueNumber = null;
	}



}
