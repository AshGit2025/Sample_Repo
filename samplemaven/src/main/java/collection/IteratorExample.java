package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> S = new HashSet<String> ();
		
		S.add("Kerala");
		S.add("Karnata");
		S.add("Delhi");
		S.add("Punkab");
		System.out.println(S);
		
		Iterator I = S.iterator();
		while (I.hasNext());
		{
			System.out.println(I.hasNext());
		}
		
		// remove () will remove last element
I.remove();
System.out.println(S);
	}

}
