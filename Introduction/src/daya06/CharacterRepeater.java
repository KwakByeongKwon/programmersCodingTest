package daya06;

/**
 * 문제
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class CharacterRepeater {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println("hello = " + solution(my_string,n));
    }

    static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
