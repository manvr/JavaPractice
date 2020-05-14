package powerJavaLearning;

public class FindSumOfNumbersApproachCharClass {
	/*Write a java code to find the sum of the given numbers 
	Input: "asdf1qwer9as8d7" 
	output: 1+9+8+7 = 25 */
	public static void main(String[] args) {
		String input ="asdf1qwer9as8d7";

		//using charArray operation
		System.out.println("logic using Character class");
		String numberFromString = input.replaceAll("\\D", "");
		int sumAp1=0;
		char[] charArray = numberFromString.toCharArray();
		for (int i = 0; i < numberFromString.length(); i++) {
			char charAt = charArray[i];
			sumAp1 += Integer.parseInt(String.valueOf(charAt)); 
		}
		System.out.println("Sum of Integers "+sumAp1);
		
	}
}
