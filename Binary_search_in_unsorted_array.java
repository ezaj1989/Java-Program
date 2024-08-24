public class Binary_search_in_unsorted_array {
    public static void sorting(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
        }
        //System.out.println();
    }

    public static int binary_search(int a[],int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[]={1,2,7,3,89,10,5};
        //1,2,3,5,7,10,89
        int key=5;
        sorting(a);
        printArr(a);

        System.out.println("The element is found at index: "+binary_search(a,key));
    }
}
