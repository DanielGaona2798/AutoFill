package models.entities;

import java.util.HashSet;

import struct.NarioTree;

public class LetterMannager {

	private NarioTree<Letter> letterList;
	
	public LetterMannager() {
		letterList = new NarioTree<>();
	}
	
	public void addNode(Letter newNode) {
		letterList.add(newNode);
	}
	
	public void addSon(Letter newNode,Letter ant) {
		letterList.addSon(newNode, ant);
	}
	private HashSet<String> fullHash(String a) {
		HashSet<String> b = new HashSet<>();
		b.add(a);
		return b;
	}
}
