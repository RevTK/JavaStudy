import java.util.Random;
import java.util.Scanner;

public class ChamGame {
    public static void main(String[] args) {
        // 참참참
        Random r = new Random();
        Scanner k = new Scanner(System.in);

        String[] face = { "", "왼쪽", "오른쪽", "위", "아래", "가만히" };

        // 안내
        int hold = 0;
        int myFace;
        int comFace;
        while (true) {
            System.out.println("---------------------");
            System.out.println("1.왼쪽");
            System.out.println("2.오른쪽");
            System.out.println("3.위");
            System.out.println("4.아래");
            System.out.println("5.가만히");
            System.out.println("---------------------");

            comFace = r.nextInt(5) + 1; // 1~5
            System.out.println(comFace); // 개발자 확인용(출시땐 삭제)

            while (true) {
                System.out.println("어디? (숫자로 입력)");
                myFace = k.nextInt();

                // 판정
                // 맞추면 걸린거
                // 피하면 좋은라

                if (myFace > 5 || myFace < 1) {
                    System.out.println("입력오류");
                } else {
                    break;
                }
            }

            if (comFace == myFace) {
                System.out.println("걸림");
                System.out.printf(" %d번 피함\n", hold);
                break;
            } else {
                System.out.println("피함");
                hold++;
            }

            System.out.println("나 : " + face[myFace]);
            System.out.println("컴 : " + face[comFace]);
        }
    }
}
