/***************************************
* EECS2011: Assignment 1               *
* File name: MessageAssembler.java     *
* Author: Thillanayagam, Lindan        *
* Email: lindan4@my.yorku.ca           *
* Login ID: lindan4                    *
****************************************/


import java.io.IOException;

public class MessageAssembler {

	public static void main(String[] args) throws IOException
	{
		DLL myDLL = new DLL();
		myDLL.readAndAssemble("Mystery.txt");
		myDLL.printContent();
	
	}
}
