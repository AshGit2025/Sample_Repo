package encapsulation;

public class Encap1Parent {

	private String name;
	private int age;
	
	public void setter(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void getter()
	{
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
