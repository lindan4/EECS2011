
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class BinarySearchTree extends LinkedBinaryTree
{
	
	private BTNode root;
	private int maxPathLength = 0;
	private int mostFrequentWordCount = 0;
	
	
	public BinarySearchTree()
	{}
	
	
	public BTNode getRoot()
	{
		return root;
	}
	public void readIn(String fileName) throws IOException
	{
		BufferedReader fileInput = new BufferedReader(new FileReader(new File(fileName)));
		String line;
		String lineFragment;
		
		BTNode accessNode;
		
		while ((line = fileInput.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(line);
			
			while (st.hasMoreTokens())
			{
				lineFragment = st.nextToken().toLowerCase().replaceAll("[^a-zA-Z]", "");
				int pathLength = 0;

				if (root == null)
				{
					root = new BTNode(lineFragment, null, null, null);
					root.increaseWordCounter();
				}
				else
				{
					BTNode placeNode = new BTNode(lineFragment, null, null, null);
					placeNode.increaseWordCounter();
					accessNode = root;
					
					while (accessNode != null)
					{
						//Take care of left
						if (placeNode.getElement().compareTo(accessNode.getElement()) < 0)
						{
							maxPathLength = Math.max(maxPathLength, ++pathLength);
							if (accessNode.getLeft() == null)
							{
								placeNode.setParent(accessNode);
								accessNode.setLeft(placeNode);
								break;
							}
							else
							{
								accessNode = accessNode.getLeft();
							}
						}
						else if (placeNode.getElement().compareTo(accessNode.getElement()) == 0)
						{
							accessNode.increaseWordCounter();
							break;
						}
						else
						{
							maxPathLength = Math.max(maxPathLength, ++pathLength);
							if (accessNode.getRight() == null)
							{
								placeNode.setParent(accessNode);
								accessNode.setRight(placeNode);
								break;
							}
							else
							{
								accessNode = accessNode.getRight();
							}
						}	
					}
				}
			}
		}
		fileInput.close();
	}
	
	public int maxSearchPath()
	{
		return maxPathLength;
	}
	
	public void printWordsSorted()
	{
		System.out.print("\n");
		ArrayList<BTNode> orderedNodes = new ArrayList<BTNode>();
		inOrder(orderedNodes, root);
		for (BTNode s : orderedNodes)
		{
			System.out.println(s.getElement());
		}
		System.out.print("\n");
	}
	
	private void inOrder(ArrayList<BTNode> btNodes, BTNode bt)
	{
		if (bt != null)
		{
			inOrder(btNodes, bt.getLeft());
			btNodes.add(bt);
			inOrder(btNodes, bt.getRight());
		}
	}



	public void printTenMostCommonWords()
	{
		ArrayList<BTNode> bts = new ArrayList<BTNode>();
		inOrder(bts, root);
		ArrayList<String> rt = this.rankedList(bts);
		int lim = (rt.size() < 10) ? rt.size() : 10;
		for (int i = 0; i < lim; i++)
		{
			System.out.println(rt.get(i));
		}
	}
	
	private ArrayList<String> rankedList(ArrayList<BTNode> abt)
	{
		ArrayList<String> at = new ArrayList<String>();
		TreeSet<Integer> atInt = new TreeSet<Integer>();
		for (BTNode b : abt)
		{
			atInt.add(b.getWordCounter());
		}
		Iterator<Integer> it = atInt.descendingIterator();
		while (it.hasNext())
		{
			int j = it.next();
			for (BTNode t : abt)
			{
				if (j == t.getWordCounter())
				{
					at.add(t.getElement() + " " + t.getWordCounter());
				}
			}
		}
		return at;
	}
	

}
