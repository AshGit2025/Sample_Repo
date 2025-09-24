package exceptionHandling;

public class CustomException {
	

	public static void main(String args[]) throws VotingException
	{
	int age=16;
	if(age>18)
	{
	System.out.println("eligible for voting");
	}
	else
	{
	throw new VotingException("age under 18!!!");
	} 
	}

}
