package practicejava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedLi=new LinkedList<String>();
		linkedLi.add("Black");
		linkedLi.add(0,"Blue");
		linkedLi.add("Purple");
		linkedLi.add("Pink");
		linkedLi.add("Green");
		linkedLi.add("Yellow");
		linkedLi.add("Purple");
		//System.out.println(linkedLi);
		//linkedLi.clear();
		linkedLi.addFirst("Magenta");
		linkedLi.addLast("Violet");
		System.out.println(linkedLi);
		String firstColor=linkedLi.getFirst();
		System.out.println(firstColor);
		String lastColor=linkedLi.getLast();
		System.out.println(lastColor);
		String getIn=linkedLi.get(2);
		System.out.println(getIn);
		//linkedLi.removeFirst();
		//linkedLi.removeAll(linkedLi);
		//linkedLi.removeLast();
		System.out.println(linkedLi);
		//Boolean firstOccurance=linkedLi.removeFirstOccurrence("Purple");
//		Boolean lastOccurance=linkedLi.removeLastOccurrence("Purple");
//		System.out.println(lastOccurance);
//		linkedLi.pollFirst();
//		linkedLi.poll();
		linkedLi.pollLast();
		System.out.println(linkedLi);
		int size=linkedLi.size();
//list Iterator
//for loop
//		for(int i=0;i<size;i++) {
//		
//			System.out.println("For Loop:"+linkedLi.get(i));
//		}
//for each 
//		for (String string : linkedLi) {
//			System.out.println("For each loop "+string);
//		}
//while loop
	int number=0;
//while (size>number) {
//	System.out.println(linkedLi.get(number));
//	number++;
//	
//}
//Iterator		
//	Iterator<String> iter=linkedLi.iterator();
//	
//	while (iter.hasNext()) {
//		System.out.println(iter.next());
//		
//	}
//ListIterator		
//ListIterator<String> iterator=linkedLi.listIterator();
//while (iterator.hasNext()) {
//	System.out.println(iterator.next());
//	
//}
//while(iterator.hasPrevious()) {
//	System.out.println(iterator.previous());
//}
//do while
do {
	System.out.println(linkedLi.get(number));
	number++;
} while(size>number);
	}

}
