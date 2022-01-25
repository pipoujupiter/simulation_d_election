import java.util.Random;

/**
 * Classe abstraite représentant une personne test
 * 
 * @author Morin Alice
 */

public abstract class Personne {

    /* Nom de la personne */
    protected String nom;
    /* Prénom de la personne */
    protected String prenom;
    /* Axe societal de la personne */
    protected float axe[] = new float[2];

    /**
     * Méthode qui initialise au hasard les axes des personnes
     * 
     * @return
     */
    public void initAxes() {
        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            float nb;
            nb = random.nextInt(11);
            nb = nb / 10;
            axe[i] = nb;
        }
    }

    /**
     * Méthode qui définit ce qui sera affiché lorsque l'on affichera la personne
     * 
     * @return la description de la personne
     */
    public String toString() {
        return "Nom : " + this.nom + " Prénom : " + this.prenom + " Axe : [" + this.axe[0] + "," + this.axe[1] + "]";
    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     */

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        initAxes();
    }

}
