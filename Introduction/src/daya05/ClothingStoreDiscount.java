package daya05;

/**
 * 문제
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 */
public class ClothingStoreDiscount {
    public static void main(String[] args) {
        int price = 489489;

        System.out.println("answer = " + solution(price));
    }

    static int solution(int price) {
        if (price >= 500000){
            price = (int)(price * 0.8);
        } else if (price >= 300000) {
            price = (int)(price * 0.9);
        } else if (price >= 100000) {
            price = (int)(price * 0.95);
        }
        return price;
    }
}