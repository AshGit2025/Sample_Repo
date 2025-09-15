package polymorphism;

public class poly_Child extends poly_Parent{
	
	public void display(int a, int b)
	{
		super.display(10, 5);
		int c= a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		poly_Child out = new poly_Child();
		out.display(10, 5);

	}

}
