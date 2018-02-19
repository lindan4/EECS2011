package DLL;

import java.io.IOException;

public class MessageAssembler {

	public static void main(String[] args) throws IOException
	{
		DLL myDLL = new DLL();
		myDLL.readAndAssemble("Mystery.txt");
		myDLL.printContent();
	
	}
}
