package struct;

import java.util.ArrayList;


public class Node<T> {

	private T info;
	private Node<T> father;
	private ArrayList<Node<T>> nodeList;
	
	
	public Node(T info,Node<T> father) {
		this.info = info;
		this.father = father;
		nodeList = new ArrayList<>();
	}


	public T getInfo() {
		return info;
	}


	public Node<T> getFather() {
		return father;
	}


	public ArrayList<Node<T>> getNodeList() {
		return nodeList;
	}
	
	public void addListNode(Node<T> newNode) {
		nodeList.add(newNode);
	}
	

}