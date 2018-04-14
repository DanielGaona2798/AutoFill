package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import models.entities.Letter;
import models.entities.LetterMannager;
import views.MainWindow;

public class Controller implements ActionListener{
	
	private LetterMannager letterMannager;
	private MainWindow mainWindow;
	
	public Controller() {
		letterMannager = new LetterMannager();
		mainWindow = new MainWindow(this);
		Letter a = new Letter("a");
		letterMannager.addNode(a);
		letterMannager.addSon(new Letter("c"), a);
//		mainWindow.fullBox(fullHash(a.getLetter()));
		mainWindow.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (Actions.valueOf(arg0.getActionCommand())) {
		case ADD_String:
			fullTree();
			break;
		default:
			break;
		}
	}

	private void fullTree() {
		
	}
	
}
