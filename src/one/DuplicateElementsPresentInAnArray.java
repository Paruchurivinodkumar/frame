package one;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsPresentInAnArray {

	public static void main(String[] args) {
	    duplicate();

	}
  public static void duplicate() {
	  
	 int v[]= {1,2,3,3,3,3,4,5,6,8};
	 Set<Integer> cv=new HashSet<>();
	 for(int c:v) {
		 cv.add(c);
	 }
	 System.out.println(cv);
	 }
  }

