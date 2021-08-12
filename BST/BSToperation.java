package BST;

public class BSToperation {
	public TreeNode root;
	int counter = 0;

	public BSToperation() {
		root = null;
	}

	public void insert(int data) {
		root = addleafNode(root, data);
	}

	private TreeNode addleafNode(TreeNode currentNode, int data) {
		counter++;
		if (currentNode == null) {
			currentNode = new TreeNode(data);
		} else {
			if (data <= currentNode.data) {
				currentNode.left = addleafNode(currentNode.left, data);
			} else {
				currentNode.right = addleafNode(currentNode.right, data);
			}
		}
		return currentNode;

	}

	public void showTree() {
		showTree(root);
	}

	public void showTree(TreeNode node) {
		if (node != null) {
			showTree(node.left);
			System.out.print(node.data + "->");
			showTree(node.right);
		}
	}

	public TreeNode search(TreeNode treeNode, int data) {
		if (root.data == data) {
			System.out.println("");

			System.out.println("find");
		} else {
			if (data <= treeNode.data) {
				treeNode.left = search(treeNode.left, data);
			} else {
				treeNode.right = search(treeNode.right, data);
			}
		}
		return treeNode;

	}

} 
