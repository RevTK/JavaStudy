package CH04_CD_RS;

import java.util.Scanner;

public class CH04_12_for {
    public static void main(String[] args) {
		
System.out.println("-----------------------------------------------------------------------------------");
// for문 : 조건을 만족하는 동안 블럭{}을 반복 - "반복횟수를 알 때 적합"

	System.out.println("[1~7사이 임의정수 5개]");
        int num = 0;
		for (int i = 1; i <= 5; i++) { // 괄호{} 안의 내용을 5번 반복한다.
			//   i부터,  5까지, 1씩증가
            // num = (int) (Math.random() * 6);
			num = (int) (Math.random() * 6) + 1; // "임의의 정수 만들기:0.0~1.0 사이 double값 반환"
			System.out.println(num);
        }

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[Hello 3번 반복한다]");
        for (int i = 1; i <= 3; i++) { // 괄호{}안의 문장을 3번 반복
        // for (int i = 1; i <= 10; i+2) -> 괄호{}안의 문장을 5번 반복
        System.out.println("Hello");
        }

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[1~3순서대로 출력]");
        for(int i=1;i<=3;i++)
        System.out.println(i); // i의 값을 출력한다.(print()를 쓰면 가로로 출력된다.)

	System.out.println("[10~7순서대로 출력]");
        for(int i=10; i>=7;i--)
        System.out.println(i);   // print()를 쓰면 가로로 출력된다.

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[3을 5번 더한 합계]");
		int sum1 = 0;
		for(int i=1; i <= 5; i++) {
			sum1 += 3;
		}
		System.out.println(sum1);

	System.out.println("[1~5의 합계]");
        int sum2 = 0;	// 합계를 저장하기 위한 변수.
		for(int i=1; i <= 5; i++) {
			sum2 += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum2);
		}

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[1~5와 10~5를 5개 나열]");
		for(int i=1, j=10; i<=5; i++, j--) {
			System.out.println("i = " + i + ", j=" + j);
		}
		
System.out.println("-----------------------------------------------------------------------------------");
// 중첩 for문

	System.out.println("[중첩for문을 통해 5줄나열하는데 *하나씩 늘리기]");
        for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}

	}
}
