/***************************************
* EECS2011: Assignment 1               *
* File name: DLLNode.java              *
* Author: Thillanayagam, Lindan        *
* Email: lindan4@my.yorku.ca           *
* Login ID: lindan4                    *
****************************************/

public class DLLNode 
{
	private int packetID;
	private String packetContent;
	private DLLNode prev;
	private DLLNode next;
	
	public DLLNode(int packetID, String packetContent, DLLNode prev, DLLNode next)
	{
		this.setPacketID(packetID);
		this.setPacketContent(packetContent);
		this.setPrevNode(prev);
		this.setNextNode(next);
	}
	
	public int getPacketID()
	{
		return this.packetID;
	}
	
	private void setPacketID(int packetID)
	{
		this.packetID = packetID;
	}
	
	public String getPacketContent()
	{
		return this.packetContent;
	}
	
	private void setPacketContent(String packetContent)
	{
		this.packetContent = packetContent;
	}
	
	public DLLNode getNextNode()
	{
		return this.next;
	}
	
	public void setNextNode(DLLNode next)
	{
		this.next = next;
	}
	
	public DLLNode getPrevNode()
	{
		return this.prev;
	}
	
	public void setPrevNode(DLLNode prev)
	{
		this.prev = prev;
	}
	

}
