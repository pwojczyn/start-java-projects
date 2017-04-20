/**
 * Napisz program-kalkulator, kt�ry b�dzie sk�ada� si� z dw�ch klas:
 * 
 * Calculator CalcTest W klasie Calculator zdefiniuj metody add i subtract w
 * kilku przeci��onych wersjach, aby mog�y dodawa� lub odejmowa� 2 lub 3 liczby
 * (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
 * 
 * W klasie CalcTest przetestuj dzia�anie klasy Calculator.
 * 
 * @author Piotr
 *
 */
public class Calculator {
	// metody
	public double add(double a, double b) {
		return a + b;
	}
	public double add(double a, double b, double c){
		return add(a, b)+c;
	}

	public double subtract(double a, double b) {
		return a - b;
	}
	public double subtract(double a, double b, double c){
		return subtract(a, b)-c;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}
}
