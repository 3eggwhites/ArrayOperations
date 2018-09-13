/*
 * @Author Ayan
 */
package com.hacos.array.rotation.jugglingalgo;

/**
 * The Class JuglingAlgo.
 */
public class JuglingAlgo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int array[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		int displace = 6;
		int modifiedArr[] = new int[array.length];
		modifiedArr = rotateArrayWithJugglingAlgo(array, displace, gcf(displace, array.length));
		for (int i = 0; i < modifiedArr.length; i++) {
			System.out.print(modifiedArr[i] + " ");
		}
	}

	/**
	 * Rotate array.
	 *
	 * @param array the array
	 * @param displace the displace
	 * @param gcf the gcf
	 * @return the int[]
	 */
	private static int[] rotateArrayWithJugglingAlgo(int[] array, int displace, int gcf) {

		int temp, gettingSwapped, tobeSwapped;
		for (int j = 0; j < gcf; j++) {
			gettingSwapped = j;
			temp = array[j];
			while (true) {
				tobeSwapped = gettingSwapped + displace;
				if (tobeSwapped >= array.length) {
					tobeSwapped = tobeSwapped - array.length;
				}
				if (tobeSwapped == j) {
					break;
				}
				array[gettingSwapped] = array[tobeSwapped];
				gettingSwapped = tobeSwapped;
			}
			array[gettingSwapped] = temp;
		}

		return array;
	}

	/**
	 * Gcf.
	 *
	 * @param displace the displace
	 * @param length the length
	 * @return the int
	 */
	private static int gcf(int displace, int length) {
		if (length == 0) {
			return displace;
		} else {
			return gcf(length, (displace % length));
		}
	}

}
