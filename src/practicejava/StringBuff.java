package practicejava;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("Hello World");
		//append
//		s.append("t");
//		System.out.println(s);
//		
		int count=s.capacity();
		System.out.println(count);
		
		StringBuffer reversedString=s.reverse();
		System.out.println(reversedString);
		System.out.println(s);
//		StringBuffer replacedString=s.replace(0, 7, "s");
//		System.out.println(replacedString);
		
//		StringBuffer deletedBuff=s.delete(0, 5);
//		System.out.println(deletedBuff);
		
		StringBuffer insert=s.insert(8, "j");
		System.out.println(insert);
		System.out.println(s);
		
		int capacity=s.capacity();
		System.out.println(capacity);
		
		char position=s.charAt(7);
		System.out.println(position);
		
		int check=s.compareTo(reversedString);
		System.out.println(check);
	}

}
