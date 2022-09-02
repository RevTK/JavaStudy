import java.util.Random;
import java.util.Scanner;

public class RspGame {
    public static void main(String[] args) {
        // 가위바위보 게임
        Random r = new Random();
        Scanner k = new Scanner(System.in);

        String[] handTable = { "", "가위", "바위", "보" };
        int myHand, comHand;
        int winTotal = 0;
        int winStreak = 0;
        int maxStreak = 0;
        int draw = 0;
        int lose = 0;
        int gameTotal = 0;
        double winRate = ((double)winTotal / (gameTotal - draw)) * 100;

        aaa: while (true) {

            while (true) {
                // 안내
                System.out.println("----------------------------");
                System.out.println("1. 가위");
                System.out.println("2. 바위");
                System.out.println("3. 보");
                System.out.println("4. 종료");
                System.out.println("----------------------------");

                comHand = r.nextInt(3) + 1; // 1~3
                System.out.println(comHand); // 개발자 확인용(출시땐 삭제)
                // 입력받기
                System.out.println("어디? (숫자로 입력)");

                myHand = k.nextInt();
                if (myHand > 4 || myHand < 1) {
                    System.out.println("----------------------------");
                    System.out.println("입력오류!! 1~4 숫자로 입력하라니까");
                    // 중복 while 없이
                    // System.err.println("입력오류");
                    // continue;

                } else if (myHand == 4) {
                    System.out.println("----------------------------");
                    System.out.println("게임을 종료합니다.");
                    break aaa;

                } else {
                    break;
                }
            }

            int result = comHand - myHand;
            if (myHand > 0 && myHand < 4) {
                if (result == 2 || result == -1)
                // myHand == 1 && comHand == 3 || myHand == 2 && comHand == 1 || myHand == 3 &&
                // comHand == 2
                {
                    System.out.println("----------------------------");
                    System.out.println("승리");
                    winTotal++;
                    winStreak++;
                    System.out.printf("%d연승중!\n", winStreak);

                } else if (myHand == comHand) {
                    System.out.println("----------------------------");
                    System.out.println("무승부");
                    winStreak = 0;
                    draw++;
                } else {
                    System.out.println("----------------------------");
                    System.out.println("패배");
                    winStreak = 0;
                    lose++;
                }

                if (winStreak > maxStreak) {
                    maxStreak = winStreak;
                }

            }
            gameTotal++;

            System.out.println("내 손 : " + handTable[myHand]);
            System.out.println("컴 손 : " + handTable[comHand]);
            
            
            if((gameTotal - draw != 0)) {
                System.out.println("현재승률 : " +  ((double)winTotal / (gameTotal - draw)) * 100 + "%");
            } else {System.out.println("현재승률 : " + 0 + "%");}
            
        }

        System.out.println("----------------------------");
        System.out.println("<<<< 최종결과 >>>>");
        System.out.println("승리횟수 : " + winTotal);
        System.out.println("무 승 부 : " + draw);
        System.out.println("패    배 : " + lose);
        System.out.println("마지막연승 : " + winStreak);
        System.out.println("최대연승 : " + maxStreak);
        System.out.println("총 판 수 : " + gameTotal);

        if((gameTotal - draw != 0)) {
            System.out.println("최종승률1 : " +  ((double)winTotal / (gameTotal - draw)) * 100 + "%");
        // System.out.printf("최종승률 : %d", winRate);
    } else {System.out.println("최종승률1 : " + 0 + "%");}

        System.out.println("최종승률2 : " +  winRate);

        // try {
            
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

    }
}
