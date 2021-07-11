package LinkedList;

public class LocomotiveLinkedList 
{
	private LocomotiveNode head; //reference to first node in the list

	/**
	 * Constructor initializes empty list
	 */
	public LocomotiveLinkedList()
	{
		head = null;
	}
	
	/**
	 * inserts a new node in the list at the appropriate position; calls insertHead if head is null and calls insertNewHead if existing head is greater than new head
	 * @param node - node being inserted
	 */
	public void insert(Locomotive data)
	{
		LocomotiveNode newNode = new LocomotiveNode(data); //new node to be inserted
		
		if (head == null)
		{
			insertHead(newNode);
			return;
		}
		
		if (head.compareTo(data) == 1)
		{
			insertNewHead(newNode); //if head is greater than data of newNode, newNode becomes new head
			return;
		}
		
		for (LocomotiveNode cursor = head, prevCursor = cursor; ; prevCursor = cursor, cursor = cursor.getLink())
		{
			if (cursor.compareTo(data)==0)
			{
				System.out.println(data.getName() + " is in the list already!"); //report if data being inserted already exists in the list
				return;
			}
			
			if (cursor.getLink() == null && newNode.compareTo(cursor.getData()) == 1)
			{
				cursor.setLink(newNode); //sets newNode as link of cursor node
				return; //terminate method execution after insertion is done
			}
			
			else
			{
				if (newNode.compareTo(cursor.getData()) == -1)
				{
					newNode.setLink(cursor); //sets link of newNode to cursor
					prevCursor.setLink(newNode); //sets link of prevCursor to newNode
					return;
				}
			}
		}
		
	}
	
	/**
	 * if the head is null, insert head node to the list
	 * @param head - the head node to be inserted
	 */
	private void insertHead(LocomotiveNode head)
	{
		this.head = head;
	}
	
	/**
	 * calls insertHead method, passing in 'newHead' to replace existing head of list and setting original head as link of new head
	 * @param newHead - new head node for list
	 */
	private void insertNewHead(LocomotiveNode newHead)
	{
		LocomotiveNode old_Head = head;
		insertHead(newHead);
		head.setLink(old_Head);
	}
	
	/**
	 * removes user's desired node from list
	 * @param node - node to be removed from list
	 * @return - 1 if node was found and successfully removed, 0 if otherwise
	 */
	public int remove(Locomotive data) throws NullPointerException
	{
		if (head.compareTo(data) == 0) //if head is the node to be removed
		{
			head = head.getLink(); //set new head to previous head's succeeding node
			return 1;
		}
		
		for (LocomotiveNode cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if (cursor.getLink().compareTo(data) == 0) //if data of succeeding node from current 'cursor' position equals data from 'node'
			{
				cursor.setLink(cursor.getLink().getLink()); //set link of current node to next node's link
				return 1;
			}
		}
		
		return 0;
	}
	
	/**
	 * returns reference to list's current head node
	 * @return 'head' field
	 */
	public LocomotiveNode head()
	{
		return head;
	}
	
	/**
	 * display() loops through all nodes in list and prints data stored in each
	 */
	public void display()
	{
		for (LocomotiveNode cursor = head; cursor != null; cursor = cursor.getLink())
		{
			System.out.println(cursor.getData()); //prints data for each node in linked list
		}
	}
	
	/**
	 * searches for a specificed Locomotive data in list
	 * @param target - data to be searched for
	 * @return - 1 if found, 0 if otherwise
	 */
	public int search(Locomotive target)
	{
		int position = 1; //position of element in list (i.e. 1st node/head, 2nd node, ...)
		
		for (LocomotiveNode cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if (cursor.compareTo(target) == 0)
			{
				System.out.println(target.getName() + " is node number " + position + " in the list");
				return 1;
			}
			
			position++;
		}
		
		return 0;
	}
	
	/**
	 * creates a copy of this current LocomotiveLinkedList instance
	 * @return reference to LinkedList copy
	 */
	public LocomotiveLinkedList copy()
	{
		LocomotiveLinkedList copy = new LocomotiveLinkedList(); //instantiate new Linked List
		
		for (LocomotiveNode cursor = head; cursor != null; cursor = cursor.getLink())
		{
			copy.insert(cursor.getData()); //inserts data from current list into 'copy' for each node traversed
		}
		
		return copy;
	}
}
