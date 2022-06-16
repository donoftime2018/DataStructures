package Queue;
import java.util.*;

public class LocomotivePriortyQueueTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int MAX_PRIORITY = 6;
		final int QUEUE_SIZE = 10;
		
		LocomotivePriorityQueue test = new LocomotivePriorityQueue(QUEUE_SIZE, MAX_PRIORITY); //creates a LocomotivePriorityQueue object with a max priority of MAX_PRIORITY (1 less than parameter passed in) and QUEUE_SIZE elements per queue
		LocomotivePriorityQueue copy;
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20, loco21, loco22, loco23, loco24, loco25, loco26, loco27, loco28, loco29, loco30, loco31;
		Locomotive loco32, loco33, loco34, loco35, loco36, loco37, loco38, loco39, loco40;
		Locomotive loco41, loco42, loco43, loco44, loco45, loco46, loco47, loco48, loco49, loco50, loco51, loco52, loco53, loco54, loco55, loco56, loco57, loco58, loco59, loco60;
		
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
		loco16 = new Locomotive("Belle", 6120, true, "LMS Ivatt 4MT", "prussian blue");
		loco17 = new Locomotive("Bill and Ben", null, false, "Alfredy and Judy", "golden yellow");
		loco18 = new Locomotive("Bertram", null, false, "Small England", "dark brown");
		loco19 = new Locomotive("Bash and Dash", null, false, "Bear Harbor Lumber Company 1", "blue and orange");
		loco20 = new Locomotive("Neville", 30010, true, "SR Bulleid Q1", "black");
		loco21 = new Locomotive("Donald", 9, true, "CR 812", "black");
		loco22 = new Locomotive("Daisy", null, false, "BR Class 101", "green");
		loco23 = new Locomotive("Ryan", 1014, true, "GNR N2", "purple");
		loco24 = new Locomotive("Hugo", null, false, "Schienenzeppelin", "silver");
		loco25 = new Locomotive("James", 5, true, "L&YR Class 28", "red");
		loco26 = new Locomotive("Douglas", 10, true, "CR 812", "black");
		loco27 = new Locomotive("Rheneas", 2, true, "\"Dolgoch\"", "crimson");
		loco28 = new Locomotive("Ferdinand", null, false, "Climax Class C", "teal");
		loco29 = new Locomotive("Emily", 12, true, "GNR Stirling Single", "emerald");
		loco30 = new Locomotive("Victor", 1173, true, "\"Minaz\" No. 1173", "yellow and green");
		loco31 = new Locomotive("James", 5, true, "L&YR Class 28", "black");
		loco32 = new Locomotive("Gordon", 4, true, "LNER A3 Pacific", "blue");
		loco33 = new Locomotive("Den", null, false, "Rolls Royce Sentinel Hydraulic", "blue and orange");
		loco34 = new Locomotive("Dart", null, false, "Bagnall Diesel Shunter", "crimson and yellow");
		loco35 = new Locomotive("Duke", null, false, "Small England", "brown");
		loco36 = new Locomotive("Thomas", 70, true, "LBSCR E2", "green");
		loco37 = new Locomotive("Harvey", 27, true, "Dubs Crane Tank", "maroon");
		loco38 = new Locomotive("Salty", 2991, true, "BR Class 07", "green");
		loco39 = new Locomotive("Spencer", null, false, "LNER A4 Pacific", "silver");
		loco40 = new Locomotive("BoCo", null, false, "BR Class 28", "green");
		loco41 = new Locomotive("Daisy", null, false, "BR Class 101 DMU", "green");
		loco42 = new Locomotive("Stepney", 55, true, "LBSCR A1x Terrier \"Stepney\"", "goldenrod");
		loco43 = new Locomotive("Paxton", null, false, "BR Class 08", "dark green");
		loco44 = new Locomotive("Hiro", 51, true, "JNR D51", "black");
		loco45 = new Locomotive("Splatter and Dodge", null, false, "BR Class 08", "purple and olive respectively");
		loco46 = new Locomotive("Yong Bao", null, false, "China Railways RM Pacific", "red");
		loco47 = new Locomotive("Samson", null, false, "High Harrington Ironworks Saddletank", "viridian");
		loco48 = new Locomotive("Thomas", 1, true, "LBSCR E2", "blue");
		loco49 = new Locomotive("Diesel", null, false, "BR Class 08", "black");
		loco50 = new Locomotive("Mavis", null, false, "BR Class 04", "black");
		loco51 = new Locomotive("Molly", null, false, "\"Claud Hamilton\"", "yellow");
		loco52 = new Locomotive("Toby", 7, true, "LNER J70", "brown");
		loco53 = new Locomotive("Frankie", 4002, true, "MSC 4002", "blue-green and black");
		loco54 = new Locomotive("Hurricane", 20, true, "GER A55 \"Decapod\"", "red");
		loco55 = new Locomotive("Skiff", null, false, "Eastport Pram", "white");
		loco56 = new Locomotive("Edward", 2, true, "FR K2 \"Larger Seagulls\"", "blue");
		loco57 = new Locomotive("Salty", 2991, true, "BR Class 07", "red");
		loco58 = new Locomotive("Mighty Mac", null, false, "Double Fairlie", "royal blue");
		loco59 = new Locomotive("Skarloey", 1, true, "\"Tallylyn\"", "red");
		loco60 = new Locomotive("Flying Scotsman", 4472, true, "LNER A3 \"Flying Scotsman\"", "dark green");

		Random rand = new Random(); //creates a new Random object
		
