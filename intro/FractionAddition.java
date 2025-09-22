// 분수의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120808

package intro;

public class FractionAddition {

    // 최대공약수 계산 (유클리드 호제법) - 기약분수 만들기
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모 계산
        int commonDenom = denom1 * denom2;

        // 분자 계산
        int sumNumer = numer1 * denom2 + numer2 * denom1;

        // 최대공약수로 기약분수 만들기
        int gcdValue = gcd(sumNumer, commonDenom);

        return new int[]{sumNumer / gcdValue, commonDenom / gcdValue};
    }
}