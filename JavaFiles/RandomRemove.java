import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;

public class RandomRemove
{
	private static void printArray(int[] c)
	{
		for (int i = 0; i < c.length; i = i + 1)
		{
			System.out.println(c[i]);
		}
	}
	/*
	public static void removeRandomElements(int[] a)
	{
		Random numGen = new Random();
		
		
		while (a.length > 0)
		{
			//Unless you specify some elements, do not type square brackets
			int[] newArray = new int[a.length - 1];
			
			int removeAt = numGen.nextInt(a.length);
			for (int i = 0; i < removeAt; i = i + 1)
			{
				newArray[i] = a[i];
			}
			for (int j = removeAt; j < a.length - 1; j = j + 1)
			{
				newArray[j] = a[j + 1];
			}
			a = newArray;
		}
		
		
	}
	*/
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		int[] b = new int[]{2, 6, 5, 4};
		//RandomRemove.removeRandomElementInt(b);
		
		RandomRemove.printArray(b);
		
		Random numGen = new Random();
		
		
		while (b.length > 0)
		{
			//Unless you specify some elements, do not type square brackets
			int[] newArray = new int[a.length - 1];
			
			int removeAt = numGen.nextInt(a.length);
			for (int i = 0; i < removeAt; i = i + 1)
			{
				newArray[i] = a[i];
			}
			for (int j = removeAt; j < a.length - 1; j = j + 1)
			{
				newArray[j] = a[j + 1];
			}
			a = newArray;
		}
		
		
	}
}