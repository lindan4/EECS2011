import java.util.Scanner;
import java.io.PrintStream;


public class cmpTo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		String s = "Hello";
		String t = "Hellt";
		
		output.println(s.compareTo(t));
		
	}
}