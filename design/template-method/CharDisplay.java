/**
 * 単一文字表示の具象クラス
 */
public class CharDisplay extends AbstractDisplay {
	
	private char ch;
	
	public CharDisplay() {}
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	public void open() {
		System.out.println("<<");
	}
	
	public void print() {
		System.out.println(this.ch);
	}
	
	public void close() {
		System.out.println(">>");
	}
		
}