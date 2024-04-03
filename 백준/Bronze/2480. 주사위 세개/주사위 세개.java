import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a != b && a != c && b != c){
            int max = a;
            if(a > b){
                if(c > a){
                    max = c;
                }
                else{
                    max = a;
                }
            }
            
            else{
                if(c > b){
                    max = c;
                }
                else{
                    max = b;
                }
            }
            System.out.println(max * 100);
        }    //3개의 주사위 눈이 모두 다른 경우의 if
        
        else {
            if(a == b && a == c){
                System.out.println(10000 + a * 1000);
            }    //3개의 주사위 눈이 동일
            else{
                if(a == b || a == c){
                    System.out.println(1000 + a * 100);
                }
                else{
                    System.out.println(1000 + b * 100);
                }
            }    //3개의 주사위 눈이 2개만 동일
        }    //주사위 눈이 두개만 같거나, 모두 다 같은 경우
        
    }    //main
}