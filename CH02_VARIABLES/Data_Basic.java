package CH02_VARIABLES;
// Data,Variable Type, Constant, Literal,Primitiv-Reference Type, Change Two Type
public class CH02_1_데이터기본 {
    public static void main(String[] args) {

System.out.println("-----------------------------------------------------------------------------------");
// 변수타입, 상수, 리터럴

        int a = 5;                // int a;와 x =5;를 이처럼 한 줄로 합칠 수 있다.
		System.out.println(a);    // 화면에 a의 값인 6가 출력된다.
		a = 10;                   // 변수 a에 10을 저장. 기존에 저장되어 있던 5는 지워짐. 
		System.out.println(a);    // 화면에 a의 값인 11이 출력된다.

		final int MAX = 100;	//MAX는 상수
		// final	  MAX = 200; // 에러

        int x = 10;
		int y = 5;        // 이처럼 한줄로 int x = 10, y = 5;

System.out.println("-----------------------------------------------------------------------------------");
// Primitive Type 기본형 [byte(1), boolean(1)256, short(2), char(2)65535, int(4)20억, float(4), long(8)800경, double(8)]

	//1비트는 2진수의 1자리, 1바이트 = 8비트
	//n비트로 표현할수 있는 값의 수 = 2의n개
	//n비트로 표현할수 있는 부호없는 정수의 범위 = 0 ~ 2의n-1개 (char 문자코드)
	//n비트로 표현할수 있는 부호있는 정수의 범위 = -2의n-1 ~ 2의n-1 - 1
	//float의 정밀도 7자리 32비트 <-> double 정밀도15자리 64비트

		long l = 10_000_000_000L;	// 정수형 여기선 L생략불가, 하지만 100이면 int범위라서 L생략가능

		int i = 100;	// 정수형 10진수
		int oct = 0100;	// 정수형 8진수
		int hex = 0x100;	// 정수형 16진수

		float f = 3.14f;	// 실수형 f는 생략불가
		double d = 3.14;	// 실수형

		char ch = 'a';		// 문자형
		boolean bL = true;	// 논리형

System.out.println("-----------------------------------------------------------------------------------");
// Reference Type 참조형 [String, System 등] : "객체의 주소를 저장"위한 것

		String str = "abc";

System.out.println("-----------------------------------------------------------------------------------");
// 변수와 리터럴 타입의 불일치

	//(1) 범위가 변수 > 리터럴인 경우 OK
		int i1 = 'A'; // int > char
		long l1 = 123; // long > int
		double d1 = 3.14f; // double > float

	//(2) 범위가 변수 < 리터럴인 경우 에러
		// int i2 = 30_00000_0000; <- int의 범위(+-20억) 벗어남
		// long l2 = 3.14f; <- long < float
		// float f2 = 3.14d; <- float < double

	//(3) byte, short 변수에 int리터럴 저장가능
		byte b = 100; // Ok. byte 범위(-128~127)에 속함 (byte b = 128; -> 에러)

		System.out.println(1e5);	// 1의 5승

System.out.println("-----------------------------------------------------------------------------------");
// 문자와 문자열

        String name = "Ja" + "va";
		String str1  = name + 8.0;

		System.out.println(name);
		System.out.println(str1);

		// 문자열 + any type = 문자열 / any tpe + 문자열 = 문자열
		System.out.println(7 + " "); // 숫자 -> 문자열7
		System.out.println(" " + 7); // 숫자 -> 문자열7
		System.out.println(7 + "");     //8
		System.out.println("" + 7);     //7 (위와 같은 결과)
		System.out.println("" + "");    //2줄 띄어쓰기
		System.out.println(7 + 7 + ""); // 14가 되고나서 문자열14
		System.out.println("" + 7 + 7);	// 숫자 -> 문자열77

System.out.println("-----------------------------------------------------------------------------------");
// 두 변수 바꾸기

		int tmp = x;    // 1. x의 값을 tmp에 저장
		x = y;          // 2. y의 값을 x에 저장
 		y = tmp;        // 3. tmp에 저장된 값을 y에 저장
		System.out.println("x="+x); 
		System.out.println("y="+y); 
    }
}
