
public class Runner {

	public static void main(String[] args) throws ExceptionQueue {
		ExceptionQueue Limit10 = new ExceptionQueue("You entered more than 10 characters");
		ExceptionQueue EmptyQueue = new ExceptionQueue("Queue is empty. Cannot Dequeue");
		int i = 0;
		String test;
		Queue q = new Queue();
		q.enQueue('A');
		q.enQueue('d');
		q.enQueue('d');
		q.enQueue('d');
		q.enQueue('d');
		q.enQueue('d');
		q.enQueue('d');
		q.enQueue('d');
		q.size();
		if (q.size()>10)
			throw Limit10;
		
		//System.out.println("before init test.");
		//test = q.toString();
		//toString();
		
		
		
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		
		q.enQueue('z');
		q.enQueue('z');
		q.enQueue('z');
		q.enQueue('z');
		q.enQueue('z');
	
		//q.toString();
		System.out.print(q);
		
		
		q.size();
		if (q.size()<=0)
			throw EmptyQueue;
	}
}
