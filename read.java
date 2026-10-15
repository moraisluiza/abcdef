

import java.util.Scanner;

public class read {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
        int senha;

    do {
        System.out.print("Digite a sua senha:");
        senha = sc.nextInt();

        if (senha == 1234) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Senha incorreta!");
        }
    } while (senha != 1234);
    sc.close();
    }
}
