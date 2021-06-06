package Queue;

/** represents a locomotive in the Thomas & Friends universe */
public class Locomotive implements Comparable
{
	private String name; //the engine's name
	private Integer number; //the engine's number (if said engine has one)
	private boolean hasNumber; //to determine whether the engine has a number or not and act accordingly
	private String basis; //the engine's real life basis
	private String livery; //the engine's dominant livery
	
	/**
	 * initializes all of the fields listed above
	 * @param n - the name of the locomotive whose address is to be stored in 'name' field
	 * @param no - the number of the locomotive to be stored in 'number'
	 * @param hasNo - the boolean value of the existence of a Locomotive's number to be stored in 'hasNo' field
	 * @param b - the basis of the locomotive whose address is to be stored in 'basis' field
	 * @param l - the livery of the locomotive whose address is to be stored in 'livery' field
	 */
	public Locomotive(String n, Integer no, boolean hasNo, String b, String l)
	{
		name = n;
		number = no;
		hasNumber = hasNo;
		basis = b;
		livery = l;
		
		if (hasNumber == false && no != null)
		{
			System.out.println("Invalid instantiation!");
		}
		
		if (hasNumber == true && no == null)
		{
			System.out.println("Invalid instantiation!");
		}
	}
	
	@Override
	/**
	 * compares this locomotive's number to another locomotive object's number and returns -1, 1, or 0 accordingly
	 */
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Locomotive loco2 = (Locomotive) o;
		
		char[] first  = this.name.toCharArray();
		char[] second = loco2.name.toCharArray();

		int minLength = Math.min(first.length, second.length);

		for(int i = 0; i < minLength; i++)
		{
			if (first[i] < second[i])
			{
				return -1;
			}
			
			else
			{
				if (first[i] > second[i])
				{
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	/**
	 * returns the value of the 'name' field
	 * @return name field of class
	 */
	public String getName()
	{
		return name.trim();
	}
	
	/**
	 * returns a String describing the locomotive's features
	 */
	public String toString()
	{
		if (hasNumber == true)
		{
			return name.toUpperCase()
					+ "\nBasis: " + basis
					+ "\nNumber: " + number
					+ "\nLivery: " + livery + "\n";
		}
		
		else
		{
			return name.toUpperCase()
					+ "\nBasis: " + basis
					+ "\n" + name.trim() + " does not have a number"
					+ "\nLivery: " + livery + "\n";
		}
	}

}
