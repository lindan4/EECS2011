import java.util.Scanner;
import java.io.PrintStream;


public class SpecialSort
{
	private SpecialSort()
	{}
	
	public static int arrayIndexOf(int[] b, int target)
	{
		int i;
		for (i = 0; i < b.length; i++)
		{
			if (b[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void numSort(int[] a, int k, int index)
	{
		//Hmm? Am I making this out to be more complicated
		int kIndex = SpecialSort.arrayIndexOf(a, k);
		
		if (index < 0)
		{
		}
		else
		{
			
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
	}
}