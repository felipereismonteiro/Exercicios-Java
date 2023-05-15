package multiplicaae;

import java.util.Scanner;

public class MultiplicaAe {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado: ");
        int numero = cc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
