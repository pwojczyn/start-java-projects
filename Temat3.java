/**
 * Napisz program, który wyœwietli Twoje dane wraz z powitaniem w formie:
 * 
 * -Czeœæ Jan, s³ysza³em, ¿e masz 25 lat i uczysz siê programowania, czy to
 * prawda?
 * 
 * -true
 * 
 * -Czy Twoje inicja³y to J K?
 * 
 * -Tak, true
 * 
 * W zadaniu wykorzystaj nie tylko napisy w podwójnych cudzys³owach, ale równie¿
 * podane typy danych - liczby (int), znaki(char) oraz typ logiczny(boolean).
 * 
 * @author Piotr
 *
 */
public class Temat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Piotr";
		int age = 25;
		boolean trueFalse = true;

		System.out.println("Czeœæ " + firstName + ", s³ysza³em, ¿e masz " + age
				+ " lat i uczysz siê programowania, czy to prawda?");

		System.out.println(trueFalse);

		char char1 = 'J';
		char char2 = 'K';

		System.out.println("Czy Twoje inicja³y to " + char1 + " " + char2 + "?");

		System.out.println("Tak," + trueFalse);
	}

}
