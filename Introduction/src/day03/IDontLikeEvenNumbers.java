package day03;

import java.util.Arrays;

/**
 * 문제
 * 정수 n이 매개변수로 주어질 때,
 *  n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class IDontLikeEvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = solution(n);
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.printf("[%d",arr[i]);
            } else if (i != arr.length - 1) {
                System.out.printf(", %d",arr[i]);
            } else {
                System.out.printf(", %d]",arr[i]);
            }
        }
    }

    static int[] solution(int n) {
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                answer[idx] += i;
                idx++;
            }
        }
        return Arrays.copyOf(answer,idx);
    }
}