package algo.insertionsort;

public class App {
    public static void main(String[] args){
        int myArray[] = insertionSort(new int [] {9,8,99,110,8,87,637,8,3,13,87,12,99});

        for( int i = 0; i< myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
    public static int [] insertionSort(int [] A) {
        for(int i = 1; i < A.length; i++) {
            int element = A[i];
            int j = i - 1;
            while(j >=0 && A[j] > element) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = element;
        }
        return A;
    }
}
