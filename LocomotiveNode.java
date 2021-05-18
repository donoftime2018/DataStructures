package LinkedList;

public class LocomotiveNode implements Comparable
{
	private Locomotive data; //the node's data
	private LocomotiveNode link; //reference to next node in the list
	
	/**
	 * Constructor assigns parameter value to 'data' field
	 * @param locoObj - data to be assigned to the node
	 */
	public LocomotiveNode(Locomotive locoObj)
	{
		data = locoObj;
		link = null;
	}

	/**
	 * setLink assigns parameter value to link
	 * @param link - the node to be assigned as this node's link
	 */
	public void setLink(LocomotiveNode link)
	{
		this.link = link;
	}
	
	/**
	 * getLink returns reference to next node in the list 
	 * @return reference to preceding node
	 */
	public LocomotiveNode getLink()
	{
		return link;
	}
	
	/**
	 * returns data stored in the node
	 * @return - toString of 'data'
	 */
	public Locomotive getData()
	{
		return data;
	}
	
	/**
	 * 
	 * @param data
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

