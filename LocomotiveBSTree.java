package BSTree;

public class LocomotiveBSTree 
{
	private LocomotiveBSNode root; //the root of the tree
	
	/**
	 * Constructor initializes empty tree
	 */
	public LocomotiveBSTree()
	{
		root = null;
	}

	/**
	 * inserts a new node on the tree
	 * @param data - data to be in the node
	 * @return 1 if successfully placed, 0 if otherwise
	 */
	public int insert(Locomotive data)
	{
		LocomotiveBSNode newNode = new LocomotiveBSNode(data); //new node being created
		
		if (root == null)
		{
			insertRoot(newNode); //set root to 'newNode' if root is null
			return 1;
		}
		
		else if (root.compareTo(data) == -1)
		{
			LocomotiveBSNode cursor = root;
			LocomotiveBSNode cursorParent = cursor;
			
			while (cursor != null)
			{
				cursorParent = cursor; //pointer to keep track of parent node
				cursor = cursor.getRightChild(); 
				
				if (cursorParent.compareTo(data) == 1)
				{
					cursor = cursorParent.getLeftChild(); //traverse leftward if cursorParent's data is greater than data to be inserted
				}
				
				if (cursorParent.compareTo(data) == 0)
				{
					System.out.println(data.getName() + " is in the tree already!"); //print message stating data is already in tree
					return 1;
				}
				
				if (cursorParent.isLeaf() || cursor == null)
				{
					if (cursorParent.compareTo(data) == 1)
					{
						cursor = newNode; //assign newNode to cursor
						cursorParent.setLeftChild(cursor); //set left child of cursorParent to 'newNode' if cursorParent is larger
						return 1;
					}
					
					else
					{
						if (cursorParent.compareTo(data) == -1)
						{
							cursor = newNode;
							cursorParent.setRightChild(cursor);
							return 1;
						}
					}
				}
				
				
			}
			
		}
		
		else
		{
			LocomotiveBSNode cursor = root;
			LocomotiveBSNode cursorParent = cursor;
				
			while (cursor != null)
			{
				cursorParent = cursor;
				cursor = cursor.getLeftChild();
					
				if (cursorParent.compareTo(data) == -1)
				{
					cursor = cursorParent.getRightChild();
				}
				
				if (cursorParent.compareTo(data) == 0)
				{
					System.out.println(data.getName() + " is in the tree already!"); 
					return 1;
				}
					
				if (cursorParent.isLeaf() || cursor == null)
				{
					if (cursorParent.compareTo(data) == 1)
					{
						cursor = newNode; //assign newNode to cursor
						cursorParent.setLeftChild(cursor);
						return 1;
					}
						
					else
					{
						if (cursorParent.compareTo(data) == -1)
						{
							cursor = newNode;
							cursorParent.setRightChild(cursor);
							return 1;
						}
					}	
						
					}
					
				}
			}
		
		return 0;
	}
	
