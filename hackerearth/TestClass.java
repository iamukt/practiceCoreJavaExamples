package hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long output;
		long result;
		long no1, no2;
		List<Long> inputSet = new LinkedList<>();
		List<List<Long>> outputSet = new LinkedList<>();
		Long noTestCase;
		noTestCase = sc.nextLong();
		for (int i = 0; i < noTestCase; i++) 
		{
			inputSet = new LinkedList<>();
			for (int j = 0; j < 2; j++) {
				inputSet.add(sc.nextLong());
			}
			outputSet.add(inputSet);
		}
		for (List<Long> s : outputSet) 
		{
			no1 = s.get(0);
			no2 = s.get(1);
			result = no2;
			while (result >= 2) 
			{
				output = (long) (Math.log(result) / Math.log(2));
				System.out.print("(" + no1 + "<<" + output + ")");
				result-=  (long) Math.pow(2, output);
				if (result != 0)
					System.out.print(" + ");
			}
			if (result != 0)
				System.out.print("(" + no1 + "<<" + 0 + ")");
			System.out.println();
		}
	}
}
