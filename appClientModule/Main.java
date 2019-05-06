import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 입력이 주어진다.
		String str = "";
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			str += scn.nextLine();
			System.out.println(str);
			
		}
		
		
		// 입력은 최대 100줄로 이루어져 있고
		// - 100줄이 넘으면 false.
		
		
		// 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
		// - 정규표현식. 소문자, 대문자, 공백, 숫자 가 있는지 검사. 그 이외의 것이 있으면 false.
			
		
		// 각 줄은 100글자를 넘지 않으며,
		// - 공백을 제거한 한줄의 글자수가 100글자를 넘으면 false.
		
		
		// 빈 줄은 주어지지 않는다.
		// - 공백을 제거한 한줄이 빈줄이면 false.
		
		// 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		// - 첫글자가 공백이거나, 끝글자가 공백이면 false.
		
		// 구현 : 입력을 받아서 콘솔에 출력.
		// 입력 받은 값을 String 변수에 저장.
		// 저장하기전 공백을 제거한 글자의 수가 100글자가 넘는지 검사.
		// 넘으면 false.
		
		// 특수문자를 정규표현식으로 검사.
		// 지정된 문자 이외의 문자가 입력되서 정규표현식이 false면 입력을 false.
		
		// 안넘으면 String 변수에 저장.
		// String 변수에 \n 의 갯수가 100개면 false.
		
		
	}

}