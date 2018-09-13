/*
 * @Author Ayan
 */
package com.hacos.array.rotation.cyclicrotation;

/**
 * The Class CyclicRotation.
 */
public class CyclicRotation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] cyclicArr = new int[] {1, 2, 3, 4, 5};
		int rotate = 3;
		rotateArray(cyclicArr, rotate);
		printArray(cyclicArr);
	}

	/**
	 * Rotate array.
	 *
	 * @param cyclicArr the cyclic arr
	 * @param rotate the rotate
	 */
	/*
	 * rotation logic for cyclic rotation. take the first element of the array, store it into a temp
	 * variable, then shift all the elements to the left by one. at the last position place the temp
	 * variable data.
	 */
	private static void rotateArray(int[] cyclicArr, int rotate) {
		for (int i = 0; i < rotate; i++) {
			int temp = cyclicArr[0];
			int prevIdx = 0;
			int nextIdx = prevIdx + 1;
			while (nextIdx < cyclicArr.length) {
				cyclicArr[prevIdx] = cyclicArr[nextIdx];
				prevIdx++;
				nextIdx = prevIdx + 1;;
			}
			cyclicArr[prevIdx] = temp;
		}

	}
	/*
	 * Utility function to print the modified array
	 */

	/**
	 * Prints the array.
	 *
	 * @param cyclicArr the cyclic arr
	 */
	private static void printArray(int[] cyclicArr) {
		for (int i = 0; i < cyclicArr.length; i++) {
			System.out.print(cyclicArr[i] + " ");
		}

	}

}
