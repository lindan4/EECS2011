package DLL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DLL 
{
	
	private DLLNode header;
	private DLLNode trailer;
	
	private int size = 0;
	
	public DLL()
	{
		header = new DLLNode(-1, null, null, trailer);
		trailer = new DLLNode(-1, null, header, null);
	}
	
	public void readAndAssemble(String fileName) throws IOException
	{
		BufferedReader fileInput = new BufferedReader(new FileReader(new File(fileName)));
		String line;
		
		while ((line = fileInput.readLine()) != null)
		{
			
			String[] separateLine = line.split("\t");
			int packID = Integer.parseInt(separateLine[0]);
			String packContent = separateLine[1];
			//System.out.println(packContent);
			
			
			 
			DLLNode startPoint = header.getNextNode();
			DLLNode prevNode;
			
			//You need to order the nodes
			
			//Problem, after packet 1055 the program interprets 1124 as 11
			//Sol: use the BufferedReader class
			DLLNode myNode;
			
			if (this.getSize() == 0)
			{
				myNode = new DLLNode(packID, packContent, header, trailer);
				header.setNextNode(myNode);
				trailer.setPrevNode(myNode);
			}
			
			else
			{
				
				while (startPoint.getPacketID() != -1 && startPoint.getPacketID() < packID)
				{
					startPoint = startPoint.getNextNode();
				}
				
				prevNode = startPoint.getPrevNode();
				
				myNode = new DLLNode(packID, packContent, prevNode, startPoint);
				prevNode.setNextNode(myNode);
				startPoint.setPrevNode(myNode);
			
			}
			size++;
			
		}
	
	}
	
	public void printContent()
	{
		int packPerLine = 0;
		DLLNode start = header.getNextNode();
		
		while (start.getPacketID() != -1)
		{
			System.out.print(start.getPacketContent() + " ");
			start = start.getNextNode();
			packPerLine++;
			
			if (packPerLine % 11 == 0)
			{
				System.out.print("\n");
			}
		}
	}
	
	public int getSize()
	{
		return size;
	}

}
