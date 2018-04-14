package views;

import java.awt.GridLayout;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Controllers.Actions;
import Controllers.Controller;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton btnAccept;
	private JComboBox<String> boxString;
	private JTextField txtText;
	
	public MainWindow(Controller controller) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setLayout(new GridLayout(3, 1));
		
		txtText = new JTextField();
		txtText.setBorder(new TitledBorder("Word"));
		add(txtText);
		boxString = new JComboBox<>();
		add(boxString);
		
		btnAccept = new JButton("Accept");
		btnAccept.addActionListener(controller);
		btnAccept.setActionCommand(Actions.ADD_String.toString());
		add(btnAccept);
	}
	
	public String getString(){
		return txtText.getText();
	}
	
	public void fullBox(HashSet<String> stringBox) {
		for (String string : stringBox) {
			boxString.addItem(string);
		}
	}
}
