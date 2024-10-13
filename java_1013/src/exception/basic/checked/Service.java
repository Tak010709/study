package exception.basic.checked;

public class Service {
	Client client = new Client();
	
	public void callCatch() {
		try {
			client.call(); // 일부로 예외발생 시킨 코드
		} catch (Exception e) {
			System.out.println("예외처리 메세지 : "+ e.getMessage());
		}
		System.out.println("정상 동작");
	}
	
	public void callThrow() throws MyCheckedException{
		client.call();
	}
}
