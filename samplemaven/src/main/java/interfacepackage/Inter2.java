package interfacepackage;

public class Inter2 implements Inter1 {

	public static void main(String[] args) {
		
		Inter2 obj = new Inter2();
		obj.display();
		obj.print();

	}

	@Override
	public void display() 
	{
		System.out.println("Hello");
	}

	@Override
	public void print() 
	{
		System.out.println("Java");
	}

}
