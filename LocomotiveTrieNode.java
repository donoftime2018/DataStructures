package Trie;

public class LocomotiveTrieNode 
{
	
	private static int ALPHABET_SIZE = 26;
	
	private char letter; //letter that this paritcular trie node is holding
	private int letterCount; //how many instances of this letter is in the trie
	private int wordCount; //how many instances a particular word appears in the trie
	
	private LocomotiveTrieNode children[] = new LocomotiveTrieNode[ALPHABET_SIZE]; //array of children node of this particular trie node
	
	/**
	 * Constructor initializes 'letter' field with a value
	 * @param l - value to be assigned to 'letter' field
	 */
	public LocomotiveTrieNode(char l)
	{
		this.letter = l;
	}
	
	/**
	 * setter method that sets 'letter' to actual parameter specified by user
	 * @param letter - char literal to be assigned to 'letter' field
	 */
	public void setLetter(char letter)
	{
		this.letter = letter;
	}
	
	/**
	 * initializes the specified child node
	 * @param position - particular element in 'children' array to be initialized
	 */
	private void initializeChild(int position)
	{
		if (children[position] == null)
			children[position] = new LocomotiveTrieNode(' ');
		else
			; //do nothing if node is already initialized
	}
	
	/**
	 * returns a specific child node based on letter passed in after checking if node is initialized or not -- FOR INSERTION ONLY
	 * @param letter - letter that determines child node returned
	 * @return the specific child node that corresponds to the letter passed in
	 */
	public LocomotiveTrieNode initializeChildNode(char letter)
	{
		
		switch(letter) //choose child node based on value of 'letter'
		{
			case 'a':
				initializeChild(0); //call initializeChild method to initialize the child node if needed
				return children[0];
			
			case 'b':
				initializeChild(1);
				return children[1];
				
			case 'c':
				initializeChild(2);
				return children[2];
			
			case 'd':
				initializeChild(3);
				return children[3];
			
			case 'e':
				initializeChild(4);
				return children[4];
			
			case 'f':
				initializeChild(5);
				return children[5];
			
			case 'g':
				initializeChild(6);
				return children[6];
			
			case 'h':
				initializeChild(7);
				return children[7];
			
			case 'i':
				initializeChild(8);
				return children[8];
				
			case 'j':
				initializeChild(9);
				return children[9];
				
			case 'k':
				initializeChild(10);
				return children[10];
			
			case 'l':
				initializeChild(11);
				return children[11];
			
			case 'm':
				initializeChild(12);
				return children[12];
			
			case 'n':
				initializeChild(13);
				return children[13];
			
			case 'o':
				initializeChild(14);
				return children[14];
			
			case 'p':
				initializeChild(15);
				return children[15];
			
			case 'q':
				initializeChild(16);
				return children[16];
				
			case 'r':
				initializeChild(17);
				return children[17];
			
			case 's':
				initializeChild(18);
				return children[18];
			
			case 't':
				initializeChild(19);
				return children[19];
				
			case 'u':
				initializeChild(20);
				return children[20];
			
			case 'v':
				initializeChild(21);
				return children[21];
				
			case 'w':
				initializeChild(22);
				return children[22];
			
			case 'x':
				initializeChild(23);
				return children[23];
			
			case 'y':
				initializeChild(24);
				return children[24];
			
			default: //so that the method won't have an error of no return value
				initializeChild(25);
				return children[25];
		}
	}
	
	/**
	 * returns a specific child of trie node without initialization -- FOR DELETION AND SEARCHING ONLY
	 * @param letter - determines which child in 'children' is returned
	 * @return - one child node based on value of 'letter' parameter 
	 */
	public LocomotiveTrieNode getChild(char letter)
	{
		switch (letter)
		{
			case 'a':
				return children[0];
			
			case 'b':
				return children[1];
				
			case 'c':
				return children[2];
			
			case 'd':
				return children[3];
			
			case 'e':
				return children[4];
			
			case 'f':
				return children[5];
			
			case 'g':
				return children[6];
			
			case 'h':
				return children[7];
			
			case 'i':
				return children[8];
				
			case 'j':
				return children[9];
				
			case 'k':
				return children[10];
			
			case 'l':
				return children[11];
			
			case 'm':
				return children[12];
			
			case 'n':
				return children[13];
			
			case 'o':
				return children[14];
			
			case 'p':
				return children[15];
			
			case 'q':
				return children[16];
				
			case 'r':
				return children[17];
			
			case 's':
				return children[18];
			
			case 't':
				return children[19];
				
			case 'u':
				return children[20];
			
			case 'v':
				return children[21];
				
			case 'w':
				return children[22];
			
			case 'x':
				return children[23];
			
			case 'y':
				return children[24];
			
			default: //so that the method won't have an error of no return value
				return children[25];
		}
	}

	/**
	 * returns one out of 26 specific child nodes in 'children' based on value of 'i' -- USE ONLY FOR DISPLAYING ALL CONTENTS IN TRIE
	 * @param i - index in 'children' whose contents are being returned
	 * @return - child node in 'children' at position 'i'
	 */
	public LocomotiveTrieNode getChild(int i)
	{
		return children[i];
	}
	
	/**
	 * increase letterCount field
	 */
	public void increaseLetterCount()
	{
		letterCount++;
	}
	
	/**
	 * decrease letterCount field
	 */
	public void decreaseLetterCount()
	{
		letterCount--;
	}
	
	/**
	 * increase wordCount field
	 */
	public void increaseWordCount()
	{
		wordCount++;
	}
	
	/**
	 * decrease wordCount field
	 */
	public void decreaseWordCount()
	{
		wordCount--;
	}
	
	/**
	 * getter method to retrieve 'wordCount' field
	 * @return - how many times 'word' appears in trie
	 */
	public int getWordCount()
	{
		return wordCount;
	}
	
	/**
	 * getter method to retrieve 'letterCount' field
	 * @return - how many times this specific letter appears in trie
	 */
	public int getLetterCount()
	{
		return letterCount;
	}
	
	/**
	 * determines if this trie node is a leaf or not
	 * @return - false if non-null child nodes exist, true if otherwise
	 */
	public boolean isLeaf()
	{
		for (int i = 0; i < ALPHABET_SIZE; i++)
		{
			if (children[i] != null)
			{
				return false; //when first non-null node shows up return false
			}
		}
		
		return true;
	}
	
	/**
	 * returns all the children, null or not, of the trie node
	 * @return - 'children' field that contains all (un)initialized children
	 */
	public LocomotiveTrieNode[] getChildren()
	{
		return children;
	}
	
	/**
	 * returns letter stored in this node
	 * @return - the letter field
	 */
	public char getLetter()
	{
		return letter;
	}

	/**
	 * returns value of static 'ALPHABET_SIZE' field
	 * @return - number of child nodes for each LocomotiveTrieNode object
	 */
	public static int getAlphabetSize()
	{
		return ALPHABET_SIZE;
	}

	/**
	 * checks if there are any remaining letters in any of this node's children
	 * @return - true if more letters were found, false if otherwise
	 */
	public boolean moreLetters()
	{
		for (int i = 0; i < ALPHABET_SIZE; i++)
		{
			if (children[i] != null)
			{
				if (children[i].getLetter() != ' ' && children[i].getLetterCount() > 0)
				{
					return true; //if the first non-null child node contains a letter then there are more letters 
				}
			}
		}

		return false; //there aren't any more letters
	}
	
}
