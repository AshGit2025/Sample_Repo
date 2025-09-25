package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List L = new ArrayList();
		
		L.add("Username");
		L.add(1000);
		L.add(10.26);
		L.add('b');
		L.add("Username");
		System.out.println(L);
		
		//get method
		System.out.println(L.get(1));
		
		//set method
		L.set(3, 'X');
		System.out.println(L);
		
		//indexOf
		System.out.println(L.indexOf("Username"));
		
		//LastIndexOf
		System.out.println(L.lastIndexOf("Username"));

		//remove
		L.remove(3);
		System.out.println(L);
		
		//contains
		System.out.println(L.contains(10.26));
		
		//isEmpty
		System.out.println(L.isEmpty());
		
		//Size
		System.out.println(L.size());
	}

}
