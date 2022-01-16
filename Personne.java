
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
    /* Axe sociétal du "pouvoir d'achat" */
    protected int axe[] = new int[2];

    /**
     * Méthode qui définit ce qui sera affiché lorsque l'on affichera la personne
     * 
     * @return la description de la personne
     */
    public String toString() {
        return "Nom : " + this.nom + " Prénom : " + this.prenom;
    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     * @param axe    sociétal de la personne
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

}
