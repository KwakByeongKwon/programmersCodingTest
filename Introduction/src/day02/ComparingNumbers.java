package day02;
/**
 * 문제
 * 정수 num1과 num2가 매개변수로 주어집니다.
 * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 */
public class ComparingNumbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        int answer = solution(num1, num2);
        System.out.println("answer = " + answer);
    }

    static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}