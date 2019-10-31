public class Main {
	
	public static void main(String[] args) {
		// 具象クラスのインスタンス生成
		AbstractDisplay cd = new CharDisplay('H');
		AbstractDisplay sd = new StringDisplay("Hello World.");
		AbstractDisplay id = new IntegerDisplay(123);
		
		cd.display();
		sd.display();
		id.display();
	}
}