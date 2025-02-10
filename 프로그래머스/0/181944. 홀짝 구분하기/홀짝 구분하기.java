import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        
        if(n % 2 == 0)
            a = " is even";
        else a = " is odd";
        
        System.out.println(n + a);
    }
}