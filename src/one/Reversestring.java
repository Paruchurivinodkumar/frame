package one;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String vin=sc.next();
		sc.close();
		String m=null;
		int jk=vin.length();
		for(int i=jk-1;i>=0;i--) {
			m=vin.substring(i, i+1);
			System.out.println(m);
		}

	}

}
