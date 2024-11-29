package one;

import java.util.Scanner;

public class ReverseAstring2ndMethod {

	public static void main(String[] args) {
		ReverseAstring2ndMethod v=new one.ReverseAstring2ndMethod();
		v.vin();
		        
	}
	public  void vin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
        String c=sc.next();
        sc.close();
        char[] k=c.toCharArray();
        for(int i=k.length-1;i>=0;i--) {
        	System.out.println(k[i]);
        }
        
	}

}
