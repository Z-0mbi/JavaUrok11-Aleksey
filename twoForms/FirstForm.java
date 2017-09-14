package twoForms;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstForm extends JFrame{
	private JTextField first;
	private JTextField second;
	private JTextField middle;
	
	JButton button;
	
	public FirstForm() {
		first = new JTextField(20);
		second = new JTextField(20);
		middle = new JTextField(20);
		button = new JButton("change");
		
		setTitle("FirstForm");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
		c.add(button);
		c.add(first);
		c.add(middle);
		c.add(second);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button) {
					setVisible(false);
					
					SecondForm secondForm = new SecondForm(first.getText()+ " " +middle.getText()+ " " +second.getText());					
					secondForm.setVisible(true);
					
				}
			}
		});	
	}
	
	public FirstForm(String name, String family, String midName) {
		first = new JTextField(name, 20);
		second = new JTextField(family, 20);
		middle = new JTextField(midName, 20);
		button = new JButton("change");
		
		setTitle("FirstForm");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
		c.add(button);
		c.add(first);
		c.add(middle);
		c.add(second);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button) {
					setVisible(false);
					
					SecondForm secondForm = new SecondForm(first.getText()+ " " +middle.getText()+ " " +second.getText());					
					secondForm.setVisible(true);
					
				}
			}
		});	

	}

}
