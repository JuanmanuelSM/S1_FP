import java.util.Random;
import java.util.Scanner;

public class app {
    private static final int NUM_MIN = 5;
    private static final int NUM_MAX = 10;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari;
        boolean valorCorrecte = false;
        int intents = 0;

        do {
            System.out.print("Introdueix un valor enter entre " + NUM_MIN + " i " + NUM_MAX + ": ");
            valorUsuari = lector.nextInt();
            lector.nextLine();

            if (valorUsuari >= NUM_MIN && valorUsuari <= NUM_MAX) {
                valorCorrecte = true;
            } else {
                intents++;
                System.out.println("Valor incorrecte. Intenta-ho de nou (" + intents + "/3)");
            }
        } while (!valorCorrecte && intents < 3);

        if (valorCorrecte) {
            System.out.println("Dada correcta. Has escrit " + valorUsuari);
        } else {
            System.out.println("Has superat el nombre màxim d'intents. Dades incorrectes.");
        }
    }
}












