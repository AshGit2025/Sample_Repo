package inheritance;

public class HierarchialChildA extends HierarchialParent {
	
	public void display1()
	{
		System.out.println("this is the child A");
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HierarchialChildA obj=new HierarchialChildA();
		obj.display();
		obj.display1();
}
}