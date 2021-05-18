package LinkedList;
import java.io.*;

public class LocomotiveLinkedListTest {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		LocomotiveLinkedList list = new LocomotiveLinkedList(); //creates a new LocomotiveLinkedList object
		LocomotiveLinkedList copy;
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20;
		Locomotive loco21, loco22, loco23, loco24, loco25, loco26, loco27, loco28, loco29, loco30;
		
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
		loco16 = new Locomotive("Belle", 6120, true, "LMS Ivatt 2MT", "prussian blue");
		loco17 = new Locomotive("Bill and Ben", null, false, "Alfredy and Judy", "golden yellow");
		loco18 = new Locomotive("Bertram", null, false, "Prince", "dark brown");
		loco19 = new Locomotive("Bash and Dash", null, false, "Bear Harbor Lumber Company 1", "blue and orange");
		loco20 = new Locomotive("Neville", 30010, true, "SR Bulleid Q1", "black");
		loco21 = new Locomotive("Donald", 9, true, "CR 812", "black");
		loco22 = new Locomotive("Duck", 8, true, "GWR 57xx", "green");
		loco23 = new Locomotive("Gordon", 4, true, "LNER A3", "blue");
		loco24 = new Locomotive("Charlie", 14, true, "Manning Wardle L", "purple");
		loco25 = new Locomotive("Hiro", 51, true, "JNR D51", "black");
		
		list.insert(new Locomotive("Molly", null, false, "Claud Hamilton", "yellow"));
		list.insert(loco4);
		list.insert(loco3);
		list.insert(new Locomotive("Mavis", null, false, "BR Class 04", "black"));
		list.insert(loco1);
		list.insert(loco19);
		list.insert(new Locomotive("James", 5, true, "LYR Class 28", "red"));
		list.insert(loco20);
		list.insert(new Locomotive("Theo", null, false, "\"Blue Circle\"", "dark brown and green"));
		list.insert(loco8);
		list.insert(new Locomotive("Frankie", 4002, true, "MSC 4002", "blue-green"));
		list.insert(loco15);
		list.insert(new Locomotive("Samson", null, false, "Neilson High Harrington Ironworks Saddletank", "viridian"));
		list.insert(loco11);
		list.insert(loco23);
		list.insert(loco5);
		list.insert(loco11);
		list.insert(new Locomotive("Duke", null, false, "Prince", "brown"));
		list.insert(new Locomotive("Gator", null, false, "Colombian Steam Motor", "green"));
		list.insert(loco16);
		list.insert(loco14);
		list.insert(new Locomotive("Toby", 7, true, "LNER J70", "brown"));
		list.insert(loco17);
		list.insert(new Locomotive("Whiff", null, false, "NER 66 \"Aerolite\"", "dark green"));
		list.insert(loco12);
		list.insert(loco7);
		list.insert(new Locomotive("Stepney", 55, true, "LBSCR A1x Terrier \"Stepney\"", "goldenrod"));
		list.insert(loco7);
		list.insert(new Locomotive("Dart", null, false, "Bagnall Diesel Shunter", "red and yellow"));
		list.insert(new Locomotive("Vinnie", 6400, true, "CR U4a", "blue and grey"));
		list.insert(loco2);
		list.insert(new Locomotive("Den ", null, false, "Rolls Royce Sentinel Hydraulic", "blue and orange"));
		list.insert(new Locomotive("Whiff", null, false, "NER 66 \"Aerolite\"", "dark green"));
		list.insert(loco6);
		list.insert(new Locomotive("Frieda", 409, true, "DB 10", "blue"));
		list.insert(loco19);
		list.insert(new Locomotive("Rosie", 37, true, "SR USA 100", "red"));
		list.insert(loco10);
		list.insert(loco7);
		list.insert(new Locomotive("Toby", 7, true, "LNER J70", "brown"));
		list.insert(loco9);
		list.insert(new Locomotive("Shooting Star", 4, true, "Streamlined PRR K4", "light blue, dark blue, red"));
		list.insert(loco18);
		list.insert(loco3);
		list.insert(new Locomotive("Ryan", 1014, true, "GNR N2", "purple"));
		list.insert(new Locomotive("Spencer", null, false, "LNER A4", "silver"));
		list.insert(new Locomotive("Donald", 9, true, "CR 812", "black"));
		list.insert(new Locomotive("Douglas", 10, true, "CR 812", "black"));
		list.insert(loco5);
		list.insert(loco2);
		list.insert(new Locomotive("Rosie", 37, true, "SR USA 100", "red"));
		list.insert(loco13);
		list.insert(loco13);
		list.insert(loco24);
		list.insert(new Locomotive("Emily", 12, true, "GNR Stirling Single", "emerald green"));
		list.insert(new Locomotive("Duck", 8, true, "GWR 6400", "green"));
		list.insert(new Locomotive("Ferdinand", null, false, "Climax Class C", "teal"));
		list.insert(new Locomotive("Merlin", 783, true, "LSWR N15", "silver"));
		list.insert(new Locomotive("Yong Bao", null, false, "Chinese Railways RM", "red"));
		list.insert(new Locomotive("Thomas", 1, true, "LBSCR E2", "blue"));
		list.insert(new Locomotive("Paxton", null, false, "BR Class 08", "dark green"));
		list.insert(new Locomotive("Oliver", 11, true, "GWR 14xx", "green"));
		list.insert(new Locomotive("Ryan", 1014, true, "GNR N2", "purple"));
		list.insert(new Locomotive("Spencer", null, false, "LNER A4", "silver"));
		list.insert(new Locomotive("Donald", 9, true, "CR 812", "black"));
		list.insert(new Locomotive("Douglas", 10, true, "CR 812", "black"));
		
		copy = list.copy(); //make a copy of 'list' 
		
		list.display();
		
		System.out.println("Gonna remove some stuff\n\n\n\n");
		list.remove(loco7);
		list.remove(loco5);
		list.remove(new Locomotive("Yong Bao", null, false, "Chinese Railways RM", "red"));
		list.remove(loco9);
		list.insert(new Locomotive("Victor", 1174, true, "\"Minaz\" No. 1174", "yellow and green"));
		
		list.display();
		
		list.search(loco13);
		list.search(loco11);
		list.search(loco5);
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		copy.remove(loco9);
		copy.insert(new Locomotive("Annie and Clarabel", null, false, "LBSCR Stroudley Coaches", "light brown"));
		copy.insert(new Locomotive("Rusty", 5, true, "Midlander", "orange"));
		copy.insert(new Locomotive("Rheneas", 2, true, "\"Dolgoch\"", "crimson"));
		copy.display();
		
	}
}
