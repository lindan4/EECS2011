import java.util.Scanner;
import java.io.PrintStream;

public class UniqueFour
{
	public static boolean isUnique(int[] a, int b, int c)
	{
		//How do you see yourself doing this?
		//{3, 8, 4, 5, 6, 4}
		//{3, 8}, {3, 4}, {3, 5}
		if (b > c)
		{
			return false;
		}
		else if (b == a.length - 1)
		{
			return true;
		}
		else
		{
			//System.out.println("b:" + b + "\n" + "c:" + c + "\n");
			if (a[b] == a[c])
			{
				return false;
			}
			else
			{
				return (c == a.length - 1) ? isUnique(a, b + 1, b + 2) : isUnique(a, b, c + 1);
			}	
			
				
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		int[] a = new int[]{2, 3, 6, 5};
		output.println(UniqueFour.isUnique(a, 0, 1));
		
	}
}