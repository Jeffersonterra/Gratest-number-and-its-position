
import java.util.Scanner;

public class numerol {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Input up to 100 numbers in the system and the system will tell the which is greatest and it's position in the order given: ");
        int maior = 0;
        int posMaior = 1;
        int x;
        for (int i = 1; i <= 100; i++) {
            x = leitor.nextInt();
            if (i == 1) {
                maior = x;
                posMaior = 1;
            } else if (x > maior) {
                maior = x;
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);
        leitor.close();
    }

}
