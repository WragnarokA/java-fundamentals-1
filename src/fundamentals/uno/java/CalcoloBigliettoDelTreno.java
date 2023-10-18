package fundamentals.uno.java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CalcoloBigliettoDelTreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        double km = scanner.nextDouble();

        System.out.print("Inserisci l'età del passeggero: ");
        int eta = scanner.nextInt();

        double prezzoBase = km * 0.21;

        if (eta < 18) {
            prezzoBase *= 0.8;
        } else if (eta >= 65) {
            prezzoBase *= 0.6;
        }
        String numeroArrotondato = df.format(prezzoBase);
        System.out.println("Il prezzo del biglietto è: " + numeroArrotondato + " €");

        scanner.close();
    }



}
