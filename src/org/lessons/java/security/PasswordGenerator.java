package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto a Password Generator");
        System.out.println("Inserisce il tuo nome:");
        String nome = scanner.nextLine();

        System.out.println("Inserisce il tuo cognome:");
        String cognome = scanner.nextLine();

        System.out.println("Inserisce il tuo colore preferito:");
        String colorePreferito = scanner.nextLine();

        System.out.println("Inserisce il giorno della tua data di nascita:");
        int giornoDiNascita = scanner.nextInt();

        System.out.println("Inserisce il mese della tua data di nascita:");
        int meseDiNascita = scanner.nextInt();

        System.out.println("Inserisce il anno della tua data di nascita:");
        int annoDiNascita = scanner.nextInt();

        System.out.println("Ecco la tua passwoed: " + nome + "-" + cognome + "-" + colorePreferito + "-" + annoDiNascita);

    }

}
