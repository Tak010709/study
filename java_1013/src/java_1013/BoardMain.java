package java_1013;

public class BoardMain {

	public static void main(String[] args) {
		Board board = new Board(1, "작성자1", "글내용1");
		
		System.out.println(board.getBno());
		System.out.println(board.getwriter());
		System.out.println(board.getContent());
		
		Board board2 = new Board();
		board2.setBno(2);
		board2.setWriter("작성자2");
		board2.setContent("글내용2");
		
		System.out.println(board2.getBno());
		System.out.println(board2.getwriter());
		System.out.println(board2.getContent());
		
		Board board3 = Board.getInstance();
		board3.setBno(3);
		board3.setWriter("작성자3");
		board3.setContent("글내용3");
		
		System.out.println(board2.getBno());
		System.out.println(board2.getwriter());
		System.out.println(board2.getContent());
		
		System.out.println(board3 == board2);
		
		
	}

}
