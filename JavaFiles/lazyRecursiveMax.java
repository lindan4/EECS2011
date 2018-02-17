import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;

public class lazyRecursiveMax
{
	private static void printIntArray(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i] + "\n");
		}
	}
	
	
	//Problem: any way of holding the largest element?
	//Problem: any way of getting max without altering array?
	public static int maxNumber(int[] a, int start) throws ArrayIndexOutOfBoundsException
	{
		int maximum = 0;
		
		if (a.length == 1)
		{
			return a[0];
		}
		//Thought: make the array smaller
		if (start == (a.length - 1))
		{
			return Math.max(a[start - 1], a[start]);
		}
		else if (start > (a.length - 1) || start < 0 || a.length == 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			maximum = Math.max(a[start], recursiveMax.maxNumber(a, start + 1));
			/*
			recursiveMax.maxNumber(a, start + 1);
			maximum = Math.max(a[start], a[start + 1]);
			System.out.println("Stage: " + a[start] + " " + a[start + 1] + " " + maximum);
			a[start] = a[start + 1] = maximum;
			*/
		}
		return maximum;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		int[] myArray = new int[]{0, 4, 8, 12, 5};
		output.println("Before: ");
		recursiveMax.printIntArray(myArray);
		
		int largeNumber = recursiveMax.maxNumber(myArray, 0);
		
		output.println("Max: " + largeNumber);
		
		output.println("\nAfter: ");
		recursiveMax.printIntArray(myArray);
	}
	
	
}