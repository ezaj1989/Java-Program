import java.util.Arrays;
import java.util.Collections;
public class Arrays_inbuilt_sort_and_reverse_function {
    public static void main(String[] args){
        Integer a[]={1,6,2,8,3};
        //here we are not using int beacuse int is primitve data type and collection don't support
        //primitive data type it supports object type and integer is object type
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
