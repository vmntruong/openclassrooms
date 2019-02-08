package main.Game;

import main.personnage.Personnage;

import java.util.Scanner;

public class Jeu {
    private Personnage joueur1;
    private Personnage joueur2;

    public Jeu(Personnage joueur1, Personnage joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public void start() {
        System.out.println("Start the game");
    }

    public void play() {
        int j;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Joueur 1 (" + joueur1.getVie() + " Vitalité) veuillez choisir votre action (1: Attaque basique, 2: Attaque spéciale)");
                j = scanner.nextInt();
            } while (j!=1 && j!=2);
            if (j==1) joueur1.attaquer_basique(joueur2);
            if (j==2) joueur1.attaquer_speciale(joueur2);

            if (joueur1.estMort()) {
                System.out.println("Joueur 1 est mort");
                break;
            }
            if (joueur2.estMort()) {
                System.out.println("Joueur 2 est mort");
                break;
            }

            scanner = new Scanner(System.in);
            do {
                System.out.println("Joueur 2 (" + joueur2.getVie() + " Vitalité) veuillez choisir votre action (1: Attaque basique, 2: Attaque spéciale)");
                j = scanner.nextInt();
            } while (j!=1 && j!=2);
            if (j==1) joueur2.attaquer_basique(joueur1);
            if (j==2) joueur2.attaquer_speciale(joueur1);

            if (joueur1.estMort()) {
                System.out.println("Joueur 1 est mort");
                break;
            }
            if (joueur2.estMort()) {
                System.out.println("Joueur 2 est mort");
                break;
            }
        }
    }

    public void stop() {
        /**
         * Display the winner or the loser
         */
        if (joueur1.estMort())
            System.out.println("Joueur 1 a perdu !");
        else
            System.out.println("Joueur 2 a perdu !");
    }

}
