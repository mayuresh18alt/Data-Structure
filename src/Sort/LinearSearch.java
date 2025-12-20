package Sort;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={3,4,2,1};
        int n=arr.length;
        int key=5;

        int result=Searchliner(arr,n,key);

        if(result != -1){
            System.out.println("Element found at index"+" "+result);
        }else{
            System.out.println("element not found");
        }
    }
    static int Searchliner(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
