package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton enter= new JButton();
	JTextField adds = new JTextField("Add Name");
	ArrayList<String> list=new ArrayList<String>();
	int numOfGuests;
	public void run(){
		button1.setText("Add Name");
		button2.setText("View Names");
		enter.setText("Enter");
		button1.setVisible(true);
		button2.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}
	public void addNames() {
		panel.remove(button2);
		panel.add(adds);
		panel.remove(button1);
		panel.add(enter);
		adds.setVisible(true);
		enter.setVisible(true);
		enter.addActionListener(this);
		frame.pack();
		
	}
	public void gList() {
		for (int i =0; i<=numOfGuests-1;i++) {
			JOptionPane.showMessageDialog(null,"Guest "+i+": "+list.get(i));
		}
	}
	public void entered() {
		panel.remove(adds);
		panel.remove(enter);
		panel.add(button1);
		panel.add(button2);
		list.add(adds.getText());
		numOfGuests++;
		frame.pack();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==button1) {
			addNames();
		}
		if(buttonPressed==button2) {
			gList();
		}
		if(buttonPressed==enter) {
			entered();
		}
	}
}
