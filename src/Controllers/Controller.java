package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.entities.LetterMannager;
import views.MainWindow;

public class Controller implements ActionListener{
	
	private LetterMannager letterMannager;
	private MainWindow mainWindow;
	
	public Controller() {
		letterMannager = new LetterMannager();
		mainWindow = new MainWindow(this);
//		Node<Letter> father = new Node<Letter>(new Letter("a"), null);
//		letterMannager.addNode(father);
//		letterMannager.addNode(new Node<Letter>(new Letter("b"), father));
//		letterMannager.print();
		mainWindow.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (Actions.valueOf(arg0.getActionCommand())) {
		case ADD_String:
			break;
		default:
			break;
		}
	}
}
