import java.util.Scanner;
import java.io.PrintStream;


public class dubHash
{
	
	private dubHash
	{}
	
	public static int specialDubHash(int k)
	{
		return (7 - (k % 7));
	}
	
	public static int givenHash(int k, int size)
	{
		return (3*k + 5) % size;
	}
	
	public static int[] hashedArray(int[] a)
	{
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		int[] a = new int[]{12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
	}
}
