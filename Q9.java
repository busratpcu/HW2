
public class Q9 {
	Integer a=Integer.valueOf("1");

	public static void main(String[] nums) {
		Integer a=Integer.valueOf("2"); // integer adýnda bir class yoktur.Bu yüzden
		Integer b=Integer.valueOf("3");	//	kod derlenmez. integer ifadeleri Integer olarak deðiþtirilirse
		System.out.println(a+b);		// kod derlenir ve çýktý 5 olur.
	}

}
