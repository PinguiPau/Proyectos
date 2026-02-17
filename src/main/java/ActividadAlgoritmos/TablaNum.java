package ActividadAlgoritmos;

import java.util.Scanner;

public class TablaNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero del cual desee conocer su tabla de multiplicar:");
        int num = sc.nextInt();

        System.out.println("Tabla del " + num);
        for(int i = 0; i <= 10 ; i++){

            int tabla = num*i;
            System.out.println(num + " x " + i + " = " + tabla);


        }
    }
}
