package algo.mergeSort;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        int [] Array = { 9, 7, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        MergeSort sorter = new MergeSort();

        sorter.sort(Array);



        for(int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
