package ActividadAlgoritmos;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num;
        int Cont = 0;

        System.out.println("Ingrese un numero positivo");

        Num = sc.nextInt();

        for(int i = 1; i <= Num; i++){

            int contResiduo = Num%i;

            if(contResiduo == 0){
                Cont += 1;
            }

        }

        if(Cont > 2){
            System.out.println("No es numero primo");
        }else {
            System.out.println("Es numero primo");
        }
    }
}
