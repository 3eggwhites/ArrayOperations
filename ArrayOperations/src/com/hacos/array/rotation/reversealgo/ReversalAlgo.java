/*
 * @Author Ayan
 */
package com.hacos.array.rotation.reversealgo;


/*
 * Idea of this algorithm is to first divide the main array in two parts, one from 0 to number of
 * rotations to be performed and other is from number of rotations to the last array element. now
 * reverse both the arrays, them merge them as they are and reverse the whole merged array again to
 * find the final product.
 */

/**
 * The Class ReversalAlgo.
 */
public class ReversalAlgo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int array[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int rotation = 3;
		int modifiedArray[] = new int[array.length];

		modifiedArray = rotateWithReverseAlgo(array, rotation);

		for (int i = 0; i < modifiedArray.length; i++) {
			System.out.print(modifiedArray[i] + " ");
		}

	}

	/**
	 * Rotate with reverse algo.
	 *
	 * @param array the array
	 * @param rotation the rotation
	 * @return the int[]
	 */
	private static int[] rotateWithReverseAlgo(int[] array, int rotation) {
		reverse(array, 0, rotation - 1);
		reverse(array, rotation, array.length - 1);
		reverse(array, 0, array.length - 1);

		return array;
	}

	/**
	 * Reverse.
	 *
	 * @param array the array
	 * @param start the start
	 * @param end the end
	 */
	// reversing array elements part by part
	private static void reverse(int[] array, int start, int end) {
		int count = 0;
		while (true) {
			int startIdx = start + count;
			int btmIdx = end - count;
			if (startIdx == btmIdx || ((btmIdx - startIdx) < 0)) {
				break;
			}
			int topElem = array[startIdx];
			int btmElem = array[btmIdx];
			array[start + count] = btmElem;
			array[end - count] = topElem;
			count++;
		}

	}

}

