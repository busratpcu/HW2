
public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer= new Integer(4);
		System.out.print(integer.byteValue());
		
		System.out.print("-");
		int i= new Integer(4);
		System.out.print(i.byteValue()); //Bu satýr sebebiyle derlenmez.
										 // local bir deðiþken üzerinden method çaðrýlmaz.
	}

}
