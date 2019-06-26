import java.util.*;
public class Prac {
    //Ci+1 = gi + PiCi.
    /*
    * C1 = g0 + P0C0
    * C2 = g1 + P1g0 + P1P0C0
    * C3 = g2 + P2g1 + P2P1g0 + P2P1P0C0
    * C4 = g3 + P3g2 + P3P2g1+ P3P2P1g0 + P3P2P1P0C0
    * */

    public static void main(String[] args){
        ArrayList<String> prev = new ArrayList<String>();
        prev.add("g0");
        prev.add("P0C0");
        for(int i = 0; i <32; i++){
            String str = "";
            int len = prev.size();
            System.out.print("C" + (i+1) + " = ");
            while(len > 0){
                str = prev.get(0);
                prev.remove(0);
                System.out.print(str);
                prev.add("P" + (i+1) + str);
                len--;
                if(len > 0)
                    System.out.print(" + ");
            }
            System.out.println();
            prev.add(0, "g"+ (i + 1));
        }

    }
}
