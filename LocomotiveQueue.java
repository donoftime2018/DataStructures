package Queue;

public class LocomotiveQueue 
{
	private Locomotive[] array; //an array of Locomotives that represents a queue
	private int front; //the first element in the array
	private int rear; //the last element in the array
	
	/**
	 * Constructor instantiates the 'array', 'front' and 'rear' fields
	 */
	public LocomotiveQueue(int capacity)
	{
		array = new Locomotive[capacity]; //creates an array of 'capacity' Locomotive object reference variables
		front = rear = 0; //initializes front and rear indices to 0
	}
	
	/**
	 * adds a new element to the rear of the queue
	 * @param element - element to be added to queue
	 */
	public void enque(Locomotive element)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == null)
			{
				rear = i;
				array[rear] = element;
				break;
			}
			rear++;
		}
	}
	
	/**
	 * removes the front-most element of the queue
	 * @return the first element in the queue 
	 */
	public Locomotive deque()
	{
		int new_front = front+1;
		
		Locomotive temp = array[front]; //holds former front element
		array[front] = array[new_front]; //assigns adjacent element as the new frontmost element
		
		for (int i = front+1; i <= rear; i++)
		{
			if (i == array.length-1) //if i is equal to the capacity of the queue, just set array[i] to null 
				array[i] = null;
			else
				array[i] = array[i+1]; //set current element to succeeding element
		}
		rear--;
		
		return temp;
		
		
	}
	
	/**
	 * returns the last (most recently added) element in 'array'
	 * @return most recent element in 'array'
	 */
	public Locomotive rear()
	{
		return array[rear];
	}
	
	/**
	 * returns the first (least recently added element in 'array'
	 * @return least recent in 'array'
	 */
	public Locomotive front()
	{
		return array[front];
	}
	
	/**
	 * returns the capacity of the queue
	 * @return length of 'array' field
	 */
	public int capacity()
	{
		return array.length;
	}
	
	/**
	 * displays all non-null elements in 'array'
	 */
	public void display()
	{
		for (Locomotive l: array)
		{
			if (l != null)
			{
				System.out.println(l);
			}
		}
	}
	
	/**
	 * checks if a piece of data is in the queue or not
	 * @param data - data to be searched for in queue
	 * @return 1 if found, 0 if not found
	 */
	public int search(Locomotive data)
	{
		for (int i = 0; i <= rear; i++)
		{
			if (array[i].compareTo(data) == 0)
			{
				System.out.print(data.getName() + " is in queue"); //report data was found in queue
				return 1;
			}
		}
		
		return 0;
	}
	
	/**
	 * checks to see if queue is full
	 * @return true if full, false if otherwise
	 */
	public boolean isFull()
	{
		return rear+1 == array.length;
	}
}