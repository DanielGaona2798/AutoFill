package struct;
 
public class Tree<T> {
 	
	private Node<T> root;
	
	public Tree() {
	}
	
	public void addNode(Node<T> newNode){
		if (root != null) {
			if (root.getInfo() == newNode.getFather().getInfo()) {
				root.addListNode(newNode);
			}else{
				addNode(newNode,root);
			}
		}else{
			root = newNode;
		}
	}

	private void addNode(Node<T> newNode, Node<T> current) {
		for (Node<T> node : current.getNodeList()) {
			if (node.getInfo() == newNode.getFather().getInfo()) {
				node.addListNode(newNode);
			}else{
			}
		}
	}
	public void print(Node<T> actual) {
		System.out.println(actual.toString());
		if (!actual.getNodeList().isEmpty()) {
			for (Node<T> node : actual.getNodeList()) {
				print(node);
			}
		}
	}

	public Node<T> getRoot() {
		return root;
	}
	
} 