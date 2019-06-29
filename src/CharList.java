import java.util.ArrayList;
import org.omg.CORBA.Current;

public class CharList {
	private CharNode list;
	
	public CharList()
	{
		list = null;
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
	public void dequeue(char character)
	{
		
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
		public CharNode next;
		
		public CharNode (char character)
		{
			Character = character;
			next = null;
		}
	}

	
		// TODO Auto-generated method stub
		return 0;
	}
}
