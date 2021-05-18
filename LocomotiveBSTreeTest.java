package BSTree;
import java.io.*;

public class LocomotiveBSTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocomotiveBSTree test = new LocomotiveBSTree(); //creates new LocomotiveBSTree object
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20;
		
		loco1 = new Locomotive("Percy", 6, true, "Avonside Saddle Tank", "green");
		loco2 = new Locomotive("Billy", null, false, "Manning Wardle L", "orange");
		loco3 = new Locomotive("Fergus", null, false, "Blue Circle", "royal blue");
		loco4 = new Locomotive("Smudger", null, false, "Dolgoch", "green");
		loco5 = new Locomotive("Luke", 22, true, "Kerr Stuart Wren", "green");
		loco6 = new Locomotive("Henry", 3, true, "LMS Black 5", "green");
		loco7 = new Locomotive("Derek", null, false, "BR Class 17", "dark green");
		loco8 = new Locomotive("Arthur", null, false, "LMS Ivatt 2MT", "red");
		loco9 = new Locomotive("'Arry and Bert", null, false, "BR Class 08", "dark green and yellow");
		loco10 = new Locomotive("Rebecca", 22, true, "SR West Country Class", "yellow");
		loco11 = new Locomotive("Murdoch", null, false, "BR Standard 9F", "orange");
		loco12 = new Locomotive("Sidney", null, false, "BR Class 08", "dark blue");
		loco13 = new Locomotive("Norman", null, false, "BR Class 11001", "red");
		loco14 = new Locomotive("Dennis", 11001, true, "BR Class 11001", "grey");
		loco15 = new Locomotive("Hank", null, false, "PRR K4 Pacific", "royal blue");
		loco16 = new Locomotive("Belle", 6120, true, "LMS Ivatt 2MT", "prussian blue");
		loco17 = new Locomotive("Bill and Ben", null, false, "Alfredy and Judy", "golden yellow");
		loco18 = new Locomotive("Bertram", null, false, "Prince", "dark brown");
		loco19 = new Locomotive("Bash and Dash", null, false, "Bear Harbor Lumber Company 1", "blue and orange");
		loco20 = new Locomotive("Neville", 30010, true, "SR Bulleid Q1", "black");
		
		test.insert(new Locomotive("Mavis", null, false, "BR Class 04", "black"));
		test.insert(new Locomotive("Molly", null, false, "Claud Hamilton", "yellow"));
		test.insert(loco4);
		test.insert(loco1);
		test.insert(loco20);
		test.insert(loco8);
		test.insert(loco15);
		test.insert(loco14);
		test.insert(new Locomotive("Diesel   ", null, false, "BR Class 08", "black"));
		test.insert(loco11);
		test.insert(new Locomotive("Den ", null, false, "Rolls Royce Sentinel Hydraulic", "blue and orange"));
		test.insert(loco5);
		test.insert(loco11);
		test.insert(new Locomotive("Gator", null, false, "Colombian Steam Motor", "green"));
		test.insert(loco16);
		test.insert(loco14);
		test.insert(new Locomotive("Toby", 7, true, "LNER J70", "brown"));
		test.insert(loco17);
		test.insert(new Locomotive("Diesel 10", null, false, "BR Class 42", "ochre"));
		test.insert(loco12);
		test.insert(loco6);
		test.insert(new Locomotive("Frieda", 409, true, "DB 10", "blue"));
		test.insert(loco19);
		test.insert(loco10);
		test.insert(loco7);
		test.insert(new Locomotive("Samson", null, false, "Neilson High Harrington Ironworks Saddletank", "viridian"));
		test.insert(loco9);
		test.insert(new Locomotive("Salty", null, false, "BR Class 07", "red"));
		test.insert(new Locomotive("Shooting Star", 4, true, "Streamlined PRR K4", "light blue, dark blue, red"));
		test.insert(loco18);
		test.insert(loco3);
		test.insert(new Locomotive("Theo", null, false, "\"Blue Circle\"", "dark brown and green"));
		test.insert(loco2);
		test.insert(loco13);
		test.insert(new Locomotive("Emily", 12, true, "GNR Stirling Single", "emerald green"));
		test.insert(new Locomotive("Duck", 8, true, "GWR 6400", "green"));
		test.insert(new Locomotive("Ferdinand", null, false, "Climax Class C", "teal"));
		test.insert(new Locomotive("Merlin", 783, true, "LSWR N15", "silver"));
		test.insert(new Locomotive("Yong Bao", null, false, "Chinese Railways RM", "red"));
		test.insert(new Locomotive("Thomas", 1, true, "LBSCR E2", "blue"));
		test.insert(new Locomotive("Paxton", null, false, "BR Class 08", "dark green"));
		test.insert(new Locomotive("Oliver", 11, true, "GWR 14xx", "green"));
		test.insert(new Locomotive("Ryan", 1014, true, "GNR N2", "purple"));
		test.insert(new Locomotive("Spencer", null, false, "LNER A4", "silver"));
		test.insert(new Locomotive("Donald", 9, true, "CR 812", "black"));
		test.insert(new Locomotive("Douglas", 10, true, "CR 812", "black"));
		
		test.preOrder();
		
		LocomotiveBSTree copy = test.copy();
		
		System.out.println("\nI'm going to remove " + loco1.getName() + "\n");
		test.remove(loco1);
		
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		
		System.out.println("\nI'm going to remove " + loco15.getName());
		test.remove(loco15);
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		
		System.out.println("\nI'm going to add " + loco13.getName());
		test.insert(loco13);
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		
		System.out.println("\nI'm going to remove " + test.root().getName());
		test.remove(test.root().getData());
		
		System.out.println("\nNow the tree looks like...\n");
		test.preOrder();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Copy currently looks like...");
		copy.preOrder(); //prints out all elements in 'copy'
		
		
		System.out.println("\nGonna insert some elements...\n");
		
		copy.insert(new Locomotive("Annie and Clarabel", null, false, "LBSCR Stroudley Coaches", "light brown"));
		copy.insert(new Locomotive("Bradford", null, false, "LMS 20 ton brakevan", "green"));
		copy.insert(new Locomotive("James", 5, true, "L&YR Class 28", "red"));
		copy.insert(new Locomotive("Hugo", null, false, "Schienenzeppelin", "silver"));
		copy.insert(new Locomotive("Gordon", 4, true, "LNER A3", "blue"));
		copy.insert(new Locomotive("Whiff", null, false, "NER 66 Aerolite", "dark green"));
		copy.insert(new Locomotive("Hugo", null, false, "Schienenzeppelin", "silver"));
		copy.insert(new Locomotive("James", 5, true, "L&YR Class 28", "red"));
		copy.insert(new Locomotive("James", 5, true, "L&YR Class 28", "red"));
		copy.insert(loco13);
		copy.insert(new Locomotive("Dart", null, false, "Bagnall Diesel Shunter", "red and yellow"));
		copy.insert(new Locomotive("Hiro", 51, true, "JNR D51", "black"));
		copy.insert(new Locomotive("Charlie", 14, true, "Manning Wardle L", "purple"));
		
		System.out.println("\nNow the tree looks like...\n");
		copy.preOrder();
		
		
		System.out.println("\nGonna remove some crap...\n");
		copy.remove(loco19); //remove Bash and Dash
		copy.remove(loco8); //remove Arthur
		copy.remove(loco13); //remove Norman
		
		
		copy.search(loco11);
		copy.search(loco16);
		
		
		System.out.println("\nNow the tree looks like...\n");
		copy.preOrder();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
