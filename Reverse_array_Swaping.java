public class Reverse_array_Swaping {
    public static void reverse(int A[]){
        int start=0;//starting index of the array
        int last=A.length-1;//last index of the array
        while(start<last){
            int temp=A[last];
            A[last]=A[start];
            A[start]=temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args){
        int A[]={1,2,3,4,5,6};
        reverse(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
