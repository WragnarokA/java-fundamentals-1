package fundamentals.uno.java;

import java.util.Scanner;

public class FestaFerragnez {

    public static void main(String[] args) {

        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio, Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto alla festa dei Ferragnez! Per accedere, inserisce il nome e cognome:");
        String nomeUtente = scan.nextLine();

        boolean presenteNellaLista = false;

        for (String invitato : listaInvitati) {
            if (invitato.equals(nomeUtente)) {
                presenteNellaLista = true;
                break;
            }
        }
        if (presenteNellaLista) {
            System.out.println("Benvenuto, puoi accedere alla festa! 🍻🍻🍻");
        } else {
            System.out.println("Mi dispiace, il tuo nome non è nella lista degli invitati. Non puoi accedere alla festa. ⛔⛔⛔⛔🤷‍♂️🤷‍♂️🤷‍♂️");
        }

        scan.close();
    }

}
