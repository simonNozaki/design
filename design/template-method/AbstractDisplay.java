/**
 * 表示の抽象クラス
 */
public abstract class AbstractDisplay {
	
	/**
	 * 出力開始
	 */
	public abstract void open();
	
	/**
	 * 引数の出力
	 */
	public abstract void print();
	
	/**
	 * 出力終了
	 */
	public abstract void close();
	
	/**
	 * 実出力処理
	 */
	public final void display() {
		open();
		for(int i=0; i < 5; i++) {
			print();
		}
		close();
	}
}