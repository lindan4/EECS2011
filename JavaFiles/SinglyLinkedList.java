import java.util.Scanner;
import java.io.PrintStream;


public class SinglyLinkedList<E>
{
	
	private static class Node<E>
	{
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n)
		{
			element = e;
			next = n;
		}
		
		public E getElement()
		{
			return element;
		}
		
		public Node<E> getNext()
		{
			return next;
		}
		
		public void setNext(Node<E> n)
		{
			next = n;
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	
	private int size = 0;
	
	public SinglyLinkedList() {}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public E first()
	{
		if (isEmpty())
		{
			return null;
		}
		else
		{
			return head.getElement();
		}
	}
	
	public E last()
	{
		if (isEmpty())
		{
			return null;
		}
		else
		{
			return tail.getElement();
		}
	}
	
	public void addFirst(E e)
	{
		head = new Node<>(e, head);
		
		if (size == 0)
		{
			tail = head;
		}
		size++;
	}
	
	public void addLast(E e)
	{
		Node<E> newest = new Node<>(e, null);
		if (isEmpty())
		{
			head = newest;
		}
		else
		{
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	
	public E removeFirst()
	{
		if (isEmpty())
		{
			return null;
		}
		
		E answer = head.getElement();
		head = head.getNext();
		size--;
		
		//Here
		if (size == 0)
		{
			tail = null;
		}
		
		return answer;
		
	}
	
	
	/* Start here ----------------------------------------------------------------------*/
	public Node<E> secondToLast()
	{
		Node<E> curr;
		
		if (size() < 3)
		{
			return null;
		}
		else
		{
			for (curr = head; curr.getNext().getNext() != null; curr = curr.getNext())
				;
			
		}
		
	
		
		return curr;
	}
	
	public void rotate()
	{
		this.addLast(this.removeFirst());
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		int b = 5;
		sl.addFirst(5);
		sl.addFirst(7);
		sl.addFirst(9);
		sl.addFirst(11);
		
		Node<Integer> getSec = sl.secondToLast();
		output.println(getSec.getElement());
		
		
		
	}
	
	
	
	
}
