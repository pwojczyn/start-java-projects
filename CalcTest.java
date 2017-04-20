/**
 * Napisz program-kalkulator operuj�cy na liczbach zmiennoprzecinkowych typu
 * double , kt�ry b�dzie sk�ada� si� z dw�ch klas w osobnych plikach:
 * 
 * Calculator.java - powinna zawiera� metody add(), subtract(), multiply(),
 * divide(), czyli kolejno dodawanie, odejmowanie, mno�enie i dzielenie.
 * Zastan�w si� jakie argumenty powinny przyjmowa� oraz jaki typ powinny zwraca�
 * Calculate.java - klasa uruchomieniowa programu z metod� main. Zadeklaruj i
 * zainicjuj w niej co najmniej 2 zmienne typu double, utw�rz obiekt klasy
 * Calculator i za jego pomoc� oblicz wynik r�nych dzia�a� matematycznych.
 * Wszystkie wyniki dzia�a� wy�wietl na ekranie.
 * 
 * @author Piotr
 *
 */
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		double x = 10.0;
		double y = 5.0;
		double z = 2.0;
				
		Calculator result = new Calculator();
		System.out.println(result.add(x,y));
		System.out.println(result.add(x,y,z));
		System.out.println(result.subtract(x,y));
		System.out.println(result.subtract(x,y,z));

	}

}
