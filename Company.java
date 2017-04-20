/**
 * Napisz program, w kt�rym utworzysz dwie klasy:
 * 
 * Employee - klasa, kt�ra b�dzie przedstawia�a pracownika dowolnej firmy.
 * Podstawowe informacje o pracowniku jakie s� potrzebne pracodawcy to imi�,
 * nazwisko, rok urodzenia, sta� pracy
 * 
 * Company - klasa, w kt�rej utworzysz 3 obiekty reprezentuj�ce pracownik�w, a
 * nast�pnie wy�wietlisz informacj� o nich na ekranie
 * 
 * @author Piotr
 *
 */
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.firstName = "Jan";
		emp1.lastName = "Kowalski";
		emp1.birday = 1980;
		emp1.stazPracy = 10;
		
		emp2.firstName = "Pawe�";
		emp2.lastName = "Kowalski";
		emp2.birday = 1984;
		emp2.stazPracy = 20;
		
		emp3.firstName = "Piotr";
		emp3.lastName = "Kowalski";
		emp3.birday = 1990;
		emp3.stazPracy = 3;
		
		System.out.println("Pracownik: "+emp1.firstName+" "+emp1.lastName+" "+emp1.birday+" "+emp1.stazPracy);
		System.out.println("Pracownik: "+emp2.firstName+" "+emp2.lastName+" "+emp2.birday+" "+emp2.stazPracy);
		System.out.println("Pracownik: "+emp3.firstName+" "+emp3.lastName+" "+emp3.birday+" "+emp3.stazPracy);

	}

}
