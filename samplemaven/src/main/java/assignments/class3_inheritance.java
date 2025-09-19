package assignments;

public class class3_inheritance extends class2_inheritance 
{
double total;
	public void totalSalary ()
	{
		total= base + hra - pf - ded + bonus;
	//	System.out.println(total);
	}
	
	public void display() {
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Basic Pay     : " + base);
        System.out.println("Deduction     : " + ded);
        System.out.println("HRA (5%)      : " + hra);
        System.out.println("PF (20%)      : " + pf);
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + total);
	}
	public static void main(String[] args) {
		class3_inheritance obj = new class3_inheritance();
		
		obj.calculate();
		obj.totalSalary();
		obj.display();
	}

}
