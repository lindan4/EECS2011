
public class BTNode implements Position<String>
{
	private String word;
	private int wordCounter = 0;
	private BTNode left, right, parent;
	

	public BTNode(String s, BTNode u, BTNode v, BTNode w)
	{
		this.setWord(s);
		this.setParent(u);
		this.setLeft(v);
		this.setRight(w);
	}
	
	@Override
	public String getElement() throws IllegalStateException 
	{
		return word;
	}
	
	private void setWord(String s)
	{
		this.word = s;
	}
	public int getWordCounter()
	{
		return wordCounter;
	}
	
	public void increaseWordCounter()
	{
		wordCounter++;
	}
	
	public BTNode getLeft()
	{
		return this.left;
	}
	
	public void setLeft(BTNode v)
	{
		this.left = v;
	}
	
	public BTNode getRight()
	{
		return this.right;
	}
	
	public void setRight(BTNode v)
	{
		this.right = v;
	}
	
	public BTNode getParent()
	{
		return this.parent;
	}
	
	public void setParent(BTNode v)
	{
		this.parent = v;
	}

}
