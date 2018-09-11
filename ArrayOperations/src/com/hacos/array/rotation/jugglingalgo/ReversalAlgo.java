package com.hacos.array.rotation.jugglingalgo;

import java.util.Arrays;

/*Idea of this algorithm is to first divide the main array in two parts, one from 0 to number of rotations to be performed and other is from number of rotations to the last array element.
now reverse both the arrays, them merge them as they are and reverse the whole merged array again to find the final product.*/

public class ReversalAlgo {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		int rotation = 3;
		int modifiedArray[] = new int[array.length];
		
		modifiedArray = rotateReverseAlgo(array,rotation);
		
		for(int i = 0; i<modifiedArray.length;i++) {
		System.out.print(modifiedArray[i]);
		}

	}

	private static int[] rotateReverseAlgo(int[] array, int rotation) {
		
		
		return null;
	}

}

