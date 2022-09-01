package CH03_OPERATOR;
// Operator1
import java.util.Scanner;

public class CH03_01_Operator1 {
    public static void main(String[] args) {

System.out.println("-----------------------------------------------------------------------------------");
// 연산자와 피연산자

    // 산술연산자 + - * / %   ( << >> )
    // 비교연산자 > < >= <= == !=
    // 논리연산자 && || !   ( & | ^ ~ )
    // 대입연산자 =
    // 기타 항변환연산자 (type) 삼항연산자 ? :  instanceof연산자 instnaceof

// 연산자 우선순위 
    // 1. 산술 > 비교 > 논리 > 대입 (대입은 제일 마지막에 수행)
    // 2. 단항(피연산자1개)) > 이항(2) > 삼항(3). 단항 연산자의 우선순위가 이항 연산자보다 높다.
    // 3. 대입과 단항연산자 제외하고 모두 왼->오
        int x, y;
		x = y = 3; // y에 3이 저장된 후에, x에 3이 저장된다.
		System.out.println("x=" + x);
		System.out.println("y=" + y);

System.out.println("-----------------------------------------------------------------------------------");
// 증감연산자 

    System.out.println("[증감연산자]");
        int i=5, j=0;
		j = ++i; //전위형 -> 증가후에 참조하여 대입
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;
		j = i++; //후위형 -> 참조하여 대입후에 증가
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);

        int a=5, b=5;
		System.out.println(a++);  // a의 값을 출력 후, 1 증가
		System.out.println(++b);  // b의 값을 1 증가 후, 출력
		System.out.println("a = " + a + ", b = " +b);

System.out.println("-----------------------------------------------------------------------------------");
// 부호연산자 -> '-'는 피연산자의 부호를 반대로 / '+'는 아무런 일안함

System.out.println("[부호연산자]");
        int c = -10;
		c = +c;
		System.out.println(c);
		c = -10;
		c = -c;
		System.out.println(c);

System.out.println("-----------------------------------------------------------------------------------");
// 형변환연산자 -> CH02_14 참조

System.out.println("[항변환연산자]");
    // "변수" 또는 "상수"의 타입을 다른 타입으로 변환 : (타입)피연산자
        double d = 85.4;
		int score = (int) d; // double 8바이트를 int 4바이트로 바꿔야 하니까
		System.out.println("score=" + score);
		System.out.println("d=" + d);
        
        System.out.println((char)65); // 'A' (int -> char)
        System.out.println((int)'A'); // 65 (char -> int)
        System.out.println((int)1.6f); // 1 (float -> int)
        System.out.println((float)10); // 10.0f (int -> float)

    // 자동형변환 -> 형변환 이유는 서로 다른 타입 일치시키기 위해서. 값손실 없을때 ok, 값손실있으면 강제로 해줘야.
        float f1 = 1234; // int타입의 값을 float타입 변수에 저장 -> 대>소
        float f2 = (float)1234; // 컴파일러가 자동으로 형변환해주는것

        // int ii = 3.14f; -> 에러 -> 소<대
        int ii = (int)3.14f; // 굿

        // byte bb = 1000; -> 에러 -> 애초범위 아니니까
        byte bb = (byte)1000; // Ok, 대신 강제 값손실 발생해서 -24가 나옴

System.out.println("-----------------------------------------------------------------------------------");
// 사칙연산자

    System.out.println("[사칙연산자]");
        System.out.println(5/2); // int라서 소수점은 버려진다.
		System.out.println(5/(float)2);  //  (float)5/2의 결과도 동일

System.out.println("-----------------------------------------------------------------------------------");
// 산술변환 : 연산전에 피연산자의 타입을 일치시키는것
    // 1. 두 피연산자의 타입을 같게 일치시킨다(더큰 타입으로)
    // 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.

    System.out.println("[산술변환]");   
        System.out.println('2'-'0'); // char - char => int - int => 유니코드50 - 유니코드48

        int i1 = 1_000_000;    // 1,000,000   1백만 
		int i2 = 2_000_000;    // 2,000,000   2백만 
		long long1 = (long)i1 * i2;       // a * b = 2,000,000,000,000 ?
		System.out.println("long1 = "+long1);

        long long2 = 1_000_000 * 1_000_000;
		long long3 = 1_000_000 * 1_000_000L; // long1~3까지 서로 비교하기
		System.out.println("long2="+long2);
		System.out.println("long3="+long3);

System.out.println("-----------------------------------------------------------------------------------");
// 반올림 - Math.round() -> 실수를 소수점 첫자리에서 반올림한 정수 반환

    System.out.println("[반올림]");   
        long result = Math.round(4.52); // 5
        System.out.println(result);

        double pi = 3.141592; // -> 3.142로 만드려면 아래처럼
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi); // 3.142

System.out.println("-----------------------------------------------------------------------------------");
// 나머지연산자 %

    System.out.println("[나머지연산자 %]");   
        int i3 = 10;
		int i4 = 8;
		System.out.printf("%d을 %d로 나누면, %n", i3, i4); 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", i3 / i4, i3 % i4);

        System.out.println(-10%8); // -2
		System.out.println(10%-8); // 2
		System.out.println(-10%-8); // -2

    }
}
