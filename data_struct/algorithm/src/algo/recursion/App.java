package algo.recursion;

public class App {
    public static void main(String[] args){
        System.out.println(linear_search(new int[] {1,2,5,7,12,15,60}, 0, 15));

    }

    public static int linear_search(int [] a, int i, int x) {
        int n = a.length;
        if (i > n) return -1;
        else if (a[i] == x) return i;
        else {
            System.out.println("index at: " + i);
            return linear_search(a, i + 1, x);
        }
    }
}
