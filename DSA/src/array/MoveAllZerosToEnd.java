package array;

public class MoveAllZerosToEnd {
	public static void main(String args[]){
		int arr[]= {1,0,2,0,3,0,4,0,5,6};
		
		int size=arr.length;
		if(size==0 || size==1) {
			return ;
		}
		int nz=0;
		int z=0;
		
		while(nz<size) {
			if(arr[nz]!=0) {
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				z++;
			}
			nz++;
		}
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

