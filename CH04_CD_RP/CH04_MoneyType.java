package CH04_CD_RS;
// several IF + using %
import java.util.Scanner;

public class CH04_MoneyType {
    public static void main(String[] args) {
        // 잔돈 계산 해주는 프로그램

        Scanner sc = new Scanner(System.in);

        System.out.println("거스름돈 계산 : ");
        int myMoney = sc.nextInt();

        if (myMoney >= 50000) {
            int fwwww = myMoney / 50000;
            System.out.printf("5만원 : %d장%n", fwwww);
            myMoney %= 50000;
        }

        if (myMoney >= 10000) {
            int owwww = myMoney / 10000;
            System.out.printf("1만원 : %d장%n", owwww);
            myMoney %= 10000;
        }

        if (myMoney >= 5000) {
            int fwww = myMoney / 5000;
            System.out.printf("5천원 : %d장%n", fwww);
            myMoney %= 5000;
        }

        if (myMoney >= 1000) {
            int owww = myMoney / 1000;
            System.out.printf("1천원 : %d장%n", owww);
            myMoney %= 1000;
        }
        if (myMoney >= 500) {
            int fww = myMoney / 500;
            System.out.printf("5백원 : %d개%n", fww);
            myMoney %= 500;
        }

        if (myMoney >= 100) {
            int ww = myMoney / 100;
            System.out.printf("백원 : %d개%n", ww);
            myMoney %= 100;
        }

        if (myMoney >= 10) {
            int ww = myMoney / 10;
            System.out.printf("십원 : %d개%n", ww);
            myMoney %= 10;
        }
    }
}
