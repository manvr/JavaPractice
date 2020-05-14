package powerJavaLearning;

public class ReverseEvenWordsInAStringUsingIterate {

	/*Write a java program to do the following. 
	 * Input: "When the world realise its own mistakes, corona will dissolve automatically" 
	 * output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically"
	 * */

	public static void main(String[] args) {
		String input = "When the world realise its own mistakes, corona will dissolve automatically";
		String[] inputSplit= input.split(" ");


		//String Reversal Using iteration
		for (int i = 0; i < inputSplit.length; i++) {
			if (i%2 == 0) {
				System.out.print(inputSplit[i]+ " ");
			}else {
				int strLength=inputSplit[i].length();
				for (int j = strLength -1 ; j >= 0;  j--) {
					System.out.print(inputSplit[i].charAt(j));
					System.out.print("");
				}
				System.out.print(" ");
			}
			
		}

	}

}
