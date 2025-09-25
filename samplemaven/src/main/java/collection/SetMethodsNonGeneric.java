package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set S= new HashSet();
		
		Set I = new HashSet();
		
		//add method
		S.add("Username");
		S.add(1000);
		S.add(10.26);
		S.add('b');
		S.add("Username");
		
		I.add("Password");
		I.add(3000);
		I.add('K');
		I.add(55.55);
		
		System.out.println(S);
		System.out.println(I);
		
		//Add All method
		S.addAll(I);
		System.out.println(S);
		
		// contains
        System.out.println(S.contains("Password"));
        
        //contains All
       System.out.println(S.containsAll(I));
       
       System.out.println(I);
       System.out.println(I.containsAll(S));
        
        // is empty
       
        System.out.println(S.isEmpty());
          
        // remove
        System.out.println(I.remove(I));
        
        //remove All
       System.out.println(S);
       System.out.println(I);
       
       S.removeAll(I);
       System.out.println(S);
       
        //size
        System.out.println(S.size());
        
        //clear
       
        System.out.println(S);
        System.out.println(I);
		
        I.clear();
        System.out.println(I);

	}

}
