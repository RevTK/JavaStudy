package CH04_CD_RS;
// while, if, random, counting
import java.util.Random;
import java.util.Scanner;

public class CH04_GuessNumber {
    public static void main(String[] args) {
        // 넘버업다운 - 언제끝? 맞추면 - 몇번 시도인지 안내

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int comNum = r.nextInt(60) + 1;
        System.out.println(comNum);

        int cnt = 0;
        while (true) {

            cnt = cnt + 1;

            System.out.println("Num : ");
            int myNum = sc.nextInt();

            if (myNum > comNum) {
                System.out.println("down");
            } else if (myNum < comNum) {
                System.out.println("Up");
            } else if (myNum == comNum) {
                System.out.println("good");
                break;
            } 

            if (myNum == 0) {
                System.out.println("종료합니다.");
                break;
            } else if(myNum > 60 || myNum <0 ) {
                System.out.println("1~60사이 숫자를 입력해주세요.");
                continue;
            }
        }
        System.out.println("고생하셨습니다.");
        System.out.println("반복횟수 : " + cnt);

    }
}
