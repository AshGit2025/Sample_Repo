package interfacepackage;

public class MultiChild implements MultiParent1, MultiParent2 {

	public void methodChild()
	{
		System.out.println("Displaying child method output");
	}
	public static void main(String[] args) {
		
		MultiChild obj = new MultiChild();
		obj.print();
		obj.display();
		obj.methodChild();
		

	}
	@Override
	public void print() {
		System.out.println("printing parent1");
		
		
	}
	@Override
	public void display() {
		System.out.println("displaying Parent2");
		
		
	}

}
