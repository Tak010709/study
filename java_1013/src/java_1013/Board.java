package java_1013;

public class Board {
	
	
	// 게시글 번호 bno
	// 글작성자 writer
	// 글내용 content
	
	// 매개변수 있는 생성자
	// 객체 생성시점에 위에 필드 한번에 초기화 해주는거
	
	// getter / setter 메서드
	private int bno;
	private String writer;
	private String content;
	private static Board instance;
	
	public static Board getInstance() {
		if(instance == null) {
			instance = new Board();			
		}
		
		return instance;
	}
	
	public Board() {
		
	}
	public Board(int bno, String writer, String content) {
		this.bno = bno;
		this.writer = writer;
		this.content = content;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getBno() {
		return bno;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getwriter() {
		return writer;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		
		return content;
	}
	
	
}
