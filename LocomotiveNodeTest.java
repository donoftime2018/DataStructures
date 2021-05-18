package LinkedList;

public class LocomotiveNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locomotive locoObj1, locoObj2, locoObj3; //declares 3 reference variables to 'Locomotive' objects
		LocomotiveNode locoNode1, locoNode2, locoNode3; //declare 3 reference variables to 'LocomotiveNode' objects
		
		locoObj1 = new Locomotive("Arthur", null, false, "LMS Ivatt 2MT", "red");
		locoObj2 = new Locomotive("Paxton", null, false, "BR Class 08", "green");
		locoObj3 = new Locomotive("Billy", null, false, "Manning Wardle L", "orange");
		
		locoNode1 = new LocomotiveNode(locoObj1);
		locoNode2 = new LocomotiveNode(locoObj2);
		locoNode3 = new LocomotiveNode(locoObj3);
		
		locoNode1.setLink(locoNode2); //sets 'locoNode2' as locoNode1's link
		locoNode2.setLink(locoNode3);
		
		//System.out.println(locoNode1.getData());
		System.out.println(locoNode1.getLink().getData()); //prints data stored in 'locoNode1''s link
		System.out.println(locoNode2.getLink().getData());
		
		if (locoNode2.getData() == locoNode1.getLink().getData() && locoNode2 == locoNode1.getLink())
		{
			System.out.println("locoNode2 is locoNode1's link"); //compares addresses and values of node1.getLink() and node2 to determine if they are one in the same
		}
		
		System.out.println(locoNode3 == locoNode2.getLink() && locoNode3.getData() == locoNode2.getLink().getData());
		
	}

}
