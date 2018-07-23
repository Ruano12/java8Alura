package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("Caelum");
		
		List<String> palavras2 = new ArrayList<String>(palavras);
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((Comparator.comparing(s -> s.length())));
		palavras2.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
		System.out.println(palavras2);
		
		//palavras.forEach( s-> System.out.println(s));
		palavras.forEach(System.out::println);
	}
	
	
}

