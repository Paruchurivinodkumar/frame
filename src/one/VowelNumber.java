package one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String c=sc.next().toLowerCase();
		sc.close();
		Map<Character,Integer> ch=new HashMap<>();
		  ch.put('a', 0);
		  ch.put('e', 0);
		  ch.put('i', 0);
		  ch.put('o', 0);
		  ch.put('u', 0);
		  for(char m:c.toCharArray()) {
			  if(ch.containsKey(m)) {
				  ch.put(m, ch.get(m)+1);
			  }
		  }
		  
		System.out.println(ch);  
	}

}
