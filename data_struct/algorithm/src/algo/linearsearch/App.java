package algo.linearsearch;

public class App {
    public static void main(String[] args){
        reduce(10);
    }

    public static void reduce(int n) {
        if(n >=0)reduce(n-1);
        System.out.println("Completed Call: " + n);
    }

}
