public class First_half_ascending_next_half_Descending_order_array {
    public static void printing_the_array(int a[]) {
        int temp;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int j = n / 2; j < n - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void PrintArr(int a[]){
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[]={1,88,3,4,5,6,7,8};
        printing_the_array(a);
        PrintArr(a);
    }
}
