import java.util.Scanner;

public class MiCodigo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double acumuladoSueldos = 0;
        int contadorRango = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el sueldo " + (i + 1) + ":");
            double sueldo = leer.nextDouble();

            if (sueldo < 0) {
                System.out.println("Hay un sueldo negativo encontrado: " + sueldo);
                continue;
            }

            acumuladoSueldos += sueldo;

            if (sueldo >= 100 && sueldo <= 300) {
                contadorRango++;
            }
        }

        System.out.println("El acumulado de sueldos es de: " + (float) acumuladoSueldos);
        System.out.println("La cantidad de sueldos entre $100 y $300 es de: " + contadorRango);

        leer.close();
    }
}