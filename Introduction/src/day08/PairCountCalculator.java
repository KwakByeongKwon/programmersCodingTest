package day08;

import java.util.Arrays;

/**
 * 문제
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때
 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class PairCountCalculator {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        for (int i : solution(emergency)) {
            System.out.println(i);
        }
    }

    static int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        Arrays.sort(answer);

        int[] result = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            int idx = Arrays.binarySearch(answer, emergency[i]);
            result[i] = emergency.length - idx;
        }

        return result;
    }
}