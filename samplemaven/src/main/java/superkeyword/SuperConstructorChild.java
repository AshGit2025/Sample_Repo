package superkeyword;

public class SuperConstructorChild extends SuperConstructor{

	public SuperConstructorChild()
	{
		super(6,4);
		System.out.println("this is the chils class constructor");
	}
	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}
