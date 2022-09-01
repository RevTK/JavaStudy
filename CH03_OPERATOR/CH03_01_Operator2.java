package CH03_OPERATOR;
// Operator2
import java.util.Scanner;

public class CH03_13_연산자 {
    public static void main(String[] args) {

System.out.println("-----------------------------------------------------------------------------------");
// 비교연산자 : > < >= <= == != (문자열 비교에는 .equals()를 사용!!!) (equalsIgnorecase -> 대소문자 무시)

    System.out.println("[비교연산자 + equals]");
        String str1 = "abc";
        String str2 = "abc"; // -> 위아래 같음
        System.out.println(str1==str2); //true
        System.out.println(str1.equals(str2)); //true

        String strA = new String("abc");
		String strB = new String("abc"); // -> 이렇게 하는경우는 주의
        System.out.println(strA==strB); // false!!!!!!!!!!!!!!
        System.out.println(strA.equals(strB)); // true

System.out.println("-----------------------------------------------------------------------------------");
// 논리연산자 : 조건식 연결시 사용 // 우선순위 1. &&(AND결합) 2. ||(OR결합)

    System.out.println("[논리연산자 - 숫자인가 영문자인가 ]");
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.printf("문자를 [하나] 입력하세요.>");
        String input = scanner.nextLine();
        ch = input.charAt(0); //문자열을 문자로 변환

            if('0' <= ch && ch <= '9') {
        System.out.printf("입력하신 문자는 숫자입니다.%n");
                }

            if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
          System.out.printf("입력하신 문자는 영문자입니다.%n");
            }

    System.out.println("[논리연산자 - 문자C에 대하여 ]");
        char ch2 = 'C';
        System.out.printf("ch2 = %c%n", ch2);
        System.out.printf("ch2 < 'a' || ch > 'z'= %b%n", ch2 < 'a' || ch2 > 'z');
        System.out.printf("!('a' <= ch2 && ch2 <= 'z')= %b%n", !('a'<= ch2 && ch2<='z'));
        System.out.printf("  'a' <= ch2 && ch2 <='z' = %b%n", 'a'<=ch2 && ch2<='z');

System.out.println("-----------------------------------------------------------------------------------");
// 논리부정연산자 : !

    System.out.println("[논리부정연산자 !]");
        boolean b = true; 
        System.out.printf("b = %b%n", b); // true
        System.out.printf("!b = %b%n", !b); // false
        System.out.printf("!!b = %b%n", !!b); // true
        System.out.printf("!!!b = %b%n", !!!b); // false

System.out.println("-----------------------------------------------------------------------------------");
// 조건연산자(삼항연산자 : 조건식 ? 식1(참) : 식2(거짓))

    System.out.println("[조건연산자(삼항) -  앞에 +-붙여보기]");
        int  x, y, z;
        int  absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        
        //부호를 붙여주도록 출력하는 것
        absX = x >= 0 ? x : -x;  
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;
        // 조건 연산자를 중첩
        signX = x > 0 ? '+' : ( x==0 ? ' ' : '-'); 
        signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
        signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

        System.out.printf("x = %c%d%n", signX, absX);
        System.out.printf("y = %c%d%n", signY, absY);
        System.out.printf("z = %c%d%n", signZ, absZ);

// 대입연산자

// 복합대입연산자
        // i += 3;  (양쪽같음)  i = i +3;
        // i *= 10 + j  (양쪽같음)  i = i * (10 + J) <- 괄호 이것만 주의하기
    }
}