	/**
	 * removes node with data specified from tree and replaces it with next suceeding node (e.g. replaces node with right child if right child exists)
	 * @param data - data contained within node, the latter of which is to be removed
	 * @return 1 if node removed and replaced, 0 if otherwise
	 */
	public int remove(Locomotive data)
	{
		if (root.compareTo(data) == 0)
		{
			if (root.isLeaf())
			{
				insertRoot(null);
				return 1;
			}
			
			else if (root.getLeftChild() != null && root.getRightChild() == null)
			{
				insertRoot(root.getLeftChild());
				return 1;
			}
			
			else if (root.getRightChild() != null && root.getLeftChild() == null)
			{
				insertRoot(root.getRightChild());
				return 1;
			}
			
			else
			{
				if (root.getRightChild() != null)
				{
					LocomotiveBSNode leftSubtree = null; //left subtree of node being removed (if it exists)
		
					if (root.getLeftChild() != null)
					{
						leftSubtree = root.getLeftChild(); //get left subtree of original root
					}
				
					insertRoot(root.getRightChild()); //insert new root node
					
					if (leftSubtree != null)
						reinsert(leftSubtree, root); //re-insert former root's left subtree
					
					return 1;
				}
			}
			
		}
		
		else if (root.compareTo(data) == -1)
		{
			LocomotiveBSNode nodeRemoved = root;
			LocomotiveBSNode parent = nodeRemoved;
			
			while (nodeRemoved != null)
			{
				parent = nodeRemoved;
				nodeRemoved = nodeRemoved.getRightChild();
				
				if (parent.compareTo(data) == 1)
				{
					nodeRemoved = parent.getLeftChild();
				}
				
				if (nodeRemoved.compareTo(data) == 0)
				{
					if (nodeRemoved.isLeaf())
					{
						if (parent.compareTo(data) == 1)
						{
							nodeRemoved = null;
							parent.setLeftChild(nodeRemoved);
							return 1;
						}
						
						else
						{
							nodeRemoved = null;
							parent.setRightChild(nodeRemoved);
							return 1;
						}
					}
					
					else if (nodeRemoved.getLeftChild() != null && nodeRemoved.getRightChild() == null)
					{
						nodeRemoved = nodeRemoved.getLeftChild(); 
						
						if (parent.compareTo(nodeRemoved.getData())==1)
							parent.setLeftChild(nodeRemoved);
						else
							parent.setRightChild(nodeRemoved);
						
						return 1;
					}
					
					else if (nodeRemoved.getRightChild() != null && nodeRemoved.getLeftChild() == null)
					{
						nodeRemoved = nodeRemoved.getRightChild();
						
						if (parent.compareTo(nodeRemoved.getData())==1)
							parent.setLeftChild(nodeRemoved);
						else
							parent.setRightChild(nodeRemoved);
						
						return 1;
					}
					
					else
					{
						if (nodeRemoved.getRightChild() != null)
						{
							LocomotiveBSNode leftSubtree = null; //left subtree of node being removed (if it exists)
							
							if (nodeRemoved.getLeftChild() != null)
							{
								leftSubtree = nodeRemoved.getLeftChild();
							}
							
							nodeRemoved = nodeRemoved.getRightChild();
							
							if (parent.compareTo(nodeRemoved.getData()) == 1)
								parent.setLeftChild(nodeRemoved);
							else
								parent.setRightChild(nodeRemoved);
							
							if (leftSubtree != null)
								reinsert(leftSubtree, root); //reinsert 'leftSubtree'
							
							return 1;
						}
					}
				}
			}
		}
		
		else
		{
			LocomotiveBSNode nodeRemoved = root;
			LocomotiveBSNode parent = nodeRemoved;
			
			while (nodeRemoved != null)
			{
				parent = nodeRemoved;
				nodeRemoved = nodeRemoved.getLeftChild();
				
				if (parent.compareTo(data) == -1)
				{
					nodeRemoved = parent.getRightChild();
				}
				
				if (nodeRemoved.compareTo(data) == 0)
				{
					if (nodeRemoved.isLeaf())
					{
						if (parent.compareTo(data) == 1)
						{
							nodeRemoved = null;
							parent.setLeftChild(nodeRemoved);
							return 1;
						}
						
						else
						{
							nodeRemoved = null;
							parent.setRightChild(nodeRemoved);
							return 1;
						}
					}
					
					else if (nodeRemoved.getLeftChild() != null && nodeRemoved.getRightChild() == null)
					{
						nodeRemoved = nodeRemoved.getLeftChild(); 
						
						if (parent.compareTo(nodeRemoved.getData())==1)
							parent.setLeftChild(nodeRemoved);
						else
							parent.setRightChild(nodeRemoved);
						
						return 1;
					}
					
					else if (nodeRemoved.getRightChild() != null && nodeRemoved.getLeftChild() == null)
					{
						nodeRemoved = nodeRemoved.getRightChild();
						
						if (parent.compareTo(nodeRemoved.getData())==1)
							parent.setLeftChild(nodeRemoved);
						else
							parent.setRightChild(nodeRemoved);
						
						return 1;
						
					}
					
					else
					{
						if (nodeRemoved.getRightChild() != null)
						{
							LocomotiveBSNode leftSubtree = null; //left subtree of node being removed (if it exists)
		
							if (nodeRemoved.getLeftChild() != null)
							{
								leftSubtree = nodeRemoved.getLeftChild();
							}
							
							nodeRemoved = nodeRemoved.getRightChild();
							
							if (parent.compareTo(nodeRemoved.getData()) == 1)
								parent.setLeftChild(nodeRemoved);
							else
								parent.setRightChild(nodeRemoved);
							
							if (leftSubtree != null)
								reinsert(leftSubtree, root); //reinsert 'leftSubtree'
							
							return 1;
						}
					}
				}
			}
		}
		
		return 0;
	}

	/**
	 * returns root node of tree
	 * @return 'root' field
	 */
	public LocomotiveBSNode root()
	{
		return root;
	}
	
	/**
	 * calls private inOrder method
	 */
	public void inOrder()
	{
		inOrder(root);
	}
	
	/**
	 * calls private preOrder method
	 */
	public void preOrder()
	{
		preOrder(root);
	}
	
