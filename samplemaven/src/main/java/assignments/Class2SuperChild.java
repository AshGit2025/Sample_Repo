package assignments;

public class Class2SuperChild extends Class1Super {

	public void display()
	{
	int x = super.c;
	if (x % 10 == 0)
	{
        System.out.println(x + " is divisible by 10.");
    } else 
    {
        System.out.println(x + " is not divisible by 10.");
    }
	
	}
	public static void main(String[] args) {
		Class2SuperChild obj = new Class2SuperChild();
		obj.display();


	}

}
