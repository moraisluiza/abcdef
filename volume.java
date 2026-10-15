
import java.util.Scanner;

public class volume { 

    public static void main ( String [] args ) {
                try (Scanner sc = new Scanner(System.in)) {
                        int contador = 10;

                        while (contador > 0) {
                                System.out.println(contador);
                                contador = sc.nextInt();
                        }
        }
    }
}