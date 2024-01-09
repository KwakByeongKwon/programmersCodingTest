package day06;

/**
 * 문제
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class EvenOddCounter {
    public static void main(String[] args) {
        int[] num_list  = {1, 2, 3, 4, 5};

        System.out.printf("[%d",solution(num_list)[0]);
        System.out.printf(", %d]",solution(num_list)[1]);
    }

    static int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 1){
                odd++;
            } else {
                even++;
            }
        }

        int[] answer = {even, odd};
        return answer;
    }
}