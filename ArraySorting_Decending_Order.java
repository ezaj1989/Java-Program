public class ArraySorting_Decending_Order {
    public static void main(String[] args) {
        int temp=0;
        int[] A={89,90,101,234,55};
        System.out.println("\nDisplaying element before sorting ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]<A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("\nDisplaying element after sorting ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
    }
}