	/**
	 * calls private postOrder method
	 */
	public void postOrder()
	{
		postOrder(root);
	}
	
	/**
	 * calls private 'search' method
	 * @param data - data to be located in tree
	 */
	public void search(Locomotive data)
	{
		search(root, data);
	}
	
	/**
	 * prints all keys in ascending order (leftmost subtree to right)
	 * @param root - to recurse through the left and right subtrees
	 */
	private void inOrder(LocomotiveBSNode root)
	{
		if (root == null)
		{
			return; //base case
		}
		
		inOrder(root.getLeftChild()); //recursively loops through left subtree
		System.out.println(root.getName() + " "); //prints name field of Locomotive data in nodes
		inOrder(root.getRightChild()); //recursively loops through right subtree
	}
	
	/**
	 * prints out left and right subtrees then finally the root
	 * @param root - to recurse left and right subtrees
	 */
	private void postOrder(LocomotiveBSNode root)
	{
		if (root == null)
		{
			return; //base case
		}
		
		postOrder(root.getLeftChild()); //start with left subtree
		postOrder(root.getRightChild()); //proceed to right subtree
		System.out.println(root.getName() + " ");
	}
	
	/**
	 * prints root then left subtree followed by right subtree, both of the latter in descending order
	 * @param root - to recur down left and right subtrees
	 */
	private void preOrder(LocomotiveBSNode root)
	{
		if (root == null)
		{
			return; //base case
		}
		
		System.out.println(root.getName() + " ");
		preOrder(root.getLeftChild()); //recurse down left subtree
		preOrder(root.getRightChild()); //recurse down right subtree
	}
	
	/**
	 * recursively looks at left and right subtree to look for a node's existence
	 * @param root - to recursively search left and right subtree
	 * @param target - the data to be searched for
	 */
	private void search(LocomotiveBSNode root, Locomotive target)
	{
		if (root == null)
			return; //base case
		
		if (root.compareTo(target) == 0)
		{
			System.out.println(target);
			return;
		}
		
		else if (root.compareTo(target) == 1)
		{
			search(root.getLeftChild(), target);
		}
		
		else
		{
			search(root.getRightChild(), target);
		}
		
		
		
	}
	
	/**
	 * returns a LocomotiveBSTree object that is a deep copy of this current object
	 * @return reference to deep copy of this instance's data
	 */
	public LocomotiveBSTree copy()
	{
		LocomotiveBSTree copy = new LocomotiveBSTree(); //a new LocomotiveBSTree object to hold all current instance's data
		
		copy(copy, root); //calls copy method to do the actual copying
		
		return copy;
	}
	
	/**
	 * private method recursively inserts each node into 'tree''s nodes
	 * @param tree - to hold the copy of this instance's data
	 * @param node - to recurse leftward and rightward
	 */
	private void copy(LocomotiveBSTree tree, LocomotiveBSNode node)
	{
		if (node == null)
			return; //base case
		
		tree.insert(node.getData()); //insert node's data into 'tree'
		
		copy(tree, node.getLeftChild()); //recurse leftward
		copy(tree, node.getRightChild()); //recurse rightward
		
	}
	
	/**
	 * to re-insert left child's subtree of removed node that has 2 children
	 * @param reinserted_Node - left subtree of node being removed
	 * @param parent - parent node while searching for insertion spot
	 */
	private void reinsert(LocomotiveBSNode reinserted_Node, LocomotiveBSNode parent)
	{
		
		if (parent.compareTo(reinserted_Node.getData()) == 1)
		{
			if (parent.getLeftChild() == null)
			{
				parent.setLeftChild(reinserted_Node); //set re-inserted node as parent's left child if parent is greater than re-inserted node
				return;
			}
		}
		
		else
		{
			if (parent.getRightChild() == null)
			{
				parent.setRightChild(reinserted_Node); //set re-inserted node as right child of 'parent' otherwise
				return;
			}
		}
		
		
		if (parent.compareTo(reinserted_Node.getData()) == 1)
		{
			reinsert(reinserted_Node, parent.getLeftChild()); //recurse leftward if parent is greater
		}
		
		else
		{
			if (parent.compareTo(reinserted_Node.getData()) == -1)
			{
				reinsert(reinserted_Node, parent.getRightChild()); //recurse rightward otherwise 
			}
		}
			
	}
	
	/**
	 * private method to instantiate the root node of the tree
	 * @param rootNode - new root node of the tree
	 */
	private void insertRoot(LocomotiveBSNode rootNode)
	{
		root = rootNode;
	}
	
}
