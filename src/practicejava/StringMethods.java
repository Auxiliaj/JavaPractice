package practicejava;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Jesus is my saviour";
		char c=s.charAt(1);
		System.out.println(c);
		
		int length=s.length();
		System.out.println("Length:"+length);
		
		String sub=s.substring(1);
		System.out.println("Substring:"+sub);
		
		String betweenString=s.substring(0, 5);
		System.out.println("Between string:"+betweenString);
		
		String concatText=s.concat("Loving Father");
		System.out.println(concatText);
		
		String concatText1=s.concat(betweenString);
		System.out.println(concatText1);
		
		Boolean contain=s.contains("x");
		System.out.println(contain);
		
		Boolean empty=s.isEmpty();
		System.out.println(empty);
		
		Boolean e=s.equals("Jesus is my");
		System.out.println(e);
		
		Boolean ignoreCase=s.equalsIgnoreCase("jesus is my SAVIOUR");
		System.out.println(ignoreCase);
		
		String replaceString=s.replace("s", "y");
		System.out.println(replaceString);
		System.out.println(s);
		
		int index=s.indexOf("e");
		System.out.println(index);
		int indexoff=s.indexOf("s",5);
		System.out.println(indexoff);
		
		
		
		

	}

}
