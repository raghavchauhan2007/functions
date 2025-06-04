import java.util.*;

public class functions {
    public static double circumference(int r){
        return Math.PI*2*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(circumference(r));
    }

}

