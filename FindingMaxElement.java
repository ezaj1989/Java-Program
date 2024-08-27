import java.util.*;
public class FindingMaxElement {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraay: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=arr[0];

        System.out.println("Enter The elements: ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\nThe displayed elements are: ");
        for(i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ,");
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("\nThe max element is : "+max);
    }
}
