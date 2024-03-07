import java.util.*;
public class CheckingVowelOrConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char x=sc.next().charAt(0);
        if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u'|| x=='A'|| x=='E'|| x=='I'|| x=='O'|| x=='U' ){
            System.out.println(x+" is vowel");
        }
        else {
            System.out.println(x +" is constant");
        }
    }
}
