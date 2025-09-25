package assignments;

public class Class3Encap // Atm class

{
	
		public static void main(String[] args)
	{
	int enterdpin=1212;
	Class1Encap b=new Class1Encap(); //Bank class
	Class2Encap u=new Class2Encap(); //User class
	  u.setpin(1212);
	  b.setter(u.getpin());
	
	  if (b.checkpin(enterdpin))
	    {
	     System.out.println("Valid pin you can withdraw amount");
	    }
	 else
	    {
	     System.out.println("Not a valid pin please try	again");
	    }
	}
	

}
