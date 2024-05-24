package practicejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
	//	ArrayList<String> carModel=new ArrayList<String>();

		cars.add("Benz");
		cars.add(0, "Rolls Royce");
		cars.add("Audi");
		cars.add("Porsche");
	//	System.out.println(cars);
		cars.add("A52");
		cars.add("L56");
		cars.add("BMW");
		
		
		ListIterator<String> iterator=cars.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Backward traverse:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}
		
//		Iterator<String> iterator=cars.iterator();
//		do {
//			System.out.println(iterator.next()+"");
//		}while(iterator.hasNext());
//		System.out.println(carModel);
//		//cars.clear();
//		//cars.remove(0);	
//		//cars.remove("Benz");
//		//cars.removeAll(cars);
//		cars.addAll(carModel);
//		System.out.println(cars);
//		Boolean status=cars.isEmpty(); 
//		//Boolean status=cars.contains("A52");
//		System.out.println(status);
//		cars.add("Benz");
//		int index=cars.lastIndexOf("Benz");
//		System.out.println(index);
//		cars.set(1, "BMW");
//		System.out.println(cars);
//	 
	}

}
