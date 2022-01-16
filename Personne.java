
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
    protected double paramAxe1;
    protected double paramAxe2;

    /**
     * Méthode qui définit ce qui sera affiché lorsque l'on affichera la personne
     * 
     * @return la description de la personne
     */
    public String toString() {
        return "Nom : " + this.nom + " Prénom : " + this.prenom + " Axe : [" + this.paramAxe1 + "," + this.paramAxe2
                + "]";
    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     * @param d      paramètre 1 de l'axe sociétal de la personne
     * @param e      paramètre 2 de l'axe sociétal de la personne
     */
    public Personne(String nom, String prenom, double d, double e) {
        this.nom = nom;
        this.prenom = prenom;
        this.paramAxe1 = d;
        this.paramAxe2 = e;
    }

}
