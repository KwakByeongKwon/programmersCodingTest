package day06;

/**
 * 문제
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class StringReverser {
    public static void main(String[] args) {
        String my_string = "jaron";

        System.out.println("jaron = " + solution(my_string));
    }

    static String solution(String my_string) {
        StringBuilder reversMy_string = new StringBuilder();
        reversMy_string.append(my_string);
        reversMy_string.reverse();
        return reversMy_string.toString();
    }

}
