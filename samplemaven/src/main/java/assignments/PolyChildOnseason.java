package assignments;

public class PolyChildOnseason extends PolyParentOffseason {
	
	public void discount(double total)
	{
		super.discount(500);
		double x= total* 0.40; //40% discount calc
		System.out.println("After 40% discount Price is: "+ x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChildOnseason obj = new PolyChildOnseason();
		obj.discount(1000);

	}

}
