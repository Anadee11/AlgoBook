
class treest
{

	
	class Node
	{
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	
	Node root;

	
	treest()
	{
		root = null;
	}

	
	void insert(int key)
	{
		root = insertRec(root, key);
	}
	
	
	Node insertRec(Node root, int key)
	{

		
		if (root == null)
		{
			root = new Node(key);
			return root;
		}

		
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		
		return root;
	}
	

	void inorderRec(Node root)
	{
		if (root != null)
		{
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	void treeins(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			insert(arr[i]);
		}
		
	}


	public static void main(String[] args)
	{
		treest tree = new treest();
		int arr[] = {5, 4, 7, 2, 11};
		tree.treeins(arr);
		tree.inorderRec(tree.root);
	}
}

