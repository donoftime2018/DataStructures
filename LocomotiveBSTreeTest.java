package BSTree;
import java.io.*;

public class LocomotiveBSTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocomotiveBSTree test = new LocomotiveBSTree(); //creates new LocomotiveBSTree object
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20, loco21, loco22, loco23, loco24, loco25, loco26, loco27, loco28, loco29, loco30, loco31;
		Locomotive loco32, loco33, loco34, loco35, loco36, loco37, loco38, loco39, loco40;
		Locomotive loco41, loco42, loco43, loco44, loco45, loco46, loco47, loco48, loco49, loco50, loco51, loco52, loco53, loco54, loco55, loco56, loco57, loco58, loco59, loco60;
		Locomotive loco61, loco62, loco63, loco64, loco65, loco66, loco67, loco68, loco69, loco70;
		
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
		loco41 = new Locomotive("Glynn", 1, true, "Head and Wrightson 0-4-0VBT", "red");
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
		loco61 = new Locomotive("Whiff", null, false, "NER 66 \'Aerolite\"", "dark green");
		loco62 = new Locomotive("Hercules", 6, true, "\"Hercules\"", "blue and white cap, red stack");
		loco63 = new Locomotive("Stafford", 1917, true, "North Staffordshire Railway Battery-Electric No 1", "brown");
		loco64 = new Locomotive("Richard", 778, true, "SR N15", "dark green");
		loco65 = new Locomotive("Duck", 8, true, "GWR 57XX Pannier", "green");
		loco66 = new Locomotive("Terence", null, false, "Caterpillar Model 70", "orange");
		loco67 = new Locomotive("Merlin", 783, true, "SR N15", "silver");
		loco68 = new Locomotive("Trevor", null, false, "Aveling and Porter Foster Traction Engine", "dark green");
		loco69 = new Locomotive("Porter", null, false, "H.K. Porter 0-6-0ST", "viridian");
		loco70 = new Locomotive("Bear", null, false, "BR Class 35 \"Hymek\"", "green");
		
		test.insert(loco6);
		test.insert(loco44);
		test.insert(loco62);
		test.insert(loco2);
		test.insert(loco4);
		test.insert(loco10);
		test.insert(loco11);
		test.insert(loco15);
		test.insert(loco20);
		test.insert(loco3);
		test.insert(loco35);
		test.insert(loco31);
		test.insert(loco65);
		test.insert(loco5);
		test.insert(loco60);
		test.insert(loco24);
		test.insert(loco14);
		test.insert(loco16);
		test.insert(loco54);
		test.insert(loco34);
		test.insert(loco32);
		test.insert(loco12);
		test.insert(loco31);
		test.insert(loco50);
		test.insert(loco8);
		test.insert(loco3);
		test.insert(loco19);
		test.insert(loco39);
		test.insert(loco51);
		test.insert(loco21);
		test.insert(loco9);
		test.insert(loco47);
		test.insert(new Locomotive("Charlie", 14, true, "Manning Wardle L", "purple"));
		test.insert(loco70);
		test.insert(loco38);
		test.insert(loco54);
		test.insert(loco28);
		test.insert(loco23);
		test.insert(loco59);
		test.insert(loco24);
		test.insert(new Locomotive("Stanley", null, false, "\"Wissington\" 1700 and Austin I", "white"));
		test.insert(loco22);
		test.insert(loco43);
		test.insert(loco26);
		test.insert(new Locomotive("Philip", 68, true, "PRR A6 Boxcab", "green and yellow"));
		test.insert(loco13);
		test.insert(loco45);
		test.insert(loco17);
		test.insert(loco56);
		test.insert(loco66);
		test.insert(loco63);
		test.insert(loco11);
		test.insert(loco37);
		test.insert(loco69);
		test.insert(loco27);
		test.insert(loco26);
		test.insert(loco36);
		test.insert(loco61);
		test.insert(loco42);
		test.insert(loco52);
		test.insert(loco7);
		test.insert(loco21);
		test.insert(loco7);
		test.insert(new Locomotive("Oliver", 11, true, "GWR 14XX", "green"));
		test.insert(loco29);
		test.insert(loco41);
		test.insert(loco30);
		test.insert(new Locomotive("Nia", 18, true, "KUR EAR 11", "orange"));
		test.insert(loco64);
		test.insert(loco40);
		test.insert(loco55);
		test.insert(loco6);
		test.insert(loco5);
		test.insert(loco58);
		test.insert(loco1);
		test.insert(loco18);
		test.insert(loco46);
		test.insert(new Locomotive("Toad", null, false, "GWR Toad Brakevan", "grey"));
		
		test.search(loco5);
		test.search(loco17);
		test.search(loco21);
		test.search(loco26);
		
		test.preOrder();
		
		LocomotiveBSTree copy = test.copy();
		
		System.out.println("\nI'm going to remove " + loco2.getName() + "\n");
		test.remove(loco2);
		
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		
		System.out.println("\nI'm going to remove " + loco15.getName());
		test.remove(loco15);
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		
		System.out.println("\nI'm going to add " + loco13.getName());
		test.insert(loco13);
		
		System.out.println("\nNow the tree looks like...\n");
		test.inOrder();
		
		
		System.out.println("\nI'm going to remove " + test.root().getName());
		test.remove(test.root().getData());
		
		System.out.println("\nNow the tree looks like...\n");
		test.postOrder();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Copy currently looks like...");
		copy.preOrder(); //prints out all elements in 'copy'
		
		
		System.out.println("\nGonna insert some elements...\n");
		
		copy.insert(new Locomotive("Annie and Clarabel", null, false, "LBSCR Stroudley Coaches", "light brown"));
		copy.insert(new Locomotive("Bradford", null, false, "LMS 20 ton brakevan", "green"));
		copy.insert(loco13);
		copy.insert(loco5);
		copy.insert(loco24);
		copy.insert(loco30);
		copy.insert(loco10);
		copy.insert(loco40);
		copy.insert(loco22);
		
		System.out.println("\nNow the tree looks like...\n");
		copy.postOrder();
		
		
		System.out.println("\nGonna remove some crap...\n");
		copy.remove(loco19); //remove Bash and Dash
		copy.remove(loco8); //remove Arthur
		copy.remove(loco13); //remove Norman
		copy.remove(loco9); //remove 'Arry and Bert
		
		
		copy.search(loco11);
		copy.search(loco16);
		copy.search(loco5);
		
		
		System.out.println("\nNow the tree looks like...\n");
		copy.inOrder();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
