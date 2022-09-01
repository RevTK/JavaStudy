import java.util.Random;
import java.util.Scanner;

public class RSPMain {
    public static void main(String[] args) {

        // 가위바위보 게임
        Random r = new Random();
        Scanner k = new Scanner(System.in);

        String[] handTable = { "", "가위", "바위", "보" };

        int win = 0;
        int win2 = 0;
        int max = 0;
        int myHand;
        int comHand;
        int draw = 0;
        int lose = 0;
        int total = 0;
        while (true) {

            // 안내
            System.out.println("----------------------------");
            System.out.println("1. 가위");
            System.out.println("2. 바위");
            System.out.println("3. 보");
            System.out.println("4. 종료");
            System.out.println("----------------------------");

            comHand = r.nextInt(3) + 1; // 1~5
            System.out.println(comHand); // 개발자 확인용(출시땐 삭제)

            System.out.println("어디? (숫자로 입력)");

            myHand = k.nextInt();
            
            if (myHand > 4 || myHand < 1) {
                System.err.println("입력오류");
                continue;

            } else if (myHand == 4) {
                System.out.println("게임을 종료합니다.");
                break;

            } else if (myHand > 0 && myHand < 4) {

            max = win2;
                if(win2 > max){
                    max = win2;
                }
            if (myHand == 1 && comHand == 3 || myHand == 2 && comHand == 1 || myHand == 3 && comHand == 2) {
                System.out.println("승리");
                win++;
                win2++;
                max++;
                }
                else if (myHand == comHand) {
                    System.out.println("무승부");
                    win2 = 0;
                    draw++;
                }
                else {
                System.out.println("패배");
                win2 = 0;
                lose++;
                }

            }

            total++;
            
            System.out.println("----------------------------");
            System.out.println("내 손 : " + handTable[myHand]);
            System.out.println("컴 손 : " + handTable[comHand]);
        }

        System.out.println("승리횟수: " + win);
        System.out.println("무승부 : " + draw);
        System.out.println("패배 : " + lose);
        System.out.println("연승: " + win2);
        System.out.println("최대연승: " + max);
        System.out.println("총판수 : " + total);
        System.out.println("승률 : " + (win/(total-draw))*100);

        }
        
    }
