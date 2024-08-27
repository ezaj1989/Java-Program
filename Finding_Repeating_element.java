public class Finding_Repeating_element {
    public static void repeating_element(int a[]){
        System.out.println("Displaying the element: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Displaying only repeating element: ");
        int j=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[j]){
                j++;
                continue;
            }
            else{
                j++;
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int a[]={1,2,2,3,4,4,5,5};
        repeating_element(a);
    }
}
