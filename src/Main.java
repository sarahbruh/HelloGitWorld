import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean t = true;

        while(t){

            try{
                System.out.printf("Bitte geben Sie einen Wert ein: %n");
                double a = sc.nextDouble();

                System.out.printf("Bitte geben Sie einen Wert ein: %n");
                double b = sc.nextDouble();

                double summe = a + b;

                System.out.println("Die Summe beträgt " +summe);
                System.out.println("----------------------------------------------");
            }
            catch (InputMismatchException ex){

                System.out.println("Fehler!");
            }
        }
    }
}