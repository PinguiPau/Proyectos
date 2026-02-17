package ActividadAlgoritmos;

import java.util.Scanner;

public class NumPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num;
        int ContPos = 0;
        int ContNeg = 0;

        do{
            System.out.println("Ingrese un numero positivo o negativo:");
            Num = sc.nextInt();

            if(Num > 0){
                ContPos += 1;
            }else if (Num < 0) {
                ContNeg += 1;
            }


        }while(Num != 0);

        System.out.println("\nLos numeros positivos ingresados fueron: " + ContPos + "\n\nLos numeros negativos ingresados fueron: " + ContNeg + "\n");

    }

}
