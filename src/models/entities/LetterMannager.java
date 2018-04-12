package models.entities;

import struct.Node;
import struct.Tree;

public class LetterMannager {

	private Tree<Letter> letterList;
	
	public LetterMannager() {
		letterList = new Tree<>();
	}
	
	public void addNode(Node<Letter> newNode) {
		letterList.addNode(newNode);
	}
}
