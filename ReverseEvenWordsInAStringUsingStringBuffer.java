package powerJavaLearning;

public class ReverseEvenWordsInAStringUsingStringBuffer {

	/*Write a java program to do the following. 
	 * Input: "When the world realise its own mistakes, corona will dissolve automatically" 
	 * output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically"
	 * */

	public static void main(String[] args) {
		String input = "When the world realise its own mistakes, corona will dissolve automatically";
		String[] inputSplit= input.split(" ");


		//String Reversal Using append function
		System.out.println("Reversal using Append " );
		StringBuffer tempString01 = new StringBuffer();
		for (int i = 0; i < inputSplit.length; i++) {
			if ((i%2) != 0) {
				tempString01.append(new StringBuffer(inputSplit[i]).reverse()).append(" ");
			} else {
				tempString01.append(new StringBuffer(inputSplit[i])).append(" ");
			}
		}
		System.out.println(tempString01);


		//String Reversal Using reverse function
		System.out.println("Reversal using reverse " );
		for (int i = 0; i < inputSplit.length; i++) {
			if ((i%2) != 0) {
				StringBuffer tempString02 = new StringBuffer(inputSplit[i]);
				inputSplit[i] = tempString02.reverse().toString();
			}
		}
		for (int i = 0; i < inputSplit.length; i++) {
			System.out.print(inputSplit[i] + " ");
		}

	}

}
