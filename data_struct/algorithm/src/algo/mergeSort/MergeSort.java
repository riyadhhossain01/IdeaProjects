package algo.mergeSort;

public class MergeSort {

    public static void sort(int a[]) {
        sort(a,0,a.length-1);
    }

    public static void sort(int [] a, int start, int end) {
            if(end <= start) {
                return;
        }
            int mid = (start + end)/2;
            sort(a, start,mid); // sort left half
            sort(a,mid + 1, end); // sort right half
            merge(a, start,mid, end); //merge sorted results into the A
    }

    public static void merge(int []a, int start, int mid, int end){
        int tempArray[] = new int [end - start + 1];
        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(a[leftSlot] < a[rightSlot]){
                tempArray[k] = a[leftSlot];
                leftSlot++;
            }else {
                tempArray[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }
        if(leftSlot <= mid){ //consider the right side done being sorted
            while(leftSlot <= mid){
                tempArray[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        }else if (rightSlot <=end) {
            while(rightSlot <= end) {
                tempArray[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for(int i = 0; i < tempArray.length; i++){
            a[start+ i] = tempArray[i];
        }

    }
}
