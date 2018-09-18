/*
 * @Author Ayan
 */
package com.hacos.array.rotation.sortedrotated;

/**
 * The Class SortedRotated.
 */
public class SortedRotated {

	/*
	 * find an element from a sorted and rotated array. first find out the pivot element index, split
	 * array into two array based on that pivoted element check in which array 0th element is less
	 * than the element to be searched. perform Binary Search on that subarray
	 */

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int array[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int pivotIdx = findPivotIndex(array);
		performSearch(array, pivotIdx);
	}

	/**
	 * Perform search.
	 *
	 * @param array the array
	 * @param pivotIdx the pivot idx
	 */
	private static void performSearch(int[] array, int pivotIdx) {}

	/**
	 * Find pivot index.
	 *
	 * @param array the array
	 * @return the pivot index
	 */
	private static int findPivotIndex(int[] array) {
		return 0;
	}

}
