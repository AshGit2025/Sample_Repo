package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> L = new ArrayList <String> ();
		List <Integer> I = new ArrayList <Integer>();
		
		I.add(1);
		I.add(4);
		I.add(2);
		I.add(3);
		
		
		//Add method
		L.add("White");
		L.add("Blue");
		L.add("Red");
		L.add("White");
		System.out.println(L);
		
		//Get method
		System.out.println(L.get(2));
		
		//Set method
		L.set(1, "Green");
		System.out.println(L);
		
		
		//indexOf method
		System.out.println(L.indexOf("White"));
		
		//Last indexOf method
		System.out.println(L.lastIndexOf("White"));
		
		//remove method
		L.remove(2);
		System.out.println(L);
		
		I.remove(2);
		System.out.println(I);
		
		// contains method
		System.out.println(L.contains("White"));
		
		//Is Empty method
		System.out.println(L.isEmpty());
		
		//Size method
		System.out.println(L.size());

	}

}
