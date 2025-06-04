import java.util.*;

public class functions {

    public static int oddSum(int n){
    int sum = 0;
    for(int i = 1; i<=n; i=i+2){
        sum = sum +i;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = oddSum(n);
        System.out.println(sum);
    }
}
