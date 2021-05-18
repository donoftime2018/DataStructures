package Queue;
import java.util.*;

public class LocomotivePriortyQueueTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocomotivePriorityQueue test = new LocomotivePriorityQueue(10, 6); //creates a LocomotivePriorityQueue object with a max priority of 5 (1 less than parameter passed in)
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20, loco21, loco22, loco23, loco24, loco25, loco26, loco27;
		
		loco1 = new Locomotive("Percy", 6, true, "Avonside Saddle Tank", "green");
		loco2 = new Locomotive("Billy", null, false, "Manning Wardle L", "orange");
		loco3 = new Locomotive("Fergus", null, false, "Blue Circle", "royal blue");
		loco4 = new Locomotive("Smudger", null, false, "Dolgoch", "green");
		loco5 = new Locomotive("Luke", 22, true, "Kerr Stuart Wren", "green");
		loco6 = new Locomotive("Henry", 3, true, "LMS Black 5", "green");
		loco7 = new Locomotive("Derek", null, false, "BR Class 17", "dark green");
		loco8 = new Locomotive("Arthur", 41241, true, "LMS Ivatt 2MT", "red");
		loco9 = new Locomotive("'Arry and Bert", null, false, "BR Class 08", "dark green and yellow");
		loco10 = new Locomotive("Rebecca", 22, true, "SR West Country Class", "yellow");
		loco11 = new Locomotive("Murdoch", null, false, "BR Standard 9F", "orange");
		loco12 = new Locomotive("Sidney", null, false, "BR Class 08", "dark blue");
		loco13 = new Locomotive("Norman", null, false, "BR Class 11001", "red");
		loco14 = new Locomotive("Dennis", 11001, true, "BR Class 11001", "grey");
		loco15 = new Locomotive("Hank", null, false, "PRR K4 Pacific", "royal blue");
		loco16 = new Locomotive("Belle", null, false, "LMS Ivatt 2MT", "prussian blue");
		loco17 = new Locomotive("Bill and Ben", null, false, "Alfredy and Judy", "golden yellow");
		loco18 = new Locomotive("Bertram", null, false, "Prince", "dark brown");
		loco19 = new Locomotive("Bash and Dash", null, false, "Bear Harbor Lumber Company 1", "blue and orange");
		loco20 = new Locomotive("Neville", 30010, true, "SR Bulleid Q1", "black");
		loco21 = new Locomotive("Donald", 9, true, "CR 812", "black");
		loco22 = new Locomotive("Daisy", null, false, "BR Class 101", "green");
		loco23 = new Locomotive("Ryan", 1014, true, "GNR N2", "purple");
		loco24 = new Locomotive("Hugo", null, false, "Schienenzeppelin", "silver");
		loco25 = new Locomotive("James", 5, true, "L&YR Class 28", "red");
		
		Random rand = new Random(); //creates a new Random object
		
