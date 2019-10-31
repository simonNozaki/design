public class IntegerDisplay extends AbstractDisplay {
	
	private int value;
	
	public IntegerDisplay(int value) {
		this.value = value;
	}
	
	public void open() {
		System.out.println("/_/_/_/_/_ Integer Printintg Start /_/_/_/_/_");
	}
	
	public void print() {
		System.out.println(value);
	}
	
	public void close() {
		System.out.println("/_/_/_/_/_ Integer Printintg End /_/_/_/_/_");
	}
}