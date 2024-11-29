package one;

public class MultificationTableGivenNumber {

	public static void main(String[] args) {
		number(5);

	}
   public static void number(int a) {
	   for(int i=1;i<=10;i++) {
		   int k=a*i;
		   System.out.println(a + "x" + i + "="+ k);
	   }
   }
}
