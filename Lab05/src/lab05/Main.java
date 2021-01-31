package lab05;

import java.util.Arrays;

import lab05.ArrayFunctions;

public class Main {
	
	public static void main(String[] args) {
		int[]a1 = {1,9};
		int[]a2 = {8,2};
		int[]a3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(ArrayFunctions.toNumberArray(123)));//works
		System.out.println(Arrays.toString(ArrayFunctions.toNumberArray("7634")));//works
		System.out.println(Arrays.toString(ArrayFunctions.addNumberArrays(a1, a2)));
		System.out.println(Arrays.toString(ArrayFunctions.addNumberArrays(a1, a3)));
		System.out.println("Printing test");
		
	}

}
