package core.java.programs;

public class LinearSerachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] city = { "delhi", "pune", "london", "paris", "tokyo" };
		String key = "pari";

		boolean find = false;

		for (int i = 0; i < city.length; i++) {
			if (city[i].equals(key)) {
				System.out.println("positon of index of london is " + i);
				find = true;
				break;
			}

		}
if (!find) {
	System.out.println("element not found ");
}
		
		
		
	}

}
