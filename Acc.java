
class Acc{

    public static void main (String [] args){
    	
	Account acc1 = new Account();
	acc1.name = "Ana Maria Leja";
	acc1.passportNum = "AAM568890";
	acc1.tel = "+9876576889";
	acc1.address = "Triq Antigua, 5 MLT";
	acc1.money = 20089.87;
	
	Account acc2 = new Account ();
	acc2.name = "John Markus Smith";
	acc2.passportNum = "ABD365241";
	acc2.tel = "+9882563625";
	acc2.address = "Green street, 23-15 LA";
	acc2.money = 100293.32;
	
	String [] moneyString = new String [2];
	
	for (int num=0; num<2; num++){
	moneyString[num] = new String ();
	}
	
	moneyString[0] = Double.toString(acc1.money);
	moneyString[1] = Double.toString(acc2.money);
	
    System.out.println (acc1.name);
	System.out.println (acc1.passportNum);
	System.out.println (acc1.tel);
	System.out.println (acc1.address);
	System.out.println (moneyString[0]);
	System.out.println ("\n");
	
	System.out.println (acc2.name);
	System.out.println (acc2.passportNum);
	System.out.println (acc2.tel);
	System.out.println (acc2.address);
	System.out.println (moneyString[1]); 

	
	}
}
class Account {
	
	String name;
	String passportNum;
	String tel;
	String address;
	double money;
	
}
