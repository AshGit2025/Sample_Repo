package assignments;

public class Class1Encap // Bank
{

	private int pin;
	
	 public void setter(int pin)
	 {
	 this.pin=pin;
	 }
	 
	 public boolean checkpin(int enterdpin)
	 {
	  int validpin[]= {1001,1234,1212};
	  for(int i=0;i<validpin.length;i++)
	   {
	     if(enterdpin==validpin[i])
	    {
	     return true;
	    }
	   }
	 return false;
	 }
}

