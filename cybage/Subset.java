package cybage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset 
{
	private static Scanner sc = new Scanner(System.in);
	private static int[] inputTestCase = new int[2];
	private static List<Integer> output;
	private static List<Integer> outputBuffer;
	private static int firstIndex;

	// main method
	public static void main(String[] args) {

		outputBuffer = new ArrayList<>();

		// Calling the accept method and returning the accepted array
		// Temporary output buffer created and input values stored in it
		outputBuffer.addAll(accept());

		output = checkOutput();

		System.out.println(output);
		System.out.println(output.size());
		
	}

	public static List<Integer> accept()
	{
		inputTestCase[0] = sc.nextInt();
		inputTestCase[1] = sc.nextInt();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < inputTestCase[0]; i++)
			input.add(sc.nextInt());
		return input;
	}

	public static void mainLogic(List<Integer> testInput) 
	{
		for (int j = firstIndex + 1; j < testInput.size(); j++) 
			if ((testInput.get(firstIndex) + testInput.get(j)) % inputTestCase[1] == 0)
				// Remove the anomalies
				testInput.remove(j);
		firstIndex++;
	}

	public static List<Integer> checkOutput() 
	{
		while (firstIndex != outputBuffer.size()) 
			mainLogic(outputBuffer);
		return outputBuffer;
	}
}
