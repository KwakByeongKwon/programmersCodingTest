package daya05;

import java.util.Arrays;

/**
 * 문제
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class ArrayReverser {
    public static void main(String[] args) {
        int[] num_list = {1, 0, 1, 1, 1, 3, 5};
        int[] answer = solution(num_list);

        for (int i = 0; i < answer.length; i++) {
            if (i == 0){
                System.out.printf("[%d",answer[i]);
            } else if (i < answer.length - 1) {
                System.out.printf(", %d",answer[i]);
            } else {
                System.out.printf(", %d]",answer[i]);
            }
        }
    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length; i > 0; i--) {
             answer[num_list.length - i] = num_list[i-1];
        }
        return answer;
    }
}