package one;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String k=sc.next();
        sc.close();
        k=k.toLowerCase();
        int vowelscount=0;
        for(int i=0;i<k.length();i++) {
        	char ch=k.charAt(i);
        	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        		vowelscount++;
        	}
        }
        System.out.println(vowelscount);
	}

}
