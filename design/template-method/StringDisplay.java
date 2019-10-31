/**
 * 文字列表示具象クラス
 */
public class StringDisplay extends AbstractDisplay {
	
	private String string;
	private int width;
	public StringDisplay() {}
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	public void open() {
		printLine();
	}
	
	public void print() {
		System.out.println(" | " + string + " | ");
	}
	
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.println("+");
		
		for (int i=0; i < width; i++) {
			System.out.println("-");
		}
		
		System.out.println("+");
	}

}