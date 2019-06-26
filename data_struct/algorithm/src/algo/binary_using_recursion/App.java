package algo.binary_using_recursion;

public class App {
    public static void main(String[] args){
        System.out.print(RECURSIVE_BINARY_SEARCH(new int []{1,2,3,4,7,9,12,18},0 ,7, 18));
    }
    public static int RECURSIVE_BINARY_SEARCH(int [] A, int p, int r, int x){
        System.out.println("[ " + p + "..." + r + " ]"  );
        if(p > r) {
            return -1;
        }else {
            int q = (p + r)/2;
            if(A[q] == x){
                return q;
            }else if(A[q] > x){
                return RECURSIVE_BINARY_SEARCH(A,p,q-1,x);
            }else {
                return RECURSIVE_BINARY_SEARCH(A,q+1,r,x);
            }
        }
    }
}
