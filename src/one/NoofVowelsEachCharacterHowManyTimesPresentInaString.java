package one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoofVowelsEachCharacterHowManyTimesPresentInaString {

	public static void main(String[] args) {
		vowel();
        duplicate("asdfghjkloiuytrewqasdfghjkloiuytrewqzxcvbnm");
	}
    public static void vowel() {
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter Your String");
    		String v=sc.next().toLowerCase();
    		sc.close();
    		Map<Character,Integer> ch=new HashMap<>();
    		       ch.put('a',0);
    		       ch.put('e',0);
    		       ch.put('i',0);
    		       ch.put('o',0);
    		       ch.put('u',0);
    		for(char m:v.toCharArray()){
    		      if(ch.containsKey(m)){
    		          ch.put(m,ch.get(m)+1);
    		   }
    		}
    		System.out.println(ch);
    		}
          
       }
       public static void duplicate(String sc) {
           
           String c=sc.toLowerCase();
           
           Map<Character,Integer> mp=new HashMap<>();
           for(char ch:c.toCharArray()) {
        	   mp.put(ch, 0);
           }
           for(char p:c.toCharArray()) {
        	   if(mp.containsKey(p)) {
        		   mp.put(p, mp.get(p)+1);
        	   }
           }
           System.out.println(mp);
    }
}
