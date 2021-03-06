import java.util.Scanner;
import java.io.PrintStream;

public class insertionSorting
{
	public static void insertionSort(char[] data)
	{
		int n = data.length;
	
		for (int k = 1; k < n; k = k + 1)
		{
			char cur = data[k];
			int j = k;
		
			while (j > 0 && data[j-1] > cur)
			{
				data[j] = data[j-1];
				j--;
			}
			data[j] = cur;
		}
	}


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
	
		char myArray[] = {'A', 'B', 'D', 'C'};
	
		Sorting.insertionSort(myArray);
		
		for (int i = 0; i < myArray.length; i = i + 1)
		{
			output.println(myArray[i] + "\n");
		}
	}
}
