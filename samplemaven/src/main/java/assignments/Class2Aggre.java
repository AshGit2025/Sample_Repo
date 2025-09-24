package assignments;

public class Class2Aggre {

	String Address;
	Class1Aggre ref;
	
	public Class2Aggre(String Address,Class1Aggre ref )
	{
		this.Address=Address;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Student name: " + ref.name + " " + "Roll No: " + ref.rollno);
		System.out.println("Address:"+ Address);
	}
	
	
	public static void main(String[] args) {
		Class1Aggre obj1 = new Class1Aggre("Daisy", 42);
		Class2Aggre obj = new Class2Aggre("Trivandrum, Kerala", obj1);
		obj.display();

	}

}
