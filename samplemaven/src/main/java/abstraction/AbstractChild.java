package abstraction;

public class AbstractChild extends AbstractParent {

	public void print()
	{
		System.out.println("Java");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj = new AbstractChild();
		
		obj.display();
		obj.display1();
		obj.print();
	}


	@Override
	public void display() {
		System.out.println("World");
	}

}
