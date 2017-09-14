package sotrudniki;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;




public class SotrudnikiHashTableSwing extends JFrame {
	class Men{
		String name;
		int oklad;
		
		public Men(String name,int oklad) {
			this.name = name;
			this.oklad = oklad;
		}		
	}
	
	Hashtable ht = new Hashtable<Object, Object>();
	JLabel[] label;
	Container c;
	
	public SotrudnikiHashTableSwing() {
		ht.put(1, new Men("Иванов",20000));
		ht.put(2, new Men("Петров",10000));
		ht.put(3, new Men("Сидоров",30000));
		setBackground(Color.BLACK);
		setTitle("Наши сотрудники");
		setSize(400, 400);
		setForeground(Color.YELLOW);
		setVisible(true);
		label = new JLabel[ht.size()+1];
		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
	}

	void showAll(){
		
		Enumeration e = ht.elements();
		Men m;
		label[0] = new JLabel("Фамилия: Зарплата");
		c.add(label[0]);
		for (int i = 1; i < ht.size()+1; i++) {
			m = (Men) e.nextElement();
			label[i] = new JLabel(m.name + ": " + m.oklad);
			c.add(label[i]);
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		SotrudnikiHashTableSwing mht = new SotrudnikiHashTableSwing();
		mht.showAll();
		
	}

}
