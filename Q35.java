
public class Q35 {

	public static void main(String[] fruits) {
		String fruit1= new String("apple");
		String fruit2= new String("orange");
		String fruit3= new String("pear");
		fruit3=fruit1;  // Bu �� satirda t�m nesnelere
		fruit2=fruit3;	//apple de�eri atanm��t�r.
		fruit1=fruit2;	// Bu y�zden orange ve pear de�erleri GC i�in uygundur.
	}

}
