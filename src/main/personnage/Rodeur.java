package main.personnage;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }


    @Override
    public void attaquer_basique(Personnage adversaire) {
        int dommages = this.getAgilite();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println("Joueur " + this.getNumero() + " utilise Tir à l'Arc et inflinge " + dommages + " dommages");
        System.out.println("Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie");
    }

    @Override
    public void attaquer_speciale(Personnage adversaire) {
        int gagne = this.getNiveau()/2;
        this.setAgilite(this.getAgilite()+ gagne);
        System.out.println("Joueur " + this.getNumero() + " utilise Concentration");
        System.out.println("Joueur " + this.getNumero() + " gagne " + gagne + " points en agilité");
    }

    @Override
    public void look() {
        System.out.println("Fsshhh, je suis le Rôdeur, niveau : " + niveau + ", je possède " + vie + " de vitalité, " +
                force + " de force " +
                agilite + " d'agilité " +
                intelligence + " d'intelligence !");
    }

}
