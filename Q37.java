
public class Q37 {
	public String first="instance";
	public Q37() {
		first="constructor";
	}
	{first="block"; } 				//sadece bu blok i�erisinde first de�eri block'tur.
	public void print() {
		System.out.println(first);	//constructor
	}

	public static void main(String[] args) {
		new Q37().print();				
	}

}
