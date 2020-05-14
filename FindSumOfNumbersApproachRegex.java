package powerJavaLearning;

public class FindSumOfNumbersApproachRegex {
	/*Write a java code to find the sum of the given numbers 
	Input: "asdf1qwer9as8d7" 
	output: 1+9+8+7 = 25 */
	public static void main(String[] args) {
		String input ="asdf1qwer9as8d7";

		//using mathematical operation
		System.out.println("logic using mathematical operation");
		int number=Integer.parseInt(input.replaceAll("[^0-9]", ""));
		int sumAp2=0;
		while (number>0) {
			sumAp2=sumAp2+number%10;
			number=number/10;
		}

		System.out.println("Sum of Integers "+sumAp2);
	}
}
