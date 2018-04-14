package struct;

public class Node <T>{

	private Node<T> next;
	private Node<T> left;
	private T information;
	private MyList<Node<T>> listNodes;
	
	public Node(T information) {
		this.information = information;
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
	
	public void setAnt(Node<T> ant) {
		this.left = ant;
	}
	
	public Node<T> getAnt() {
		return left;
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