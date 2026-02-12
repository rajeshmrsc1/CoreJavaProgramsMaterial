package core.java.programs;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// count frequency of 0s and 1s int arr[]={0,0,1,0,0,1,1,0} 

		int arr[] = { 0, 0, 1, 0, 0, 1, 1, 0 };
		int countofZero = 0;
		int countofOne = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countofZero++;
			}

			if (arr[i] == 1) {
				countofOne++;
			}

		}

		System.out.println("Count Frequency of 0 in Array " + countofZero);
		System.out.println("Count Frequency of 1 in Array " + countofOne);
	}

}
