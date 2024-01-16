package day08;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 문제
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터
 * num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class ArraySlicer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

//        System.out.println("answer = " + solution(numbers, num1, num2));

        for (int number : solution(numbers,num1,num2)) {
            System.out.println(number);
        }
    }

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }

}
