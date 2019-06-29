import java.util.*;
import java.util.Queue;
public class AlphabetQueue {


	Scanner scan = new Scanner(System.in);
	static int Size;
	public static void main(String[] args) throws ExceptionQueue {
		
		ExceptionQueue Limit10 = new ExceptionQueue("You entered more than 10 characters");
		ExceptionQueue EmptyQueue = new ExceptionQueue("Queue is empty. Cannot Dequeue");
		
		
		Queue<Character> alph = new LinkedList();
		
		
	
		
		alph.add('d');
		alph.add('g');
		alph.add('g');
		alph.add('g');
		alph.add('g');
		alph.add('g');
		alph.add('g');
		alph.add('g');
		alph.add('f');
		
		
		if (alph.size() > 10)
				throw Limit10;
		
		System.out.println(alph);
		
		//removes first item in array
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			alph.remove();
			
			if (alph.size() == 0)
				throw EmptyQueue;
			System.out.println(alph);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
