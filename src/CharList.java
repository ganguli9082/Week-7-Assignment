import java.util.ArrayList;
import org.omg.CORBA.Current;

public class CharList {
	private CharNode list;
	private int j;
	public CharList()
	{
		char list[] = null;
	}

	
	public void enqueue(char character)
	{
		CharNode node = new CharNode(character);
		CharNode current;
		
		if (list == null)
			list = node;
		else
		{
			current = list;
			while (current.next != null)
				current = current.next;
			current.next= node;
		}
	}
	public void dequeue()
	{
		char character= ' ';
		CharNode current;
		
		if (list == null)
			System.out.println("Cannot execute dequeue");
		else
		{
		
			current = list;
			while (current.prev != null)
			{
				current = current.prev;
			}
			if (current.prev == null)
			{
				current = null;
			}
				
		}
	}
	
	
	
	//Returns list of characters as a string 
	public String toString()
	{
		String result = "";
		CharNode current = list;
		while (current !=null)
		{
			result += current.Character + ", ";
			current = current.next;
		}
		return result;
	}
	
	private class CharNode
	{
		public char Character;
		public CharNode next, prev;
		
		public CharNode (char character)
		{
			Character = character;
			next = null;
			prev = null;
		}
	}
	public int size(int SIZE)
	{
		CharList[int size];
		size = SIZE;
		return SIZE;
	}
}
	
		
	
