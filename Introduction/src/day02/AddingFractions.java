package day02;
/**
 * 문제
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록
 * solution 함수를 완성해보세요.
 */
public class AddingFractions {
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;

        int numer2 = 1;
        int denom2 = 3;

        int[] answer = solution(numer1, denom1, numer2, denom2);
        System.out.println("분자 :" + answer[0]);
        System.out.printf("분모 :%d",answer[1]);
    }

    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        int gcd = findGCD(numer, denom);

        return new int[]{numer/gcd, denom/gcd};
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
