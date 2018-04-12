package Controllers;

import models.entities.Letter;
import models.entities.LetterMannager;
import struct.Node;

public class Controller {
	
	private LetterMannager letterMannager;
	
	public Controller() {
		letterMannager = new LetterMannager();
		letterMannager.addNode(new Node<Letter>(new Letter("a"), null));
	}
}
