package main.personnage;

public class Guerrier extends Personnage {
    public Guerrier(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }

    @Override
    public void attaquer_basique(Personnage adversaire) {
        int dommages = this.getForce();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println("Joueur " + this.getNumero() + " utilise Coup d'Épée et inflinge " + dommages);
        System.out.println("Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie");
    }

    @Override
    public void attaquer_speciale(Personnage adversaire) {
        int dommages = 2*this.getForce();
        int perte = this.getForce()/2;
        adversaire.setVie(adversaire.getVie()-dommages);
        this.setVie(this.getVie()-perte);
        System.out.println("Joueur " + this.getNumero() + " utilise Coup de Rage et inflinge " + dommages);
        System.out.println("Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie");
        System.out.println("Joueur " + this.getNumero() + " perd " + perte + " points de vie");
    }

    @Override
    public void look() {
        System.out.println("Woarg, je suis le Guérrier, niveau : " + niveau + ", je possède " + vie + " de vitalité, " +
                force + " de force " +
                agilite + " d'agilité " +
                intelligence + " d'intelligence !");
    }
}
