
public class Queue {
	char CHAR;
	private char queue[];
	public int size;
	public int front;
	public int rear;
	
	public Queue()
	{
		queue = new char[10];
		
	}
	
	public void enQueue(char CHAR)
	{
		queue[rear] = CHAR;
		rear = (rear++)%10;
		size = size++;
		
	}
	
	
	public char deQueue()
	{
	    char CHAR = queue[front];
		front = (front++)%10;
		size = size--;
		return CHAR;
	}
	
	
	
	public String toString()
	{
		String report = "Characters: ";
		//for (int index = 0; index< size; index++)
		//	report += queue[index] + "/n";
		return report;
		
		//char result = ' ';
		//for(int i = 0; i<size;i++)
		//{
		//	result += queue[(front + i)%10];
		//	System.out.println("Characters" + result);
		//}
		//System.out.println(" ");
		
		//for (int n : queue)
		//{
		//	System.out.println(n + " ");
		//}
	}
	public int size(int SIZE)
	{
		size = SIZE;
		return SIZE;
	}

}
