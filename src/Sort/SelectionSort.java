package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,4,5,2,1};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;

                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("after selection sort");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
