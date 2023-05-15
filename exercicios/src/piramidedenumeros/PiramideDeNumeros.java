package piramidedenumeros;

import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        String nome = new String("oi");
        Scanner cc = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int limite = cc.nextInt();
        for (int i = 1; i <= limite; i++) {
            String numeros = "";
            for(int j = 0; j < i; j++) {
                numeros += i;
            } 
            System.out.println(numeros);
            numeros = "";
        }
    }
}
