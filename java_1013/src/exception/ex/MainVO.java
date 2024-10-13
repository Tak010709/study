package exception.ex;
import java.util.Scanner;

public class MainVO {
	
	public static void main(String[] args) {
		
		NetworkServiceVO networkServiceVO = new NetworkServiceVO();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("전송할 문자: ");
			String input = scanner.nextLine();
			if( input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			networkServiceVO.sendMessage(input);
			System.out.println();
		}
		System.out.println("프로그램 정상종료");
	}
}
