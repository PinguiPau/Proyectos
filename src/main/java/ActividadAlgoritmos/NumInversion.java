package ActividadAlgoritmos;

import java.util.Scanner;

public class NumInversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero que desee invertir");

        int num = sc.nextInt();
        int numInv = 0;

        while(num > 0){

            int ope = num%10;
            numInv = (numInv*10)+ope;
            num /= 10;


        }

        System.out.println("Numero invertido: " + numInv);

    }

}
