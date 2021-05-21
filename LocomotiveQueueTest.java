package Queue;

public class LocomotiveQueueTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocomotiveQueue test = new LocomotiveQueue(10); //creates a new 'LocomotiveQueue' object to store 8 elements
		
		Locomotive loco1 = new Locomotive("Donald", 9, true, "CR 812", "black"); //creates a new 'Locomotive' object
		Locomotive loco2 = new Locomotive("Murdoch", null, false, "BR 9F", "orange");
		Locomotive loco3 = new Locomotive("Gordon", 4, true, "LNER A3", "blue");

		test.enque(loco1); //adds 'loco1' reference variable to LocomotiveQueue reference 'test'
		test.enque(loco2); //adds 'loco2' to 'test'
		test.enque(new Locomotive("Oliver", 11, true, "GWR 14XX", "green"));
		test.enque(new Locomotive("Derek", null, false, "BR Class 17", "dark green"));
		test.enque(loco3); //adds 'loco3' to 'test'
		test.enque(new Locomotive("Hiro", 51, true, "JNR D51", "black"));
		test.enque(new Locomotive("Duck", 8, true, "GWR Pannier Tank Engine", "green"));
		test.enque(new Locomotive("Molly", null, false, "\"Claud Hamilton\"", "yellow"));
		test.enque(new Locomotive("Luke", 22, true, "Kerr Stuart Wren", "green"));
		test.enque(new Locomotive("Edward", 2, true, "FR K2 \"Larger Seagulls\"", "blue"));
		
		LocomotiveQueue copy = test.copy(); //create copy of 'test'
		
		
//		System.out.println("Frontmost element is...\n" + test.front() +
//				"\nRearmost element is...\n" + test.rear());
//		test.display();
//		
//		test.deque(); //removes frontmost element from 'test' queue
//		test.deque();
//		test.deque();
//		
//		System.out.println("Now, frontmost element is...\n" + test.front() +
//				"\nRearmost element is...\n" + test.rear());
//		
//		test.display();
//		test.search(loco3);
		
		
		
		System.out.println("Frontmost element is...\n" + copy.front() +
				"\nRearmost element is...\n" + copy.rear());
		copy.display();
		
		copy.deque(); //removes frontmost element from 'copy' queue
		copy.deque();
		
		System.out.println("Now, frontmost element is...\n" + copy.front() +
				"\nRearmost element is...\n" + copy.rear());
		
		copy.display();
		copy.search(loco3);
		copy.search(new Locomotive("Murdoch", null, false, "BR 9F", "orange"));
		System.out.println();
		copy.search(new Locomotive("Luke", 22, true, "Kerr Stuart Wren", "green"));
	}

}
