import java.util.*;

public class functions {
    public static String checkAge(int age){
        if(age>=18){
            return "eligible to vote";
        }
        else{
            return "not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(checkAge(age));
    }

}

