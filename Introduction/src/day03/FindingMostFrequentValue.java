package day03;

import java.util.Arrays;

/**
 * 문제
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 */
public class FindingMostFrequentValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3, 3, 4};

        System.out.println("answer = " + solution(array));
    }

    static int solution(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] arr = new int[max + 1];
        for (int i : array) {
            arr[i] += 1;
        }

        int count = 0;
        for (int i : arr) {
            if (arr[findMaxIndex(arr)] == i){
                count++;
                if (count == 2){
                    break;
                }
            }
        }

        return count == 1 ? findMaxIndex(arr) : -1;
    }

    static int findMaxIndex(int[] arr){
        int max = arr[0];
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    static int findMax(int[] array){
        int max = array[0];
        for (int i : array) {
            if (max < i){
                max = i;
            }
        }
        return max;
    }

}
