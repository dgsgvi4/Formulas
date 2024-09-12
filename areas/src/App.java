import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa el valor de la base:");
        double base = scanner .nextDouble ();

        System.out.println("Ingresa el valor de la base menor:");
        double baseMenor = scanner .nextDouble ();

        System.out.println("Ingresa el valor de la altura:");
        double altura = scanner .nextDouble ();

        System.out.println("Ingresa el valor de la radio:");
        double radio = scanner .nextDouble ();

        double areaTrian =  (base * altura) / 2;
        double areaRect = (base * altura);
        double areaCirc = (3.14 * radio) * radio;
        double areaRomb = (base * altura);
        double areaTrap = (base + baseMenor) * altura / 2;

        System.out.println("El area del triangulo es: " + areaTrian);
        System.out.println("El area del rectangulo es: " + areaRect);
        System.out.println("El area del circulo es: " + areaCirc);
        System.out.println("El area del rombo es: " + areaRomb);
        System.out.println("El area del trapecio es: " + areaTrap);

        scanner.close();
    }
}