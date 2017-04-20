import java.util.Random;

/**
 * Napisz program, w kt�rym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, r�ne warto�ci, a nast�pnie za pomoc� operator�w logicznych i matematycznych wy�wietl wynik nast�puj�cych zda� logicznych:

Czy x jest wi�ksze od y?
Czy x pomno�one przez 2 jest wi�ksze od y?
Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?
Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo)
Wynik ka�dego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

Podpowied�, do utworzenia losowej liczby wykorzystaj metod� Random.nextInt(), aby by�o to mo�liwe, musisz j� zaimportowa� przed zdefiniowaniem klasy (wi�cej o tym w kolejnych lekcjach) przyk�ad:

import java.util.Random;
 
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10); // losowa liczba z przedzia�u [0, 9], 10 si� nie wlicza
        int number2 = new Random().nextInt(10); // kr�tsza wersja
        System.out.println(number);
        System.out.println(number2);
    }
}
 * @author Piotr
 *
 */
public class Temat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = new Random().nextInt(10);
		int y = new Random().nextInt(10);
		boolean result = true;
		
		System.out.println("X: "+x+" Y: "+y);
		
		System.out.println("Czy x jest wi�ksze od y?");
		result = x > y;
		
		System.out.println(result);
		
		System.out.println("Czy x pomno�one przez 2 jest wi�ksze od y?");
		result = (x*2)>y;
		System.out.println(result);
		
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?");
		result = y < (x+3) && x > (x-2);
		System.out.println(result);
		
		System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo)");
		result = ((x * y) % 2 == 0);
		System.out.println(result);
		

	}

}
