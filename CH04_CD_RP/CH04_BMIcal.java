package CH04_CD_RS;
// while, if, break, switch, Thread.sleep
import java.util.Scanner;

public class CH04_BMIcal {
    public static void main(String[] args) throws InterruptedException {
        // bmiM 프로그램
        // 이름, 키, 체중
        // 계산식 = 체중 / (신장*신장)
        // 판정 저체중, 정상, 과체중, 비만
        // m, cm

        Scanner k = new Scanner(System.in);

        int cmORm;
        double height;
        double weight;
        double bmi = 0;

        System.out.print("이름 : ");
        String name = k.nextLine();

        System.out.print("키 : ");
        while (true) {
            System.out.println("1.cm? 2.m?");
            cmORm = k.nextInt();

            if (cmORm == 1 || cmORm == 2) {
                break;
            } else {
                System.out.println("1 혹은 2를 입력하세요");
            }
        }

        switch (cmORm) {
            case 1:
                System.out.print("cm로 입력하시오 : ");
                height = k.nextDouble();
                System.out.print("몸무게(kg) : ");
                weight = k.nextDouble();
                bmi = weight / ((height / 100) * (height / 100));

                break;
            case 2:
                System.out.print("m로 입력하시오 : ");
                height = k.nextDouble();
                System.out.print("몸무게(kg) : ");
                weight = k.nextDouble();
                bmi = weight / (height * height);
                break;
        }

        System.out.println("");
        System.out.println("<" + name + "의 결과>");

        String result;
        if (bmi >= 30) {
            result = "비만";
        } else if (25 <= bmi) {
            result = "과체중";
        } else if (20 <= bmi) {
            result = "정상";
        } else {
            result = "저체중";
        }

        System.out.println("계산중");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".\n");
        System.out.println("");

        System.out.printf("bmi : %.2f%n ", bmi);
        System.out.printf("당신은 \"%s\"입니다.%n", result);

        k.next();

    }
}
