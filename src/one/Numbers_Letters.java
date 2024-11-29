package one;

import java.util.Scanner;

public class Numbers_Letters {

	public static void main(String[] args) {
		nl();

	}
	public static void nl() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pancard Number");
		String s=sc.next();
		char c;
		sc.close();
		for(int i=0;i<s.length();i++) {
		    c=s.charAt(i);
		    if(Character.isAlphabetic(c)) {
		    	System.out.println(c);
		    }
		    if(Character.isDigit(c)) {
		    	System.out.println(c);
		    }
		    
		}
	}

}
