package day01;

/**
 * 문제
 * 정수 num1과 num2가 주어질 때, num1과 num2의 차를 return하도록 soltuion 를 완성해주세요.
 */

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        int answer = solution(num1,num2);
        System.out.println("answer = " + answer);
    }
    static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
