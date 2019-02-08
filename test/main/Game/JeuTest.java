package main.Game;

import main.personnage.Guerrier;
import main.personnage.Mage;
import main.personnage.Personnage;

import static org.junit.jupiter.api.Assertions.*;

class JeuTest {
    public static void main(String[] args) {
        Personnage joueur1 = new Guerrier(10, 10, 0, 0, 1);
        Personnage joueur2 = new Mage(10, 0, 0, 10, 2);

        Jeu jeu = new Jeu(joueur1, joueur2);
        jeu.start();
        jeu.play();
        jeu.stop();

    }
}