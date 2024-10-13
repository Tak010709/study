package exception.ex;

public class NetworkServiceVO {
	public void sendMessage(String data) {
		
		String address = "http://example.com";
		NetworkCilentVO cilentVO = new NetworkCilentVO(address);
		
		cilentVO.connect();
		cilentVO.send(data);
		cilentVO.disconnect();
		
	}
}
