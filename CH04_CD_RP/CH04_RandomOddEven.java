package CH04_CD_RS;
// Random, while, if, break
import java.util.Random;
import java.util.Scanner;

public class CH04_RandomOddEven {
    public static void main(String[] args) {
        // Odd Even 홀짝게임
        Scanner sc = new Scanner(System.in);
        // 랜덤숫자
        Random r = new Random();
        int comNum = r.nextInt(10) + 1;

        // int r2 = (int)(Math.random()*100)+1;
        // System.out.println(r2);

        System.out.println("숫자 : " + comNum);

        while (true) {

            System.out.println("1.홀? 2.짝? 3.종료");
            int ans = sc.nextInt();
            if (ans == 1) {
                if (comNum % 2 > 0) {
                    System.out.println("정답입니다.");
                    break;
                } else {
                    System.out.println("오답");
                }

            } else if (ans == 2) {
                if (comNum % 2 == 0) {
                    System.out.println("정답입니다.");
                    break;

                } else {
                    System.out.println("오답");
                }

            } else if (ans == 3) {
                System.out.println("종료합니다.");
                break;
            }

            else {
                System.out.println("1 혹은 2만 입력하세요");
            }
        }

    }
}
