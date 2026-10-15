
import java.util.Scanner;

public class Confirmacaoexclusao {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
        int senha;

    do {
        System.out.print("Deseja excluir? (1 - Sim / 2 - Não):");
        senha = sc.nextInt();

        if (senha == 1) {
            System.out.println("Senha excluída!");
        } else {
            System.out.println("Senha não excluída!");
        }
    } while (senha != 1 && senha != 2);
    sc.close();
    }
}