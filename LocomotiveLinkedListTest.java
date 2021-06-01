package LinkedList;
import java.io.*;

public class LocomotiveLinkedListTest {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		LocomotiveLinkedList list = new LocomotiveLinkedList(); //creates a new LocomotiveLinkedList object
		LocomotiveLinkedList copy;
		
		Locomotive loco1, loco2, loco3, loco4, loco5, loco6, loco7, loco8, loco9, loco10, loco11, loco12, loco13, loco14, loco15, loco16;
		Locomotive loco17, loco18, loco19, loco20, loco21, loco22, loco23, loco24, loco25, loco26, loco27, loco28, loco29, loco30, loco31;
		Locomotive loco32, loco33, loco34, loco35, loco36, loco37, loco38, loco39, loco40;
		Locomotive loco41, loco42, loco43, loco44, loco45, loco46, loco47, loco48, loco49, loco50, loco51, loco52, loco53, loco54, loco55, loco56, loco57, loco58, loco59, loco60;
		Locomotive loco61, loco62, loco63, loco64, loco65, loco66, loco67, loco68, loco69, loco70;
		
		loco1 = new Locomotive("Percy", 6, true, "Avonside Saddle Tank", "green");
		loco2 = new Locomotive("Billy", null, false, "Manning Wardle L", "orange");
		loco3 = new Locomotive("Fergus", null, false, "\"Blue Circle\"", "royal blue");
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
		loco33 = new Locomotive("Den ", null, false, "Rolls Royce Sentinel Hydraulic", "blue and orange");
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
		
		
		list.insert(loco57); //insert 'loco57' into 'list'
		list.insert(loco45);
		list.insert(loco15);
		list.insert(loco43);
		list.insert(loco61);
		list.insert(loco7);
		list.insert(loco38);
		list.insert(loco12);
		list.insert(loco8);
		list.insert(loco65);
		list.insert(loco64);
		list.insert(loco4);
		list.insert(loco61);
		list.insert(loco35);
		list.insert(loco3);
		list.insert(loco63);
		list.insert(loco7);
		list.insert(loco40);
		list.insert(loco21);
		list.insert(loco69);
		list.insert(loco10);
		list.insert(loco33);
		list.insert(loco6);
		list.insert(loco3);
		list.insert(loco16);
		list.insert(loco52);
		list.insert(loco28);
		list.insert(loco20);
		list.insert(loco24);
		list.insert(loco46);
		list.insert(loco44);
		list.insert(loco22);
		list.insert(new Locomotive("Nia", 18, true, "KUR EDR 11", "orange"));
		list.insert(loco1);
		list.insert(loco62);
		list.insert(loco23);
		list.insert(loco67);
		list.insert(loco17);
		list.insert(loco23);
		list.insert(loco37);
		list.insert(loco51);
		list.insert(loco29);
		list.insert(loco32);
		list.insert(loco28);
		list.insert(loco35);
		list.insert(loco7);
		list.insert(loco59);
		list.insert(loco34);
		list.insert(loco13);
		list.insert(loco31);
		list.insert(loco24);
		list.insert(loco58);
		list.insert(loco37);
		list.insert(new Locomotive("Charlie", 14, true, "Manning Wardle L", "purple"));
		list.insert(loco12);
		list.insert(loco9);
		list.insert(loco18);
		list.insert(new Locomotive("Rosie", 37, true, "SR USA S100", "red"));
		list.insert(loco36);
		list.insert(loco26);
		list.insert(loco2);
		list.insert(loco1);
		list.insert(loco28);
		list.insert(loco14);
		list.insert(loco19);
		list.insert(loco32);
		list.insert(loco38);
		list.insert(loco50);
		list.insert(new Locomotive("Oliver", 11, true, "GWR 14XX AutoTank", "green"));
		list.insert(loco30);
		list.insert(loco15);
		list.insert(loco11);
		list.insert(loco5);
		list.insert(loco5);
		list.insert(loco60);
		
		
		list.display();
		
		list.search(loco21); //search for 'loco21' in 'list'
		list.search(loco26);
		list.search(loco5);
		list.search(loco22);
		list.search(loco32);
		list.search(loco63);
		list.search(loco10);
		list.search(loco8);
		list.search(loco7);
		
		copy = list.copy(); //'copy' is equal to copy of 'list'
		
		System.out.println("\n\nGonna remove some stuff\n\n\n\n\n\nNow list looks like...");
		
		list.remove(loco10); //remove 'loco10' from 'list'
		list.remove(loco46);
		list.remove(loco45);
		list.remove(loco2);
		list.remove(loco18);
		list.remove(loco13);
		list.remove(loco19);
		list.remove(loco28);
		
		list.insert(new Locomotive("Gator", null, false, "Colombian Steam Motor", "green"));
		
		list.display();
		System.out.println("\n\n\n\n\n\n\n\nCopy looks like...");
		
		
		
		
		
		
		
		copy.remove(loco13); //remove 'loco13' from 'copy'
		copy.remove(loco24);
		copy.remove(loco31);
		copy.remove(loco36);
		copy.remove(loco4);
		copy.remove(loco30);
		copy.remove(loco45);
		copy.remove(loco38);
		
		copy.insert(loco41);
		copy.insert(loco55);
		copy.insert(new Locomotive("Victor", null, false, "\"Minaz\" No. 1173", "red"));
		copy.insert(new Locomotive("Thomas", 1, true, "LBSCR E2", "blue"));
		copy.insert(new Locomotive("Salty", 2991, true, "BR Class 07", "red"));
		copy.insert(loco27);
		copy.insert(new Locomotive("Philip", 68, true, "PRR A6 Boxcab", "green and yellow"));
		copy.insert(new Locomotive("James", 5, true, "L&YR Class 28", "red"));
		copy.insert(new Locomotive("Theo", null, false, "\"Blue Circle\"", "dark brown and green"));
		copy.insert(new Locomotive("Duncan", 6, true, "\"Douglas\"", "yellow"));
		copy.insert(loco53);
		copy.insert(loco56);
		copy.insert(loco54);
		
		copy.display();
		
	}
}
