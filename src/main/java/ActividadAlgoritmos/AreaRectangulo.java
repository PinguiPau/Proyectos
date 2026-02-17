package ActividadAlgoritmos;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Ancho, Alto, Area;

        System.out.println("Ingrese el ancho del rectagulo");

        Ancho = sc.nextDouble();

        System.out.println("Ingrese la altura del rectangulo");

        Alto = sc.nextDouble();

        Area = Ancho*Alto;

        System.out.println("\nMEDIDAS DEL RECTANGULO:\nAncho: " + Ancho + "cm" + "\nAlto: " + Alto + "cm" + "\nAREA DEL RECTANGULO: " + Area + "cm");
    }
}
