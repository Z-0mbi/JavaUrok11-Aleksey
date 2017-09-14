package auth;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Auth extends JFrame{
	JLabel loginL;
	JTextField login;
	JLabel passL;
	JPasswordField pass;
	JButton button;
	JLabel result;
	
	String[] login1 = {"admin","user","test"};
	String[] pass1 = {"1234","123","test"};
	
	public Auth() {
		setTitle("Авторизация");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		result = new JLabel();
		login = new JTextField(20);
		pass = new JPasswordField(20);
		button = new JButton("OK");
		loginL = new JLabel("Логин");
		passL = new JLabel("Пароль");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
		c.add(loginL);
		c.add(login);
		c.add(passL);
		c.add(pass);
		c.add(button);
		c.add(result);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == button) {
					for(int i=0; i<login1.length; i++) {
						//проверка на совпадение логина
						if(login.getText().equals(login1[i])) {
							//Делаем строку из пароля
							String pas = "";
							for(char ch : pass.getPassword()) {
								pas += ch;
							}
							//сравниваем пароль
							if(pas.equals(pass1[i])) {
								System.out.println(pass.getPassword());
								result.setText(login.getText() + " Авторизован");
								result.setForeground(Color.GREEN);								
								break;
							}						
						}
						result.setText("Неверный логин или пароль");
						result.setForeground(Color.RED);
						
					}
				}
				
			}

		});	
		
	}

	public static void main(String[] args) {
		new Auth();

	}

}