//		test.add(loco11, 4);
//		test.add(loco5, 4);
//		test.add(loco4, 4);
//		test.add(loco13, 4);
//		test.add(loco18, 4);
//		test.add(loco17, 4);
//		test.add(loco15, 4);
//		test.add(loco13, 4);5
//		test.add(loco24, 4);
//		test.add(loco23, 4);
//		test.add(loco20, 4);
//		test.add(loco19, 4);
//		
//		test.display();
		
		test.add(loco16, rand.nextInt(MAX_PRIORITY));
		test.add(loco11, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Henry", 3, true, "GNR Atlantic C1", "blue"), rand.nextInt(MAX_PRIORITY));
		test.add(loco59, rand.nextInt(MAX_PRIORITY));
		test.add(loco41, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("James", 5, true, "LYR Class 28", "busy as a bee"), rand.nextInt(MAX_PRIORITY));
		test.add(loco14, rand.nextInt(MAX_PRIORITY));
		test.add(loco24, rand.nextInt(MAX_PRIORITY));
		test.add(loco2, rand.nextInt(MAX_PRIORITY));
		test.add(loco57, rand.nextInt(MAX_PRIORITY));
		test.add(loco30, rand.nextInt(MAX_PRIORITY));
		test.add(loco9, rand.nextInt(MAX_PRIORITY));
		test.add(loco44, rand.nextInt(MAX_PRIORITY));
		test.add(loco3, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Rosie", null, false, "SR USA S100", "pink"), rand.nextInt(MAX_PRIORITY));
		test.add(loco34, rand.nextInt(MAX_PRIORITY));
		test.add(loco25, rand.nextInt(MAX_PRIORITY));
		test.add(loco28, rand.nextInt(MAX_PRIORITY));
		test.add(loco48, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Henry", 3, true, "GNR Atlantic C1", "green"), rand.nextInt(MAX_PRIORITY));
		test.add(loco7, rand.nextInt(MAX_PRIORITY));
		test.add(loco21, rand.nextInt(MAX_PRIORITY));
		test.add(loco40, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Oliver", 11, true, "GWR 14XX", "green"), rand.nextInt(MAX_PRIORITY));
		test.add(loco1, rand.nextInt(MAX_PRIORITY));
		test.add(loco8, rand.nextInt(MAX_PRIORITY));
		test.add(loco33, rand.nextInt(MAX_PRIORITY));
		test.add(loco19, rand.nextInt(MAX_PRIORITY));
		test.add(loco36, rand.nextInt(MAX_PRIORITY));
		test.add(loco17, rand.nextInt(MAX_PRIORITY));
		test.add(loco38, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Victor", null, false, "\"Minaz\" No. 1173", "red and yellow"), rand.nextInt(MAX_PRIORITY));
		test.add(loco32, rand.nextInt(MAX_PRIORITY));
		test.add(loco14, rand.nextInt(MAX_PRIORITY));
		test.add(loco52, rand.nextInt(MAX_PRIORITY));
		test.add(loco6, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("James", 5, true, "L&YR Clas 28", "black"), rand.nextInt(MAX_PRIORITY));
		test.add(loco5, rand.nextInt(MAX_PRIORITY));
		test.add(loco49, rand.nextInt(MAX_PRIORITY));
		test.add(loco26, rand.nextInt(MAX_PRIORITY));
		test.add(loco20, rand.nextInt(MAX_PRIORITY));
		test.add(loco45, rand.nextInt(MAX_PRIORITY));
		test.add(loco23, rand.nextInt(MAX_PRIORITY));
		test.add(loco22, rand.nextInt(MAX_PRIORITY));
		test.add(new Locomotive("Rosie", 37, true, "SR USA 100", "red"), rand.nextInt(MAX_PRIORITY));
		test.add(loco12, rand.nextInt(MAX_PRIORITY));
		test.add(loco15, rand.nextInt(MAX_PRIORITY));
		test.add(loco13, rand.nextInt(MAX_PRIORITY));
		test.add(loco18, rand.nextInt(MAX_PRIORITY));
		test.add(loco10, rand.nextInt(MAX_PRIORITY));
		
		copy = test.copy(); //create copy of 'test'
		
		test.display(); //display all elements in queue
	
		test.search(loco5); //search for if loco5 is in queue and if so, which specific priority it is in
		test.search(loco30);
		test.search(loco17);
		test.search(loco44);
		test.search(loco26);
		test.search(loco7);
		test.search(loco8);
		test.search(loco9);
		test.search(loco21);
		test.search(loco25);
		test.search(loco36);
		test.search(loco45);
		test.search(loco3);
		test.search(loco20);
		test.search(loco57);
		test.search(loco6);
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\nCOPY CURRENTLY LOOKS LIKE...");
		copy.add(loco46, rand.nextInt(MAX_PRIORITY));
		copy.add(loco39, rand.nextInt(MAX_PRIORITY));
		copy.display(); //display all elements in 'copy'
		
		System.out.println("GONNA REMOVE SOME ELEMENTS\n\n\n\n\n\n\n");
		
		copy.remove(); //remove an element from copy (first element added to highest priority queue)
		copy.remove();
		copy.remove();
		copy.remove();
		copy.remove();
		copy.remove();
		copy.remove();
		copy.remove();
		copy.remove();
		
		System.out.println("NOW, COPY LOOKS LIKE...");
		copy.display();
		
		copy.search(loco5);
		copy.search(loco7);
		copy.search(loco39);
		copy.search(loco46);
		copy.search(loco11);

	}

}
