package powerJavaLearning;

public class FindSumOfNumbersApproachCharClass {
	/*Write a java code to find the sum of the given numbers 
	Input: "asdf1qwer9as8d7" 
	output: 1+9+8+7 = 25 */
	public static void main(String[] args) {
		String input ="asdf1qwer9as8d7";

		//using Character class  operation
		System.out.println("logic using Character class");
		int sum=0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(input.charAt(i)))
			} 
		}
		System.out.println("Sum of Integers "+sum);
		
	}
}
