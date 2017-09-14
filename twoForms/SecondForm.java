package twoForms;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SecondForm extends JFrame{
	private JTextField fio;	
	private JButton button;
	
	public SecondForm() {
		fio = new JTextField(20);
		button = new JButton("change");
		
		setTitle("SecondForm");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
		c.add(button);
		c.add(fio);
	}
	
	public SecondForm(String stringFio) {
		fio = new JTextField(stringFio, 20);
		button = new JButton("change");
		
		setTitle("SecondForm");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
		c.add(button);
		c.add(fio);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button) {
					setVisible(false);
					String[] text = fio.getText().trim().split(" ");
					
					FirstForm firstForm = new FirstForm(text[0], text[1], text[2]);					
					firstForm.setVisible(true);
					
				}
			}
		});	
		
		
	}

}
