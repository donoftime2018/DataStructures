package Queue;

public class LocomotiveQueue 
{
	private Locomotive[] array_queue; //an array of Locomotives that represents a queue
	private int front; //the first element in the array
	private int rear; //the last element in the array
	
	/**
	 *  Constructor instantiates the 'array_queue', 'front' and 'rear' fields
	 * @param capacity - the capacity of 'array_queue' (i.e. how many elements it can hold)
	 */
	public LocomotiveQueue(int capacity)
	{
		array_queue = new Locomotive[capacity]; //creates an array of 'capacity' Locomotive object reference variables
		front = rear = 0; //initializes front and rear indices to 0
	}
	
	/**
	 * adds a new element to the rear of the queue
	 * @param element - element to be added to queue
	 */
	public void enque(Locomotive element)
	{
		for (int i = 0; i < array_queue.length; i++)
		{
			if (array_queue[i] == null)
			{
				rear = i;
				array_queue[rear] = element;
				return;
			}
		}
	}
	
	/**
	 * removes the front-most element of the queue
	 * @return the first element in the queue 
	 */
	public Locomotive deque()
	{
		int new_front = front+1;
		
		Locomotive temp = array_queue[front]; //holds former front element
		array_queue[front] = array_queue[new_front]; //assigns adjacent element as the new frontmost element
		
		for (int i = front+1; i <= rear; i++)
		{
			if (i == array_queue.length-1) //if i is equal to the capacity of the queue, just set array[i] to null 
				array_queue[i] = null;
			else
				array_queue[i] = array_queue[i+1]; //set current element to succeeding element
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
		return array_queue[rear];
	}
	
	/**
	 * returns the first (least recently added element in 'array'
	 * @return least recent in 'array'
	 */
	public Locomotive front()
	{
		return array_queue[front];
	}
	
	/**
	 * returns the capacity of the queue
	 * @return length of 'array' field
	 */
	public int capacity()
	{
		return array_queue.length;
	}
	
	/**
	 * displays all non-null elements in 'array'
	 */
	public void display()
	{
		for (Locomotive l: array_queue)
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
			if (array_queue[i].compareTo(data) == 0)
			{
				System.out.print(data.getName() + " is element " + (i+1) + " in the queue"); //report data was found in queue
				return 1;
			}
		}
		
		
		
		return 0;
	}
	
	/**
	 * makes a copy of the current LocomotiveQueue object using System.arraycopy
	 * @return - reference to the copy of current LocomotiveQueue
	 */
	public LocomotiveQueue copy()
	{
		LocomotiveQueue copy = new LocomotiveQueue(array_queue.length); //creates a LocomotiveQueue which same length as this LocomotiveQueue
		
		System.arraycopy(array_queue, front, copy.array_queue, front, array_queue.length); //copy current array contents to array copy as far as where the current rear position is
		copy.rear = this.rear; //sets copy's rear to this rear
		
		return copy;
	}
	
	/**
	 * checks to see if queue is full
	 * @return true if full, false if otherwise
	 */
	public boolean isFull()
	{
		return rear+1 == array_queue.length;
	}
}
