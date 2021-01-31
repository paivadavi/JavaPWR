package lab05;

public class ArrayFunctions {

	static int[] toNumberArray(int n) {// works
		// It has to receive an integer and turn it into an array.
		String stringNumber = "";
		stringNumber += n;

		int[] numberArray = new int[stringNumber.length()];

		for (int i = 0; i < stringNumber.length(); i++) {
			numberArray[i] = Character.getNumericValue(stringNumber.charAt(i));// Study this line

		}

		return numberArray;

	}

	static int[] toNumberArray(String value) {// works
		int[] numberArray = new int[value.length()];
		for (int i = 0; i < value.length(); i++) {
			numberArray[i] = Character.getNumericValue(value.charAt(i));// Study this line

		}

		return numberArray;

	}

	static int[] addNumberArrays(int[] a1, int[] a2) {

		int length = 0;
		if (a1.length > a2.length) {
			length = a1.length;
		} else {
			length = a2.length;
		}

		int[] resultArray = new int[length];

		// ANOTHER METHOD
		// Add the two elements and if sum is bigger than 10, add 1 to the next sum.
		int sum = 0;
		int rest = 0;
		if (a1.length > a2.length) {
			for (int i = a1.length - 1; i >= 0; i--) {
				sum = a1[i] + a2[i] + rest;
				if (sum >= 10) {
					rest = 1;
					resultArray[i] = sum % 10;
				} else {
					resultArray[i] = sum + rest;
					rest = 0;
				}
			}
		} else if (a2.length > a1.length) {
			for (int i = a2.length - 1; i >= 0; i--) {
				if (i > 0) {
					int j = i - 1;
					sum = a1[j] + a2[i] + rest;
					if (sum >= 10) {
						rest = 1;
						resultArray[i] = sum % 10;
					} else {
						resultArray[i] = sum;
						rest = 0;

					}

				} else {
					sum = a2[i] + rest;
					if (sum >= 10) {
						rest = 1;
						resultArray[i] = sum % 10;
					} else {
						resultArray[i] = sum + rest;
						rest = 0;
					}

				}
				
			}

			if (a1.length == a2.length) {
				for (int i = a1.length - 1; i >= 0; i--) {
					sum = a1[i] + a2[i] + rest;
					if (sum >= 10) {
						rest = 1;
						resultArray[i] = sum % 10;
					} else {
						resultArray[i] = sum + rest;
						rest = 0;
					}
				}
			}
		}
		return resultArray;
	}

}

