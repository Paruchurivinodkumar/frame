package one;

public class MaximumAndMinimumNumberOfAnArray {

	public static void main(String[] args) {
		int[] vin= {43,98,58,68,5,7,48};
		int max=vin[0];
		int min=vin[0];
		for(int i=0;i<vin.length;i++) {
			if(vin[i]>=max) {
				max=vin[i];
				System.out.println(max);
			}
			if(vin[i]<min) {
				min=vin[i];
				//System.out.println(min);
			}
		}
		//System.out.println(max);
		//System.out.println(min);
	}

}
