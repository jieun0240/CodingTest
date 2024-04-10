#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n); // 총 반복 횟수 입력

    for (int i = 0; i < n; i++) {
        int num1, num2;
        scanf("%d %d", &num1, &num2); // 두 개의 정수 입력
        printf("%d\n", num1 + num2); // 두 정수의 합 출력
    }

    return 0;
}