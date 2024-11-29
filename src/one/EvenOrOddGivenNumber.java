package one;

import java.util.Scanner;

public class EvenOrOddGivenNumber {

	public static void main(String[] args) {
		
		num();

	}
	public static void num() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int k=sc.nextInt();
		sc.close();
		if(k%2==0) {
			System.out.println("The enter number is even");
		}
		else {
			System.out.println("The Enter Number is odd");
		}
	}

}
