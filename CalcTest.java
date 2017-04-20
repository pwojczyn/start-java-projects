/**
 * Napisz program-kalkulator operuj¹cy na liczbach zmiennoprzecinkowych typu
 * double , który bêdzie sk³ada³ siê z dwóch klas w osobnych plikach:
 * 
 * Calculator.java - powinna zawieraæ metody add(), subtract(), multiply(),
 * divide(), czyli kolejno dodawanie, odejmowanie, mno¿enie i dzielenie.
 * Zastanów siê jakie argumenty powinny przyjmowaæ oraz jaki typ powinny zwracaæ
 * Calculate.java - klasa uruchomieniowa programu z metod¹ main. Zadeklaruj i
 * zainicjuj w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy
 * Calculator i za jego pomoc¹ oblicz wynik ró¿nych dzia³añ matematycznych.
 * Wszystkie wyniki dzia³añ wyœwietl na ekranie.
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
