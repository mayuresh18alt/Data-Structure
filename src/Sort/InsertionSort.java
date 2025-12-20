package Sort;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[]={3,4,5,2,1};
        int n=arr.length;

        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("After applying Insertion Sort");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
