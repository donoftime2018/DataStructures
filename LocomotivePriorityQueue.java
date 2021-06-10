package Queue;

public class LocomotivePriorityQueue 
{
	private LocomotiveQueue[] priority_queue; //an array of queues to represent the priority queue
	
	/**
	 * Constructor creates 'highest_priority' # of LocomotiveQueue objects and instantiates 'priority_queue' field.
	 * @param highest_priority - the highest priority for an element
	 * @param capacity - number of elements each queue in 'priority_queue' can hold
	 */
	public LocomotivePriorityQueue(int capacity, int highest_priority)
	{
		priority_queue = new LocomotiveQueue[highest_priority]; //instantiates 'priority_queue' field to hold 'highest_priority' # of 'LocomotiveQueue' reference variables
		
		if (highest_priority < 0)
		{
			System.out.println("Priorities cannot be below 0!");
			return;
		}
		
		for (int i = 0; i < highest_priority; i++)
		{
			priority_queue[i] = new LocomotiveQueue(capacity); //instantiates each reference variable in 'priority_queue'
		}
	}
	
	/**
	 * 
	 * @param element - element to be added
	 * @param priority - priority of element being added
	 */
	public void add(Locomotive element, int priority)
	{
		int highest_priority = priority_queue.length-1; //maximum priority
		
		if (priority > highest_priority || priority < 0)
		{
			System.out.println("Invalid priority");
			return;
		}
		
		for (int i = 0; i < priority_queue.length; i++)
		{
			
			if (i == priority)
			{
				if (priority_queue[i].isFull())
				{
					priority++; //increment priority to the next priority queue
					continue; //go to next iteration 
				}
				
				priority_queue[i].enque(element);
				return; 
			}
		}
	}
	
	/**
	 * removes element with highest priority added most recently
	 */
	public void remove()
	{
		int highest_priority = priority_queue.length-1;
		
		for (int i = highest_priority; i > -1; i--)
		{
			if (priority_queue[i].front() != null) //checks if there are elements in the queue to remove
			{
				priority_queue[i].deque(); 
				return;
			}
		}
	}
	
	/**
	 * displays all elements in the queue 
	 */
	public void display()
	{
		int highest_priority = priority_queue.length;
		
		for (int i = 0; i < highest_priority; i++)
		{
			System.out.println("--------------------\nPriority " + i + " elements: \n--------------------");
			priority_queue[i].display();
		}
	}
	
	/**
	 * searches for piece of data in priority queue using LocomotiveQueue's search method
	 * @param data - data to be searched for
	 */
	public void search(Locomotive data)
	{
		for (int i = 0; i < priority_queue.length; i++)
		{
			if (priority_queue[i].search(data)==1) //uses search method for each queue in 'priority_queue'
			{
				System.out.println(" of priority " + i); //if search returns 1, report which priority the element is in
			}
		}
		
	}
	
	/**
	 * returns the capacity of an individual priority queue (same for all priority queues)
	 * @return - length of a priority queue using LocomotiveQueue's capacity method
	 */
	private int capacity()
	{
		return priority_queue[0].capacity();
	}
	
	/**
	 * copies this PriorityQueue object
	 * @return - copy of PriorityQueue object using LocomotiveQueue's copy method (i.e. make deep copies of each individual queue in the Priority Queue)
	 */
	public LocomotivePriorityQueue copy()
	{
		LocomotivePriorityQueue copy = new LocomotivePriorityQueue(capacity(), priority_queue.length); //copy has capacity() elements in each individual LocomotiveQueue and priority_queue.length # of LocomotiveQueues 
		
		for (int i = 0; i < priority_queue.length; i++)
		{
			copy.priority_queue[i] = priority_queue[i].copy(); //copies each of this queue's individual array queues into 'copy'
		}
		
		return copy;
	}
	
}
