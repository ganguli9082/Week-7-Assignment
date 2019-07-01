
public class Queue {
	char CHAR;
	private char queue[];
	public int size;
	public int front;
	public int rear;
	
	public Queue()
	{
		//System.out.println("calling  Queue");
		queue = new char[10];
		size = 0;
		front = 0;
		rear = 0;
	}
	
	
	public void enQueue(char CHAR)
	{
		//System.out.println("calling  enQueue");

		queue[rear] = CHAR;
		rear = (rear+1)%10;
		size++;
		//System.out.println(queue);
		//System.out.println(rear);
		//System.out.println(size);
	}
	
	
	public char deQueue()
	{
		//System.out.println("debug deQueue: " + size);
		//System.out.println(queue);
		//System.out.println(size);
		//System.out.println(front);
	    char CHAR = queue[front];
		front = (front+1)%10;
		size = size-1;
		
		//System.out.println(queue[front]);
		//System.out.println(size);
		//System.out.println(front);
		return CHAR;
		
	}
	
	
	
	public String toString()
	{
		//System.out.println("calling  toString");
		//int index = front;
		//String report = "Characters: ";
		//for (;index< size; index++)
		//	report += queue[index] + "/n";
		
		String result = "";
		for(int i = 0; i<size;i++)
		{
			result += queue[(front + i)%10];
			
		}
		
		return result;
		//for (int n : queue)
		//{
		//	System.out.println(n + " ");
		//}
	}
	public int size()
	{
		//System.out.println("calling  size");
		
		return size;
	}

}
