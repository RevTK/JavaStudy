package CH02_VARIABLES;
// Overflow, Conversion
public class CH02_14_Overflow {
    public static void main(String[] args) {

System.out.println("-----------------------------------------------------------------------------------");
// 정수형의 오버플로우 (결과확인정도)

        short sMin = -32768,  sMax = 32767;
		char  cMin = 0,       cMax = 65535;

		System.out.println("sMin  = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		System.out.println("sMax  = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		System.out.println("cMin  = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax  = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);

System.out.println("-----------------------------------------------------------------------------------");
// 타입간변환방법 (중요)

	// 1. 문자와 숫자간의 변환
		System.out.println(3 + '0' + 1); // 52 (숫자 -> 문자) 52
		System.out.println((char)(3+'0')); // 3 (위처럼 안나오려면 "형변환 해야") 3
		System.out.println('3' - '0' + 1); // 4 (문자 -> 숫자) 4

	// 2. 문자열로 변환
		System.out.println(3 + ""); // "3" (숫자 -> 문자열)
		System.out.println('3' + ""); // "3" (문자 -> 문자열)

	// 3. 문자열을 숫자로 변환
		System.out.println(Integer.parseInt("3") + 1); // 4 (문자열 -> 숫자)
		System.out.println(Double.parseDouble("3.4") + 1); // 4.4 (문자열 -> 숫자)
		System.out.println("3".charAt(0) - '0' + 1); // 4 (문자열 -> 문자 -> 숫자)
        String str = "3";
		System.out.println(str.charAt(0) - '0' + 1); // 4 (문자열 -> 문자 -> 숫자)

		System.out.println("3" + 1); // 31 (문자열과 숫자1)
		System.out.println(3 + '0');   // 51 (char'0'은 숫자로 48 -> 그래서 51)

    }
}
