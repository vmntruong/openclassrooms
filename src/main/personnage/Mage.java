package main.personnage;

public class Mage extends Personnage {
    public Mage(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }

    @Override
    public void attaquer_basique(Personnage adversaire) {
        int dommages = this.getIntelligence();
        adversaire.setVie(adversaire.getVie() - dommages);
        System.out.println("Joueur " + this.getNumero() + " utilise Boule de Feu et inflinge " + dommages + " dommages");
        System.out.println("Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie");
    }

    @Override
    public void attaquer_speciale(Personnage adversaire) {
        // Soigne sa vie
        int gagne = this.getIntelligence()*2;
        this.setVie(this.getVie() + gagne);
        System.out.println("Joueur " + this.getNumero() + " utilise Soin");
        System.out.println("Joueur " + this.getNumero() + " gagne " + gagne + " points de vie");
        //System.out.println("Joueur " + this.getNumero() + " possède " + this.getVie() + " points de vie");
        this.look();
    }

    @Override
    public void look() {
        System.out.println("Abracadabra, je suis le Mage, niveau : " + niveau + ", je possède " + vie + " de vitalité, " +
                force + " de force " +
                agilite + " d'agilité " +
                intelligence + " d'intelligence !");
    }

    @Override
    public void setVie(int vie) {
        if (vie>5*this.getNiveau()) {
            this.vie = 5*this.getNiveau();
        }
        else
            this.vie = vie;
    }
}
