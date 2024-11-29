package one;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String k=sc.next();
		sc.close();
		int i=0;
		Set<Character> v=new HashSet<>();
		Set<Character> m=new HashSet<>();
		for(char c:k.toCharArray()) {
			if(!v.add(c)) {
				m.add(c);
				
			}
			else {
				v.add(c);
			}
		}
      System.out.println(m+""+i);
      System.out.println(v);
	}

}
