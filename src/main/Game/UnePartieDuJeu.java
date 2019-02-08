package main.Game;

import main.personnage.Guerrier;
import main.personnage.Mage;
import main.personnage.Personnage;
import main.personnage.Rodeur;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class UnePartieDuJeu {

    @Nullable
    public static Personnage creationJoueur(int numero) {
        Scanner scanner = new Scanner(System.in);
        int role, niv, force, agilite, intel;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guérrier, 2: Rôdeur, 3: Mage)");
            role = scanner.nextInt();
        } while (role<1 || role>3);
        do {
            System.out.println("Niveau du personnage ?");
            niv = scanner.nextInt();
        } while (niv < 1 || niv > 100);
        do {
            do {
                System.out.println("Force du personnage ?");
                force = scanner.nextInt();
            } while (force < 0 || force > 100);
            do {
                System.out.println("Agilité du personnage ?");
                agilite = scanner.nextInt();
            } while (agilite < 0 || agilite > 100);
            do {
                System.out.println("Intelligence du personnage ?");
                intel = scanner.nextInt();
            } while (intel < 0 || intel > 100);
        } while (niv != force + agilite + intel);

        switch (role) {
            case 2:
                return new Rodeur(niv, force, agilite, intel, numero);
            case 3:
                return new Mage(niv, force, agilite, intel, numero);
            default:
                return new Guerrier(niv, force, agilite, intel, numero);
        }
    }

    public void start() {
        Personnage joueur1;
        Personnage joueur2;
        Jeu jeu;
        Scanner scanner = new Scanner(System.in);
        int role, niv, force, agilite, intel;

        /**
         * Création du joueur 1
         */
        System.out.println("Création du Joueur 1");
        joueur1 = creationJoueur(1);
        joueur1.look();

        /**
         * Création du joueur 2
         */
        System.out.println("Création du Joueur 2");
        joueur2 = creationJoueur(2);
        joueur2.look();

        jeu = new Jeu(joueur1, joueur2);
        jeu.start();
        jeu.play();
        jeu.stop();
    }
}
