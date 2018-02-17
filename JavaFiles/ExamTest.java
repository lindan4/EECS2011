import java.util.Scanner;
import java.io.PrintStream;

public class ExamTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		
		int i=1;
		int sum=0;
		//int n = 4;
		double power = Math.pow(4.0, 2.0);
		
		while (i < (int) power) 
		{
			for (int j = (int) power; j >= 1; j=j/2) 
			{
				sum++;			
				output.println(i + " " + j);

			}
			i += 2;
		} 
	}
}