package day09;

/**
 * 문제
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
 * 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를
 * return 하는 solution 함수를 완성해주세요.
 */
public class BeadDivisionCombinatorics {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println("result = " + solution(balls, share));
    }

    static int solution(int balls, int share) {
        long answer = 1;
        long mod = 1000000007;

        for(int i = balls; i >= balls - share + 1; i--){
            answer *= i;
            answer %= mod;
        }
        for(int i = 1; i <= share; i++){
            answer *= inverse(i, mod);
            answer %= mod;
        }

        return (int)answer;
    }

    private static long inverse(long a, long mod) {
        long p = mod - 2;
        long result = 1;

        while(p > 0) {
            if(p % 2 == 1) {
                result *= a;
                result %= mod;
            }
            a *= a;
            a %= mod;
            p /= 2;
        }

        return result;
    }
}
