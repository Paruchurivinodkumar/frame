package one;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		prime();

	}
	public static void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your maximum number");
		int maxlimit=sc.nextInt();
		sc.close();
		
		for(int i=2;i<=maxlimit;i++) {
			boolean isprime = true;
			
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
				
			}
			if(isprime) {
				System.out.println("prime number"+i);
			}
		}
	}

}
