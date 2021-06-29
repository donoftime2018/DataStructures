package Trie;

public class LocomotiveTrie 
{
	private LocomotiveTrieNode root;
	
	public LocomotiveTrie()
	{
		root = new LocomotiveTrieNode(' '); //initialize root to hold whitespace
	}
	
	/**
	 * adds Locomotive object's name to trie
	 * @param loco - loco whose name is to be added to trie
	 */
	public void addOccurrence(Locomotive loco)
	{
		String name = loco.getName();
		
		name = name.replaceAll("[^a-zA-Z0-9]", ""); //remove all non alpha numeric characters from 'name'
		name = name.toLowerCase(); //convert 'name' to all lower case
		
		//LocomotiveTrieNode node = root.getChildNode(name.charAt(0));
		addOccurrence(0, name, name.charAt(0), root.initializeChildNode(name.charAt(0)));
	}
	
	/**
	 * recurses through trie adding each of 'word''s letters to a specific node
	 * @param letterofWord - current letter being added
	 * @param word - entire word being added
	 * @param position - position of word we are currently at
	 * @param node - node we are adding a letter to
	 */
	private void addOccurrence(int position, String word, char letterofWord, LocomotiveTrieNode node)
	{
		node.setLetter(letterofWord); //set node's letter to 'letterofWord'
		node.increaseLetterCount(); //increase number of occurrences of specific letter
		
		if (position+1==word.length())
		{
			node.increaseWordCount(); //increase word count once we have finished inserting each letter of 'word'
			return;
		}
		
		addOccurrence(++position, word, word.charAt(position), node.initializeChildNode(word.charAt(position))); //recurse 
	}
	
	/**
	 * removes one occurrence of 'loco' from trie
	 * @param loco - loco whose occurrence in trie is to be subtracted by one
	 */
	public void removeOccurrence(Locomotive loco)
	{
		String name = loco.getName();
		
		name = name.replaceAll("[^a-zA-Z0-9]", ""); //remove all non alpha numeric characters from 'name'
		name = name.toLowerCase(); //convert 'name' to all lower case
		
		removeOccurrence(0, name, name.charAt(0), root.getChild(name.charAt(0)));
	}
	
	/**
	 * recurses through trie decrementing an occurrence of word's letters by 1'
	 * @param position - position in 'word' we are currently at
	 * @param word - entire word being removed
	 * @param letterofWord - letter of 'word' currently being removed
	 * @param node - node we are removing a letter from
	 */
	private void removeOccurrence(int position, String word, char letterofWord, LocomotiveTrieNode node)
	{
		if (node == null)
			return; //if node is null do nothing
		
		if (node.getLetterCount() == 0 && node.getLetter() == ' ')
		{
			/*
			 	code to execute
				if we deleted any letter counts and letters of 
				pre-existing words
				before reaching a node with no letters and 
				letter count of 0
			*/
			int i = 0;
			LocomotiveTrieNode nodeRetraced = root.getChild(word.charAt(i)); //start off at node that contains first letter of 'word'
			
			for (; i < position; ++i, nodeRetraced = nodeRetraced.getChild(word.charAt(i)))
			{
				nodeRetraced.setLetter(word.charAt(i)); //reset 'letter' of 'nodeRetraced'
				nodeRetraced.increaseLetterCount(); //re-increment 'letterCount'
			}
			
			return; //if letter of 'node' doesn't even exist from the get go just terminate function
		}
		
		if (node.getLetterCount() > 0) //so that 'letterCount' won't be equal to negative values
			node.decreaseLetterCount(); //decrease 'letterCount' for that node's letter
		
		if (node.getLetterCount() == 0)
			node.setLetter(' '); //if node's 'letterCount' equals 0 after decrement, remove 'letter' entirely
		
		if (position+1 == word.length())
		{
			if (node.getWordCount() > 0)
			{
				node.decreaseWordCount(); //so 'wordCount' won't have negative values
			}

			if (!node.isLeaf() && node.getWordCount() == 0 && node.getLetter() == ' ')
			{
				/*
			 	code to execute
				if we removed any letters 
				and letter counts for a pre-existing word
				*/
				node.setLetter(word.charAt(position)); //reset 'letter'
				node.increaseLetterCount(); //reset 'letterCount'

				int i = 0;
				LocomotiveTrieNode nodeRetraced = root.getChild(word.charAt(i)); //start off at node that has first letter of 'word'
			
				for (; i < position; ++i, nodeRetraced = nodeRetraced.getChild(word.charAt(i)))
				{
					nodeRetraced.setLetter(word.charAt(i)); //reset 'letter' of 'nodeRetraced'
					nodeRetraced.increaseLetterCount(); //re-increment 'letterCount'
				}
			}

			return; 
		}
		
		removeOccurrence(++position, word, word.charAt(position), node.getChild(word.charAt(position)));
	}
	
