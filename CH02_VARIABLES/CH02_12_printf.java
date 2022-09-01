package CH02_VARIABLES;
// printf:%b, %d, %o, %x(%X), %f, %e(%E), %c, %s & Accuracy
public class CH02_12_printf {
    public static void main(String[] args) {

System.out.println("-----------------------------------------------------------------------------------");
// println()의 단점 - 출력형식 지정불가
	// (1) 실수의 자리수 조절불가 - 소수점 n자리만 출력하려면?
	// (2) 10진수로만 출력된다 - 8진수, 10진수로 출력하려면?

// printf()의 지시자 - %b, %d, %o, %x(%X), %f, %e(%E), %c, %s

		System.out.printf("%d%n", 15);	// 15 10진수

		System.out.printf("%o%n", 15);	// 17 8진수
		System.out.printf("%#o%n", 15);	// 017 8진수 접두사 붙이기
		
		System.out.printf("%o%n", 15);	// f  16진수
		System.out.printf("%#x%n", 15);	// 0xf 16진수 접두사 붙이기
		System.out.printf("%#x%n", 15);	// 0xF 16진수 접두사 붙이기
		
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111 2진수

System.out.println("-----------------------------------------------------------------------------------");
// 실수 출력을 위한 지시자 %f - 지수형식(%e,간략한 형식 %g)
	// float은 정밀도7이고 소수점아래6자리까지라서 double로

		float f = 111.23456789f;
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 111.23456789;
		String url = "www.codechobo.com";

		System.out.printf("f=%f%n", f); // 7자리까지만 정확하고 나머진 부정확
		System.out.printf("d=%f%n", d); // 15자리까지 가능하니 다맞고 소수점6자리는 반올림된것

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%05d]%n", 10); //왼쪽 빈공간 0으로 채움

		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 일부 8글자만 출력
    }
}
