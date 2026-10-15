
import java.util.Scanner;

public class idade {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);

    int age;
    do {
        System.out.print("Digite a sua idade:");
        age = sc.nextInt();

        if (age < 40) {
            System.out.println("Você é jovem!");
        }
    } while (age < 40);

    System.out.println("Você é velho!");
    sc.close();
    
    }
}

