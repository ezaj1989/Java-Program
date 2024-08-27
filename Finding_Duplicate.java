public class Finding_Duplicate {
    public static boolean duplicate(int A[]) {
        for (int i = 0; i <= A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j])
                    return true ;
            }
        }
        return false;
    }
            public static void main(String[] args){
                int B[]={10,3,5,6};
                System.out.println(duplicate(B));
            }
}
