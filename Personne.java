
/**
 * Classe abstraite représentant une personne
 * 
 * @author Morin Alice
 */

public abstract class Personne {

    /* Nom de la personne */
    protected String nom;
    /* Prénom de la personne */
    protected String prenom;
    /* Paramètre de l'axe sociétal du "pouvoir d'achat" */
    protected double p1;
    protected double p2;

    /**
     * Méthode qui définit ce qui sera affiché lorsque l'on affichera la personne
     * 
     * @return la description de la personne
     */
    public String toString() {
        return "Nom : " + this.nom + " Prénom : " + this.prenom + " Axe : [" + this.p1 + "," + this.p2
                + "]";
    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     * @param p1     paramètre 1 de l'axe sociétal de la personne
     * @param p2     paramètre 2 de l'axe sociétal de la personne
     */
    public Personne(String nom, String prenom, double p1, double p2) {
        this.nom = nom;
        this.prenom = prenom;
        this.p1 = p1;
        this.p2 = p2;
    }

}
