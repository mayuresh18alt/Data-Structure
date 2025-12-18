package array;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int arr[]= {1,5,3,7,2,6,4};
		
		int Max=arr[0];
		int Min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			 if (arr[i] > Max) {
	                Max = arr[i];
	            }

	            if (arr[i] < Min) {
	                Min = arr[i];
	            }
		}     
		
		
		System.out.println("max elememnt is the "+Max);
		System.out.println("min elememnt is the "+Min);
	}
}
