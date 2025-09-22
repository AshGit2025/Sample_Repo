package superkeyword;

public class SuperMethodChild extends SuperMethod {
	public void display1()
	{
		super.display();
		System.out.println("this is the child class");
	}

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
	//	obj.display();
		obj.display1();

	}

}
