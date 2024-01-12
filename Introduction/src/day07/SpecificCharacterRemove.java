package day07;

/**
 * 문제
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class SpecificCharacterRemove {
    public static void main(String[] args) {
        String my_string = "hello";
        String letter = "h";
        my_string = my_string.replace(letter,"");
    }

    static String solution(String my_string, String letter) {
        my_string = my_string.replace(letter,"");
        return my_string;
    }
}
