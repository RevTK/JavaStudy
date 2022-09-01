package CH04_CD_RS;

import java.util.Scanner;

public class CH04_16_while {
    public static void main(String[] args) {
		
System.out.println("-----------------------------------------------------------------------------------");
// while문 : 조건을 만족시키는 동안 블럭 {}을 반복 - 반복횟수 모를때 (for문과 100프로 서로 작용)
	
	System.out.println("[반복문구5개 출력]");
        int i= 5;
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}

        // while(i!=0) { // 위아래 같은것
        //     i--;
		// 	System.out.println(i + " - I can do it.");
		// }

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[합이 25넘지않을때까지 더하기]");
        int sumA = 0;
		int iA = 0;
		while (sumA <= 25) {
			System.out.printf("%d - %d%n", iA, sumA);
			sumA += ++iA;
		}

System.out.println("-----------------------------------------------------------------------------------");

	System.out.println("[입력된 숫자 각 자리수의 합 구하기]");
		int numB = 0, sumB = 0;
		System.out.print("숫자를 입력하세요.(예:12345)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		numB = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환
        // numB = scanner.nextInt(); -> 위두줄 지우고 이렇게만 써도 되지 않을까

		while(numB>0) { 
			// num을 10으로 나눈 나머지를 sum에 더함
			sumB += numB%10; 	// sumB = sumB + num%10;
			System.out.printf("num=%d sum=%3d%n", numB, sumB);

			numB /= 10;   // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
		}

        // for(numB = Integer.parseInt(tmp); numB > 0; numB = numB/10) {
        //     System.out.println(numB + " " + numB%10);
        //     sumB += numB%10;
        // }

		System.out.println("각 자리수의 합:"+sumB);

System.out.println("-----------------------------------------------------------------------------------");
// do-while문 : 블럭{}을 최소한 한번이상 반복 - "사용자가 입력받을때 유용"

	System.out.println("['숫자맞추기'게임 - do{if문} + while문 사용해서]");
		int input  = 0, answer = 0;
		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 수를 저장

		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();

			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");	
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");			
			}
		} while(input!=answer); // -> 마지막에 ; 붙이는 것을 절대 까먹지 말것!!
        
		System.out.println("정답입니다.");

System.out.println("-----------------------------------------------------------------------------------");
// break문 : 자신이 포함된 하나의 반복문을 벗어난다.

	System.out.println("[수의 합계가 100을 넘어가면 그만 - break문 활용]");
		int sumC = 0;
		int iC   = 0;

		while(true) { // -> true 라서 무한반복(꼭써줘야 - for(;;) ;;는 생략가능)
			if(sumC > 100)
				break; // -> break문이 수행되면, while문을 완전히 벗어난다.
			++iC;
			sumC += iC;
		} // end of while

		System.out.println("iC=" + iC);
		System.out.println("sumC=" + sumC);

System.out.println("-----------------------------------------------------------------------------------");
// Continue문 : 자신이 포함된 반복문의 끝으로 이동 -> 다음 반복으로 "넘어감"
//		  	  : 전체 반복중에서 특정 조건시 반복을 건너뛸때 유용

	System.out.println("[0~10중에서 3의배수 제외하고 보여주기 - continue문 활용]");
		for(int iD=0; iD <= 10; iD++) {
			if (iD%3==0)
				continue; // -> 조건식이 참이되어 continue문 수행되면 블럭끝으로 이동.
			System.out.println(iD); // -> break문과 달리 반복문 벗어나지 않음
		}

System.out.println("-----------------------------------------------------------------------------------");
// 이름붙은 반복문 : "반복문에 이름"을 붙여서 하나 이상의 반복문을 벗어날 수 있다.

	System.out.println("[이름붙은 반복문을 break로 활용]");
        // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int iE=2; iE <= 6; iE++) {	
            for(int jE=1; jE <= 9 ; jE++) {
                if(jE==5)
                    break Loop1; // 반복문 한번에 벗어나기 위해, 이름없으면 속한 하나만 벗어나겠지...
//						break;
//						continue Loop1; // -> 이런식으로 쓰는 경우 없다보면 됨
//						continue;
                System.out.println(iE+"*"+ jE +"="+ iE*jE);
            } // end of for iE
            System.out.println();
        } // end of Loop1
        
    }
}

