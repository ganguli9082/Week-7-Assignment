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

 
 	
 	//	if (CList >10)
 	//	throw Limit10;
 
 System.out.println(CList);
 
 CList.dequeue();
 
 System.out.println(CList);
 
 
 
 
	
	
	
	
	}

}
