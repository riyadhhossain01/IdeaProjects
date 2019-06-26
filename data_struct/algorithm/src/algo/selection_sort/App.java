package algo.selection_sort;

public class App {
    public static void main(String[] args) {
        int [] myArray = selectionSort(new int [] {9,8,3,13,87,12,99});

        for(int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

    }
    public static void swap(int x , int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static int [] selectionSort(int [] a) {
        for(int i = 0; i< a.length; i++){
            int min = i;
            for(int j = i+ 1; j < a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
//            swap(a[i], a[min]);
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
        return a;

    }

}
