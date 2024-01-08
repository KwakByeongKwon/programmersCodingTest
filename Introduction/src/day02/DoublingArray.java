package day02;

import java.util.Arrays;

/**
 * 문제
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class DoublingArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        numbers = solution(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0){
                System.out.printf("[%d, ",numbers[i]);
            } else if (i == numbers.length -1) {
                System.out.printf("%d]",numbers[i]);
            } else {
                System.out.printf("%d, ",numbers[i]);
            }
        }
    }

    static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
    }
}