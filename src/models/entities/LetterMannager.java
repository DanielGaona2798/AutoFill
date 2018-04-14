package models.entities;

import struct.NarioTree;
import struct.Node;

public class LetterMannager {

	private NarioTree<Letter> letterList;
	
	public LetterMannager() {
		letterList = new NarioTree<>();
	}
	
	public void addNode(Letter newNode) {
		letterList.add(newNode);
	}
}
