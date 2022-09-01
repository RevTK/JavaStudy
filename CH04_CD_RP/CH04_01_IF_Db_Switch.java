package CH04_CD_RP;
// if-else, else if, duplication, Switch
import java.util.Scanner;
//조건문 : 조건을 만족하는"때만" {}를 수행
//반복문 : 조건을 만족하는"동안" {}를 수행
public class CH04_01_IF_Double {
    public static void main(String[] args) {
		
System.out.println("-----------------------------------------------------------------------------------");
// if - else문

	System.out.println("[true & false]");
        int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

	System.out.println("[입력한 숫자가 0인지 아닌지]");
        System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		} else { // input!=0인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

System.out.println("-----------------------------------------------------------------------------------");
// if - else if문

	System.out.println("[입력받은 숫자 학점계산1]");
        int score  = 0;   // 점수를 저장하기 위한 변수
		char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.print("점수를 입력하세요.>");
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

		if (score >= 90) {         // score가 90점 보다 같거나 크면 A학점
			 grade = 'A';             
		} else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
			 grade = 'B'; 
		} else if (score >=70) {   // score가 70점 보다 같거나 크면 C학점 
			 grade = 'C'; 
		} else {                   // 나머지는 D학점
			 grade = 'D'; 
		}
		System.out.println("당신의 학점은 "+ grade +"입니다.");

System.out.println("-----------------------------------------------------------------------------------");
// 중첩if문 - if문안의 if

	System.out.println("[입력받은 숫자 학점계산2(+-포함)]");
		int  score1 = 0;   // 점수를 저장하기 위한 변수
		char grade1 = ' ', opt = '0';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.print("점수를 입력해주세요.>");
		score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장

		System.out.printf("당신의 점수는 %d입니다.%n", score1);

		if (score1 >= 90) {           // score가 90점 보다 같거나 크면 A학점(grade)
			grade1 = 'A';
			if (score1 >= 98) {        // 90점 이상 중에서도 98점 이상은 A+
				opt = '+';	
			} else if (score1 < 94) {  // 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score1 >= 80){     // score가 80점 보다 같거나 크면 B학점(grade)
			grade1 = 'B';
			if (score1 >= 88) {
				opt = '+';
			} else if (score1 < 84)	{
				opt = '-';
			}
		} else {                     // 나머지는 C학점(grade)
			grade1 = 'C';
		}	
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade1, opt);
	    
	    System.out.println("-----------------------------------------------------------------------------------");
	    
// switch문 : 처리해야 하는 경우의 수가 많을 때 쓰는 -> if - else if와 변환가능

	System.out.println("[switch문으로 몇월이 어느계절인지?]");
        System.out.print("현재 월을 입력하세요.>");

		int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break; // switch문을 벗어난다. <- 실수로 빼먹는 경우 많으니 조심!!!
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
            //		case 12:	case 1: case 2:
			default: // 조건식의 결과와 일치하는 case문이 없을때 수행
				System.out.println("현재의 계절은 겨울입니다.");
		}
		
System.out.println("-----------------------------------------------------------------------------------");
// switch문의 제약조건
    // 1. 조건식 결과는 정수 또는 문자열이어야
    // 2. case문의 값은 정수 상수(문자포함), 문자열만 가능하며, 중복되지 않아야.
    // 3. 변수, 실수 불가

System.out.println("[switch문으로 몇월이 며칠이 있는지?]");

    }
}
