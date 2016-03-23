import javax.swing.*;
import java.awt.GridLayout;

class Accounts{

    public static void main (String [] args){
    	
    int numbers = 3;
    
    	
    Account acc[] = new Account[numbers];
    
    for (int ind0=0; ind0<numbers; ind0++){
    	acc[ind0] = new Account();
    }
	
	acc[0].name = "Ana Maria Leja";
	acc[0].passportNum = "AAM568890";
	acc[0].tel = "+9866576781";
	acc[0].address = "Triq Antigua, 5 MLT";
	acc[0].money = 20089.87;

	acc[1].name = "John Markus Smith";
	acc[1].passportNum = "ABD365241";
	acc[1].tel = "+9882563625";
	acc[1].address = "Green street, 23-15 LA";
	acc[1].money = 100293.32;
	
	acc[2].name = "Jennifer Claudia Stone";
	acc[2].passportNum = "ADR378049";
	acc[2].tel = "+9872553689";
	acc[2].address = "Park street, 2-10 NY";
	acc[2].money = 993.33;
	
	String []moneyString = new String [numbers]; 
	
	JFrame frame = new JFrame ("Customers base");
	JPanel mainPanel = new JPanel ();
	GridLayout maing = new GridLayout (1, numbers);
	mainPanel.setLayout(maing);
	
	            JPanel [] panel = new JPanel [numbers];
    			
    			GridLayout [] g = new GridLayout [numbers];
    			JLabel [] [] label = new JLabel [5] [numbers];
    			
    			for (int ind=0; ind<numbers; ind++) {
    				g[ind] = new GridLayout (5, 1);
    				panel[ind] = new JPanel ();
    				
    				panel[ind].setLayout(g[ind]);
    				
    				label[0] [ind] = new JLabel (acc[ind].name);
        			label[1] [ind] = new JLabel (acc[ind].passportNum);
        			label[2] [ind] = new JLabel (acc[ind].tel);
        			label[3] [ind] = new JLabel (acc[ind].address);
        			
        			moneyString[ind] = Double.toString(acc[ind].money);
        			label[4] [ind] = new JLabel (moneyString[ind]);
        			
        			for (int ind1 = 0; ind1 < 5; ind1++) {
            			panel[ind].add(label[ind1][ind]);
            			}
        			mainPanel.add ( panel[ind]);
    			}
    		
    			
    			frame.setContentPane(mainPanel);
    		
    			frame.setSize (1100, 900);
    			frame.pack();
    			frame.setVisible (true);
	}
}