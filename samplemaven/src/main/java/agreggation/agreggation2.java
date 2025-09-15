package agreggation;

public class agreggation2 {
	String city;
	String state;
	agreggation1 ref;
	
	public agreggation2(String city, String state, agreggation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}

	public void display()
	{
		System.out.println("Student name: " + ref.name + " " + "Roll No: " + ref.rollno);
		System.out.println("City:"+ city +" " + "State:"+ state);
	}
	public static void main(String[] args) {
		agreggation1 newobj = new agreggation1("Aswathy", 42);
		agreggation2 obj = new agreggation2("Trv", "Kerala",newobj);
        obj.display();
	}

}
