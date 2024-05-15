#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int denum1, int num1, int denum2, int num2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int denum = denum1 * num2 + denum2 * num1;
    int num = num1 * num2;
    int least = 1;
    for (int i = 2; i<= denum || i <= num; i++) {
        if (denum % i == 0 && num % i == 0) {
            least = i;
        }
    }
    int* answer = (int*)malloc(2);
    answer[0] = denum / least;
    answer[1] = num / least;
    return answer;
}
