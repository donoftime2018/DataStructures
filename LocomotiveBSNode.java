package BSTree;

public class LocomotiveBSNode implements Comparable
{
	private LocomotiveBSNode right; //reference to right child
	private LocomotiveBSNode left; //reference to left child
	private Locomotive data; //data of the node
	
	/**
	 * Constructor assigns parameter argument to 'data' field and sets left and right children to null
	 * @param loco - the data of the node
	 */
	public LocomotiveBSNode(Locomotive loco)
	{
		data = loco;
		right = left = null;
	}
	
	/**
	 * returns right child of this BSNode
	 * @return 'right' field
	 */
	public LocomotiveBSNode getRightChild()
	{
		return right;
	}
	
	/**
	 * returns left child of BSNode
	 * @return 'left' field
	 */
	public LocomotiveBSNode getLeftChild()
	{
		return left;
	}
	
	/**
	 * returns 'data' stored in BSNode
	 * @return 'data' field
	 */
	public Locomotive getData()
	{
		return data;
	}
	
	/**
	 * returns the name of the locomotive (Locomotive's 'name' field)
	 * @return accessor method to data's 'name' field
	 */
	public String getName()
	{
		return data.getName();
	}
	
	/**
	 * sets the right child of the node
	 * @param rightChild - the right child to be assigned to 'right' field
	 */
	public void setRightChild(LocomotiveBSNode rightChild)
	{
		right = rightChild;
	}
	
	/**
	 * sets the left child of node
	 * @param leftChild - the left child to be assigned 'left' field
	 */
	public void setLeftChild(LocomotiveBSNode leftChild)
	{
		left = leftChild;
	}
	
	
	/**
	 * determines whether node is a leaf or not
	 * @return boolean expression of right and left children being null
	 */
	public boolean isLeaf()
	{
		return (right == null && left == null);
	}
	
	/**
	 * sets the data field to 'data' parameter
	 * @param data - data to be assigned to 'data' field
	 */
	public void setData(Locomotive data)
	{
		this.data = data;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Locomotive l = (Locomotive) o;
		
		return data.compareTo(l);
	}
	
	
}
