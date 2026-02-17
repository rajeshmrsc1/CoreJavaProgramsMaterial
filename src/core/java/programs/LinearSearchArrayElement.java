package core.java.programs;

public class LinearSearchArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// element to search in an array
		int[] age = { 55, 36, 14, 43, 67, 37, 6 };
		int key = 37; // element to search

		boolean found = false;
		for (int i = 0; i < age.length; i++) {

			if (age[i] == key) {
				System.out.println("element found at index " + i);
				found = true;
				break;
			}

		}
		if (!found) {

			System.out.println("Element not found ");

		}

	}

}
