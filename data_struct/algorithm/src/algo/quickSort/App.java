package algo.quickSort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int [] inputArray = {12,81,74,43,1098,0,8,92,17,754,913,0,6,4};
        quickSort(inputArray, 0, inputArray.length - 1);

        System.out.println(Arrays.toString(inputArray));
    }



    public static void quickSort(int [] inputArray, int start, int end){

        if(start < end) {
            int mid = Partition(inputArray, start, end);
            quickSort(inputArray, start, mid - 1);
            quickSort(inputArray, mid + 1, end);
        }

    }
    public static void swap(int [] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static int Partition(int [] inputArray, int start, int end){
        int pivot = inputArray[end];
        int i = start - 1;
        for(int j = start; j < end; j++){
            if(inputArray[j]  <= pivot) {
                i++;
//                int ival = inputArray[i];
//                int jval = inputArray[j];
//                inputArray[i] = jval;
//                inputArray[j] = ival;
               swap(inputArray, i, j);
            }
        }

        // putting the pivot value in the correct position
//        int ival = inputArray[i + 1];
//        inputArray[end] = ival;
//        inputArray[i + 1] = pivot;
        swap(inputArray, i+1, end);
        return i + 1;
    }








}
