package com.hacos.array.rotation.jugglingalgo;

public class JuglingAlgo {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		int displace = 3;
		int modifiedArr[] = new int[array.length];
		modifiedArr = rotateArray(array,displace,gcf(array.length,displace));
		for(int i = 0; i<modifiedArr.length; i++) {
			System.out.print(modifiedArr[i]+" ");
		}
	}

	private static int[] rotateArray(int[] array, int displace, int gcf) {
		
		int[] temp = new int[1];
		for(int j = 0; j<displace; j++) {
			int swapPos = j;
			temp[0] = array[j];
			while(true) {
			swapPos += gcf;
			if(swapPos>array.length-1) {
				array[swapPos-gcf] = temp[0];
				break;
			}else {
				array[swapPos-gcf] = array[swapPos];
			}
			}
		}
		
		return array;
	}

	private static int gcf(int length, int displace) {
		int gcf = 0;
		if(length==0) {
			gcf = displace;
		}else {
			gcf = gcf((length%displace), displace);
		}
		return gcf;
	}

}
