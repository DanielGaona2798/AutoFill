package struct;

public class Node <T>{

	private Node<T> next;
	private T information;
	private MyList<Node<T>> listNodes;
	
	public Node(T info) {
		this.information = info;
		listNodes = new MyList<>();
	}
	
	
	public T getInformation() {
		return information;
	}

	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return information.toString();
	}

	public MyList<Node<T>> getListNodes() {
		return listNodes;
	}

	public void setListNodes(MyList<Node<T>> listNodes) {
		this.listNodes = listNodes;
	}
	
}