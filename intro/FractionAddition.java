// 분수의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120808


package intro;

public class FractionAddition {
 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 공통 분모 계산
        int commonDenom = denom1 * denom2;

        // 2. 분자 계산
        int sumNumer = numer1 * denom2 + numer2 * denom1;

        // 3. 최대공약수(GCD) 계산 - 반복문 방식
        int gcdValue = 1;
        int min;
        if (sumNumer < commonDenom) {
            min = sumNumer;
        } else {
            min = commonDenom;
        }

        for (int i = 1; i <= min; i++) {
            if (sumNumer % i == 0 && commonDenom % i == 0) {
                gcdValue = i; // 최대공약수 갱신
            }
        }

        // 4. 기약분수 만들기
        int finalNumer = sumNumer / gcdValue;
        int finalDenom = commonDenom / gcdValue;

        // 5. 결과 배열 반환
        return new int[]{finalNumer, finalDenom};
    }
}