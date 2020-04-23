
public class Q50 {
	public Q50() {
		System.out.print("a");
	}
	public void Q50() {
		System.out.print("b");
	}
	public void run() {
		new Q50();
		Q50();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q50().run();
	}

}
