import java.util.Random;

/**
 * Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, ró¿ne wartoœci, a nastêpnie za pomoc¹ operatorów logicznych i matematycznych wyœwietl wynik nastêpuj¹cych zdañ logicznych:

Czy x jest wiêksze od y?
Czy x pomno¿one przez 2 jest wiêksze od y?
Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?
Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacjê modulo)
Wynik ka¿dego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

PodpowiedŸ, do utworzenia losowej liczby wykorzystaj metodê Random.nextInt(), aby by³o to mo¿liwe, musisz j¹ zaimportowaæ przed zdefiniowaniem klasy (wiêcej o tym w kolejnych lekcjach) przyk³ad:

import java.util.Random;
 
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10); // losowa liczba z przedzia³u [0, 9], 10 siê nie wlicza
        int number2 = new Random().nextInt(10); // krótsza wersja
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
		
		System.out.println("Czy x jest wiêksze od y?");
		result = x > y;
		
		System.out.println(result);
		
		System.out.println("Czy x pomno¿one przez 2 jest wiêksze od y?");
		result = (x*2)>y;
		System.out.println(result);
		
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?");
		result = y < (x+3) && x > (x-2);
		System.out.println(result);
		
		System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacjê modulo)");
		result = ((x * y) % 2 == 0);
		System.out.println(result);
		

	}

}
