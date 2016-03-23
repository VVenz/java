class Account {
	
	String name;
	String passportNum;
	String tel;
	String address;
	double money;
	String moneyString = Double.toString(money);
}

/*
class Account {
	
	String name;
	String passportNum;
	String tel;
	String address;
	double money;
	
	public String constucting (String a){
		JPanel panel = new JPanel ();
		JFrame frame = new JFrame ();
		GridLayout gl = new GridLayout (5, 2);
		
		panel.setLayout(gl);
		
		JLabel label1 = new JLabel (a.name);
		JLabel label2 = new JLabel (a.passportNum);
		JLabel label3 = new JLabel (a.tel);
		JLabel label4 = new JLabel (a.address);
		JLabel label5 = new JLabel (a.money);
		
		frame.setContentPane(panel);
		frame.setSize (700, 600);
		frame.setVisible (true);
		
	} 

}
import javax.swing.*;
import java.awt.GridLayout;

class Accounts{
	
	Account acc1 = new Account();
	acc1.name = "Ana Maria Leja";
	acc1.passportNum = "AAM568890";
	acc1.tel = "+9876576889";
	acc1.address = "Triq Antigua, 5 MLT";
	acc1.money = 20089.87;
	
	Account acc2 = new Account ();
	acc2.name "John Markus Smith";
	acc2.passportNum = "ABD365241";
	acc2.tel = "+9882563625";
	acc2.address = "Green street, 23-15 LA";
	acc2.money = 100293.32;
	

     public static void main (String [] args){
		constructing(acc1);
		constructing(acc2);
	}
}
*/