package one;

public class GivenYearisAleapyear {

	public static void main(String[] args) {
		year(2010);

	}
  public static void year(int a) {
	  if((a%4==0 && a%100!=0) || a%400==0) {
		  System.out.println("Enter Year Is Leap Year");
	  }
	  else {
		  System.out.println("the given year is not leap year");
	  }
  }
}
