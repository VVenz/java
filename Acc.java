//import javax.swing.*;
//import java.awt.GridLayout;

class Acc{

    public static void main (String [] args){
    	
	Account acc1 = new Account();
	acc1.name = "Ana Maria Leja";
	acc1.passportNum = "AAM568890";
	acc1.tel = "+9876576889";
	acc1.address = "Triq Antigua, 5 MLT";
	acc1.money = 20089.87;
	
	
	/*Account acc2 = new Account ();
	acc2.name = "John Markus Smith";
	acc2.passportNum = "ABD365241";
	acc2.tel = "+9882563625";
	acc2.address = "Green street, 23-15 LA";
	acc2.money = 100293.32;
	acc2.moneyString;*/
	           /* JPanel panel = new JPanel ();
    			JFrame frame = new JFrame ();
    			GridLayout gl = new GridLayout (5, 1);
    			
    			panel.setLayout(gl);
    			
    			JLabel [] label = new JLabel [5];
    			
    			label[0] = new JLabel (acc1.name);
    			label[1] = new JLabel (acc1.passportNum);
    			label[2] = new JLabel (acc1.tel);
    			label[3] = new JLabel (acc1.address);
    			label[4] = new JLabel (acc1.moneyString);
    			
    			for (int number = 0; number < 5; number++) {
    			panel.add(label[number]);
    			}
    			/*JLabel label1 = new JLabel (acc2.name);
    			JLabel label2 = new JLabel (acc2.passportNum);
    			JLabel label3 = new JLabel (acc2.tel);
    			JLabel label4 = new JLabel (acc2.address);
    			JLabel label5 = new JLabel (acc2.money);*/
    		
    			/*
    			
    			frame.setContentPane(panel);
    			frame.setSize (700, 600);
    			frame.setVisible (true);*/
	
    System.out.println (acc1.name);
	System.out.println (acc1.passportNum);
	System.out.println (acc1.tel);
	System.out.println (acc1.address);
	System.out.println (acc1.moneyString);
	
	 /*System.out.println (acc2.name);
	System.out.println (acc2.passportNum);
	System.out.println (acc2.tel);
	System.out.println (acc2.address);
	System.out.println (acc2.money); 	*/
	
	}
}
class Account {
	
	String name;
	String passportNum;
	String tel;
	String address;
	double money;
	String moneyString = Double.toString(money);
}
