package core.java.programs;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// find the first non -repeating character from string. String str="swiss" output=w
		String country = "swiss";

		for (int i = 0; i < country.length(); i++) {

			if (country.indexOf(country.charAt(i)) == country.lastIndexOf(country.charAt(i))) {
				System.out.println("The First NonRepeating Character of String is " + country.charAt(i));
				break;
			}

		}

	}

}
