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
		int array[] = new int[] {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
		int pivotIdx = findPivotIndex(array);
		int searchDigit = 11;
		performSearch(array, pivotIdx, searchDigit);
	}

	/**
	 * Perform search.
	 *
	 * @param array the array
	 * @param pivotIdx the pivot idx
	 * @param searchDigit
	 */
	private static void performSearch(int[] array, int pivotIdx, int searchDigit) {
		int leftArr[] = new int[pivotIdx + 1];
		int rightArr[] = new int[array.length - (pivotIdx + 1)];
		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = array[i];
		}
		int rightIdx = 0;
		int searchElemIdx = -1;
		for (int i = pivotIdx + 1; i < array.length; i++) {
			rightArr[rightIdx] = array[i];
			rightIdx++;
		}
		if (leftArr[0] > searchDigit) {
			searchElemIdx = performBS(array, pivotIdx+1, array.length - 1, searchDigit);
		} else {
			searchElemIdx = performBS(array, 0, pivotIdx, searchDigit);
		}
		System.out.println(searchElemIdx);
	}

	private static int performBS(int[] searchArray, int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
			if (searchArray[mid] == x) {
				return mid;
			} else if (searchArray[mid] > x) {
				return performBS(searchArray, left, mid - 1, x);
			} else {
				return performBS(searchArray, mid + 1, right, x);
			}
		}
		return -1;
	}

	/**
	 * Find pivot index.
	 *
	 * @param array the array
	 * @return the pivot index
	 */
	private static int findPivotIndex(int[] array) {
		int pivotIdx = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				pivotIdx = i - 1;
				break;
			}
		}
		return pivotIdx;
	}

}
