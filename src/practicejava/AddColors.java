package practicejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class AddColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> colors=new ArrayList<String>();
		colors.add("Blue");
		colors.add("Black");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add(0,"Lilac");
//		System.out.println(colors);
//		System.out.println(colors.subList(1, 3));
		
		List<String> newColors=new ArrayList<String>();
		newColors.add("Pink");
		newColors.add("Black");
		newColors.add("Blue");
		newColors.add("Red");
		System.out.println(newColors);

//		boolean empty=newColors.isEmpty();
//		System.out.println(empty);
//		@SuppressWarnings("unchecked")
//		List<String> copyColor= (List<String>) ((ArrayList<String>) colors).clone();
//		
//		System.out.println(copyColor);
//		copyColor.addAll(colors);
//		copyColor.addAll(newColors);
//		System.out.println(copyColor);
		
		
		
		
		
//		Collections.shuffle(colors);
//		System.out.println(colors);
//		Collections.reverse(colors);
//		System.out.println(colors);
//		List<String> copyColors=new ArrayList<String>();
//		copyColors.addAll(colors);
//		System.out.println("Copy colors "+copyColors);
		
//		Collections.sort(colors);
//		System.out.println(colors);
		
//		if (colors.contains("Blue")) {
//			System.out.println("Found Blue");
//		}
//		else
//		{System.out.println("Better luck next time");}
//		
		//colors.set(3, "Purple");
//		colors.remove(2);
//		System.out.println(colors);
		//System.out.println(colors);
		//System.out.println(colors.get(2));
		
//		ListIterator<String> iterator=colors.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

	}

}
