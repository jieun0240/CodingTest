import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 1; i <= T; i++) { // 증감식 수정
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}