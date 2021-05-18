package Queue;

public class LocomotiveQueueTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocomotiveQueue test = new LocomotiveQueue(10); //creates a new 'LocomotiveQueue' object
		
		Locomotive loco1 = new Locomotive("Donald", 9, true, "CR 812", "black"); //creates a new 'Locomotive' object
		Locomotive loco2 = new Locomotive("Murdoch", null, false, "BR 9F", "orange");
		Locomotive loco3 = new Locomotive("Gordon", 4, true, "LNER A3", "blue");

		test.enque(loco1); //adds 'loco1' reference variable to LocomotiveQueue reference 'test'
		test.enque(loco2); //adds 'loco2' to 'test'
		test.enque(loco3); //adds 'loco3' to 'test'
		
		System.out.println("Frontmost element is...\n" + test.front() +
				"\nRearmost element is...\n" + test.rear());
		test.display();
		
		test.deque(); //removes frontmost element from queue
		
		System.out.println("Now, frontmost element is...\n" + test.front() +
				"\nRearmost element is...\n" + test.rear());
		
		test.display();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		test.search(loco3);
	}

}
