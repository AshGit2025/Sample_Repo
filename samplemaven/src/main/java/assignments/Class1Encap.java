package assignments;

public class Class1Encap {

	 private int pin;

	    // method to set pin (from 1st class)
	    public void setPin(int pin) 
	    {
	        this.pin = pin;
	    }

	    // method to validate pin
	    public boolean validatePin() 
	    {
	        // valid pins
	        int[] validPins = {1001, 1234, 1212};
	        for (int p : validPins) 
	        {
	            if (p == pin) 
	            {
	                return true;
	            }
	        }
	        return false;
	    }

	    // method to withdraw
	    public void withdraw(double amount) 
	    {
	        System.out.println("Withdrawal of " + amount + " successful!");
	    }
}
