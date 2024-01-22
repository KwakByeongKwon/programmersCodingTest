package day09;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제
 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록
 * solution 함수를 완성해주세요.
 */
public class ArrayRotator {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    static int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (direction.equals("right")){
            arr.add(numbers[numbers.length - 1]);
            for (int i = 0; i < numbers.length - 1; i++) {
                arr.add(numbers[i]);
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                arr.add(numbers[i]);
            }
            arr.add(numbers[0]);
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}