	/**
	 * searches for a locomotive and number of times it occurs in trie
	 * @param loco - loco to be searched for in trie
	 */
	public void search(Locomotive loco)
	{
		String name = loco.getName();
		
		name = name.replaceAll("[^a-zA-Z0-9]", ""); //remove all non alpha numeric characters from 'name'
		name = name.toLowerCase(); //convert 'name' to all lower case
		
		search(0, name, name.charAt(0), root.getChild(name.charAt(0)));
	}
	
	/**
	 * recurses through trie till it finds all letters of 'word' and number of times 'word' occurs in trie
	 * @param position - current position of 'word'
	 * @param word - word to be searched for
	 * @param letterofWord - current letter of 'word'
	 * @param node - current node we are at during traversal of trie
	 */
	private void search(int position, String word, char letterofWord, LocomotiveTrieNode node)
	{
		String name = word.substring(0, 1).toUpperCase() + word.substring(1); //capitalize first letter of 'word'
		
		if (node == null)
		{
			System.out.println(name + " is not in the trie"); //report that word is not in the trie
			return; //if 'node' is null, end method execution
		}
		
		if (position+1 == word.length())
		{
			if (node.getWordCount() > 0)
			{
				System.out.printf("%s appears in the trie %d times\n", name, node.getWordCount());
				return;
			} 

			else
			{
				System.out.println(name + " is not in the trie"); //if 'wordCount' is equal to 0 the word isn't in the trie
				return;
			}
		}
		
		if (node.getLetter() == letterofWord) //if node's 'letter' equals 'letterofWord' keep searching
			search(++position, word, word.charAt(position), node.getChild(word.charAt(position)));
		
		else
		{
			System.out.println(name + " is not in the trie"); //report that word is not in the trie
			return; //terminate method if letter of 'node' doesn't equal 'letterofWord'
		}
	}
	
	/**
	 * displays all words in trie and each of their respective number of occurrences
	 */
	public void display()
	{
		LocomotiveTrieNode[] children = root.getChildren(); //array containing all of the root's child nodes
		
		for (int i = 0; i < LocomotiveTrieNode.getAlphabetSize(); i++)
		{
			display(0, new char[15], children[i]); //call 'display' method for each child node
		}
	}
	
	/**
	 * recurses down trie and displays each full word and the number of occurrences of the word in the trie
	 * @param index - current position in 'letters'
	 * @param letters - to store each letter encountered in the trie
	 * @param node - the node we are traversing at any given moment in time
	 */
	private void display(int index, char letters[], LocomotiveTrieNode node)
	{
		if (node == null)
			return; //if node equals null do nothing
		
		if (node.getLetter() != ' ')
		{
			letters[index] = node.getLetter(); //add 'letter' to 'letters' at index 'index'
			++index; //increment 'index'
		}

		else
			return; //if node has no letters don't do anything
		
		if (node.getWordCount() > 0)
		{
			for (int i = index; i < letters.length; i++)
			{
				letters[i] = ' '; //remove remaining characters from previously displayed/completed names
			}

			//if a full word has been created, convert 'letters' into a String
			String name = new String(letters); 
			name = name.substring(0, 1).toUpperCase() + name.substring(1); //capitalize first letter of 'name'
			name = name.replaceAll("[^a-zA-Z0-9]", ""); //to replace all non alphanumeric characters that might be present

			System.out.printf("%s: %d\n", name, node.getWordCount()); //display 'name' and number of occurrences of name in trie
			
			if (!node.isLeaf())
			{
				for (int i = 0; i < LocomotiveTrieNode.getAlphabetSize(); i++)
				{
					display(index, letters, node.getChild(i)); //recurse down child nodes if 'node' is not a leaf (i.e. includes more letters)
				}
			}

			return; //terminate execution after full word has been composed
		}
		
		for (int i = 0; i < LocomotiveTrieNode.getAlphabetSize(); i++)
		{
			display(index, letters, node.getChild(i)); //recurse down all child nodes of 'node'
		}
	}

}