//		test.add(loco11, 4);
//		test.add(loco5, 4);
//		test.add(loco4, 4);
//		test.add(loco13, 4);
//		test.add(loco18, 4);
//		test.add(loco17, 4);
//		test.add(loco15, 4);
//		test.add(loco13, 4);
//		test.add(loco24, 4);
//		test.add(loco23, 4);
//		test.add(loco20, 4);
//		test.add(loco19, 4);
//		
//		test.display();
		
		test.add(loco1, rand.nextInt(6));
		test.add(new Locomotive("Hiro", 51, true, "JNR D51", "black"), rand.nextInt(6));
		test.add(loco18, rand.nextInt(6));
		test.add(loco12, rand.nextInt(6));
		test.add(new Locomotive("Salty", null, false, "BR Class 07", "red"), rand.nextInt(6));
		test.add(loco3, rand.nextInt(6));
		test.add(loco7, rand.nextInt(6));
		test.add(loco5, rand.nextInt(6));
		test.add(new Locomotive("Edward", 2, true, "FR K2", "blue"), rand.nextInt(6));
		test.add(loco4, rand.nextInt(6));
		test.add(new Locomotive("BoCo", null, false, "BR Class 28", "green"), rand.nextInt(6));
		test.add(loco6, rand.nextInt(6));
		test.add(loco21, rand.nextInt(6));
		test.add(new Locomotive("Skarloey", 1, true, "\"Tallylyn\"", "red"), rand.nextInt(6));
		test.add(loco8, rand.nextInt(6));
		test.add(new Locomotive("Peter Sam", 4, true, "\"Edward Thomas\"", "green"), rand.nextInt(6));
		test.add(loco9, rand.nextInt(6));
		test.add(new Locomotive("Duke", null, false, "\"Prince\"", "brown"), rand.nextInt(6));
		test.add(loco14, rand.nextInt(6));
		test.add(new Locomotive("Philip", 68, true, "PRR A6 Boxcab", "green and yellow"), rand.nextInt(6));
		test.add(new Locomotive("Douglas", 10, true, "CR 812", "black"), rand.nextInt(6));
		test.add(loco15, rand.nextInt(6));
		test.add(new Locomotive("Spencer", null, false, "LNER A4", "silver"), rand.nextInt(6));
		test.add(new Locomotive("Yong Bao", null, false, "China Railways RM Pacific", "red"), rand.nextInt(6));
		test.add(loco16, rand.nextInt(6));
		test.add(new Locomotive("Hugo", null, false, "Schienenzeppelin", "silver"), rand.nextInt(6));
		test.add(loco17, rand.nextInt(6));
		test.add(loco19, rand.nextInt(6));
		test.add(new Locomotive("Ferdinand", null, false, "Class C Climax", "teal"),  rand.nextInt(6));
		test.add(loco23, rand.nextInt(6));
		test.add(loco10, rand.nextInt(6));
		test.add(new Locomotive("Victor", null, false, "\"Minaz\" 1173", "red"), rand.nextInt(6));
		test.add(new Locomotive("Vinnie", 6400, true, "CR U4a", "blue and grey"), rand.nextInt(6));
		test.add(loco11, rand.nextInt(6));
		test.add(new Locomotive("Nia", 18, true, "KUR EAR 11", "orange"), rand.nextInt(6));
		test.add(loco22, rand.nextInt(6));
		test.add(new Locomotive("Flying Scotsman", 4472, true, "LNER A3 \"Flying Scotsman\"", "dark green"), rand.nextInt(6));
		test.add(loco25, rand.nextInt(6));
		test.add(new Locomotive("Thomas", 1, true, "LBSCR E2", "blue"), rand.nextInt(6));
		test.add(loco20, rand.nextInt(6));
		test.add(new Locomotive("Samson", null, false, "Neilson High Harrington Ironworks Saddletank", "viridian"), rand.nextInt(6));
		test.add(new Locomotive("Gordon", 4, true, "LNER A3", "blue"), rand.nextInt(6));
		test.add(new Locomotive("Stepney", 55, true, "LBSCR A1x Terrier \"Stepney\"", "goldenrod"), rand.nextInt(6));
		test.add(new Locomotive("Paxton", null, false, "BR Class 08", "dark green"),  rand.nextInt(6));
		test.add(new Locomotive("Den", null, false, "Rolls Royce Sentinel", "blue and orange"),  rand.nextInt(6));
		test.add(new Locomotive("Dart", null, false, "Bagnall Diesel Shunter", "yellow and crimson"), rand.nextInt(6));
		
		System.out.println("Before removing...");
		test.display();
		
		test.remove(); //removes element with highest priority least recently added (e.g. max priority element that was least recently added)
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		
		System.out.println("\nAfter removing...");
		test.display();
		
		test.search(loco12);
		test.search(loco8); //searches for specified element in the priority queue
		test.search(loco5);
		test.search(new Locomotive("Douglas", 10, true, "CR 812", "black"));
		test.search(loco11);
		test.search(loco18);
		test.search(loco7);
		test.search(loco21);
		test.search(loco24);

	}

}
