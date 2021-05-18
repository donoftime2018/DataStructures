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
				break;
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
	
	
	public int search(Locomotive data)
	{
		for (int i = 0; i < priority_queue.length; i++)
		{
			if (priority_queue[i].search(data)==1)
			{
				System.out.println(" in priority " + i); //if search returns 1, report which priority the element is in
				return 1;
			}
		}
		
		return 0;
	}
	
}
