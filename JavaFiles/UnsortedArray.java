import java.util.Scanner;
import java.io.PrintStream;

public class UnsortedArray
{
	
	
	public static int recur(int n)
	{
		if (n == 0)
		{
			return n + 2 - 1;
		}
		else
		{
			return recur(n - 1) * 3 + 2;
		}
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		
		output.println(recur(1));
		//int[] unArray = new int[]{5, 3, 2, 1, 2};
	}
}
