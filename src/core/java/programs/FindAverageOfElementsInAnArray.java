package core.java.programs;

public class FindAverageOfElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 10, 22, 65, 4, 78 };
		int sum = 0;
		for (int i = 0; i < a1.length; i++) {

			sum = sum + a1[i];

		}
		double average =(double) sum / a1.length;
		System.out.println("average of Array " + average);

	}

}
