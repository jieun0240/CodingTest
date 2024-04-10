import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();    // 총 금액
        int N = sc.nextInt();    // 총 구매한 물건의 개수
        int totalCost = 0;       // 총 비용을 저장할 변수를 선언 및 초기화
        
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();    // 물건 가격
            int b = sc.nextInt();    // 물건의 개수
            totalCost += a * b;      // 물건 가격과 개수를 곱한 값을 totalCost에 더함
        }
        
        if(totalCost == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}