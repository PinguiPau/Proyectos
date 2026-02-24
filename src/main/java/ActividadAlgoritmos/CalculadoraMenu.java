package ActividadAlgoritmos;

import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero;

        do {

            System.out.println("BIENVENID@ A LA CALCULADORA DE FIGURAS");
            System.out.println("Seleccione la operación que desee realizar:\n");
            System.out.println("1. Area del triangulo\n2. Perimetro del triangulo\n3. Area del cuadrado\n4. Perimetro del cuadrado\n5. Salir de la calculadora\n");
            Numero = sc.nextInt();

            switch (Numero){
                case 1:
                    System.out.println("\nAREA DEL TRIANGULO:");
                    System.out.println("\nIngrese la medida de la base del triangulo:");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese la medida de la altura del triangulo:");
                    double altura = sc.nextDouble();
                    System.out.println("\nEl area del triangulo es: " + AreaTriangulo(base, altura) + "\n");
                    break;
                case 2:
                    System.out.println("\nPERIMETRO DEL TRIANGULO:");
                    System.out.println("\nIngrese la medida del primer lado del triangulo:");
                    double lado1 = sc.nextDouble();
                    System.out.println("Ingrese la medida del segundo lado del triangulo:");
                    double lado2 = sc.nextDouble();
                    System.out.println("Ingrese la medida del tercer lado del triangulo:");
                    double lado3 = sc.nextDouble();
                    System.out.println("\nEl perimetro del triangulo es: " + PerimetroTriangulo(lado1,lado2,lado3) + "\n");
                    break;
                case 3:
                    System.out.println("\nAREA DEL CUADRADO:");
                    System.out.println("\nIngrese uno de los lados del cuadrado:");
                    double lado = sc.nextDouble();
                    System.out.println("\nEl area del cuadrado es: " + AreaCuadrado(lado) + "\n");
                    break;
                case 4:
                    System.out.println("\nPERIMETRO DEL CUADRADO:");
                    System.out.println("\nIngrese uno de los lados del cuadrado:");
                    double Lado = sc.nextDouble();
                    System.out.println("\nEl perimetro del cuadrado es: " + PerimetroCuadrado(Lado) + "\n");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.....Vuelva pronto!");
                    break;
                default:
                    System.out.println("-------------------- INGRESE UN NUMERO VALIDO --------------------\n");
            }

        }while ((Numero != 5));
        sc.close();

    }

    public static double AreaTriangulo(double b, double h){
        return (b * h)/2;
    }

    public static double PerimetroTriangulo(double uno, double dos, double tres){
        return uno + dos + tres;
    }

    public static double AreaCuadrado(double ladouno){
        return ladouno * ladouno;
    }

    public static double PerimetroCuadrado(double lado){
        return lado*4;
    }
}
