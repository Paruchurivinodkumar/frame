package one;

public class SortAnarray {

	public static void main(String[] args) {
		int temp = 0;
		int[] m= {55,65,75,85,21,23};
		for(int i=0;i<m.length-1;i++) {
			for(int j=0;j<m.length-i-1;j++) {
				if(m[j]>m[j+1]) {
					
					temp=m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
			}
		}
      for(int k=0;k<=m.length-1;k++) {
    	  System.out.println(m[k]);
      }
	}

}
