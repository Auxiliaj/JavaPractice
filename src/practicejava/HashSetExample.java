package practicejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> places=new HashSet<String>();
		places.add("Bangalore");
		places.add("Chennai");
		places.add("Hydrabad");
		places.add("Mumbai");
		places.add("Delhi");
		System.out.println(places);
		//places.clear();
		//places.remove("Delhi");
		int size=places.size();
		System.out.println(size);
//		System.out.println(places);
//		places.toArray();
		System.out.println(places.isEmpty());
		
		Boolean result=places.contains("Delhi");
		System.out.println(result);
	
		Iterator<String> iterator=places.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
	}

}
