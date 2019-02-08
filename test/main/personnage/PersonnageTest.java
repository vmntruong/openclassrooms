package main.personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    public static void main(String[] args) {
        Personnage joueur1 = new Guerrier(10, 10, 0, 0,1);
        Personnage joueur2 = new Mage(10, 0, 0, 10,2);

        joueur1.look();
        joueur2.look();

        joueur1.attaquer_basique(joueur2);

        joueur1.look();
        joueur2.look();

        joueur2.attaquer_basique(joueur1);

        joueur1.look();
        joueur2.look();

        joueur1.attaquer_speciale(joueur2);

        joueur1.look();
        joueur2.look();

        joueur2.attaquer_speciale(joueur1);

        joueur1.look();
        joueur2.look();
    }
}