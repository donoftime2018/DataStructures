package BSTree;

public class BSNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locomotive locoObj1 = new Locomotive("James the Red Engine", 5, true, "L&YR Class 28", "red"); //creates a new Locomotive object
		Locomotive locoObj2 = new Locomotive("Edward the Blue Engine", 2, true, "FR K2", "blue");
		Locomotive locoObj3 = new Locomotive("Rusty the Little Diesel", 5, true, "Midlander", "orange");
		
		LocomotiveBSNode node1 = new LocomotiveBSNode(locoObj1); //creates a new LocomotiveBSNode object
		LocomotiveBSNode node2 = new LocomotiveBSNode(locoObj2);
		LocomotiveBSNode node3 = new LocomotiveBSNode(locoObj3);
		
		System.out.println(node1.compareTo(locoObj2));
		System.out.println(node2.compareTo(locoObj1));
		System.out.println(node1.compareTo(locoObj3));
	}

}
