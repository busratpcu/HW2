
public class Q9 {
	Integer a=Integer.valueOf("1");

	public static void main(String[] nums) {
		Integer a=Integer.valueOf("2"); // integer ad�nda bir class yoktur.Bu y�zden
		Integer b=Integer.valueOf("3");	//	kod derlenmez. integer ifadeleri Integer olarak de�i�tirilirse
		System.out.println(a+b);		// kod derlenir ve ��kt� 5 olur.
	}

}
