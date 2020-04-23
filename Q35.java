
public class Q35 {

	public static void main(String[] fruits) {
		String fruit1= new String("apple");
		String fruit2= new String("orange");
		String fruit3= new String("pear");
		fruit3=fruit1;  // Bu üç satirda tüm nesnelere
		fruit2=fruit3;	//apple deðeri atanmýþtýr.
		fruit1=fruit2;	// Bu yüzden orange ve pear deðerleri GC için uygundur.
	}

}
