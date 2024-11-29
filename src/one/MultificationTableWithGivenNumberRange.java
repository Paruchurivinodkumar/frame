package one;

public class MultificationTableWithGivenNumberRange {

	public static void main(String[] args) {
		num(9);

	}
  public static void num(int a) {
	  for(int i=1;i<=a;i++) {
		  for(int j=1;j<=10;j++) {
			  int m=i*j;
			  System.out.println(i + "x" + j + "="+m);
		  }
		  System.out.println("          ");
	  }
  }
}
