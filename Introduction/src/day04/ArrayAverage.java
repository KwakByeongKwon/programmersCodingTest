package day04;

import java.util.Arrays;

/**
 * 문제
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println("answer = " + solution(numbers));
    }

    static double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double answer = (double)sum/numbers.length;

        return answer;
    }
}