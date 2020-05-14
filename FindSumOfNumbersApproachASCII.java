package powerJavaLearning;

/*Write a java code to find the sum of the given numbers 
Input: "asdf1qwer9as8d7" 
output: 1+9+8+7 = 25 */

public class FindSumOfNumbersApproachASCII {

	public static void main(String[] args) {
		String input ="asdf1qwer9as8d7";
		char[] array = input.toCharArray();
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			if((int)array[i]>=48 && (int)array[i]<=57) {
				sum+=Character.getNumericValue(array[i]);
			}
			System.out.println("integer " +Character.getNumericValue(array[i]));
		}
		System.out.println("Sum of Integers "+ sum);
	}
}
