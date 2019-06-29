import java.util.Queue;
public class EnqueueChar {

	public static void main(String[] args) throws ExceptionQueue{
		
		ExceptionQueue Limit10 = new ExceptionQueue("You entered more than 10 characters");
		ExceptionQueue EmptyQueue = new ExceptionQueue("Queue is empty. Cannot Dequeue");
		
		CharList CList = new CharList();
 
 CList.enqueue('d');
 CList.enqueue('d');
 CList.enqueue('d');
 CList.enqueue('d');
 CList.enqueue('d');
 
 	if (CList.length() >10)
 
 System.out.println(CList);
	
	
	
	
	}

}
