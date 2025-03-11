package calculadora;


/**
 * Programa calculadora suma,resta, mult.
 * @author Jose
 * @version version 1.0
 * @since 14/02/25
 */

public class Calculadora {


/**
 * Programa calculadora suma
 * @param a numero entero
 * @param b numero entero
 * @return suma entre a y b
 */
	
public int sumar(int a, int b) {

return a + b;

}

/**
 * 
 * @param a numero entero
 * @param b numero entero
 * @return resta entre a y b
 */

public int restar(int a, int b) {

return a - b;

}

/**
 * 
 * @param a numero entero
 * @param b numero entero
 * @return multiplicación entre a y b
 */

public int multiplicar(int a, int b) {

return a * b;

}

public int dividir(int a, int b) {

return a / b;

}

/**
 * 
 * @param args
 * 
 */

public static void main(String[] args) {

Calculadora calc = new Calculadora();

System.out.println("Resultado de la suma: " + calc.sumar(7, 8));

}

}
