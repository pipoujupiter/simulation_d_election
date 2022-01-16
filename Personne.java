import java.util.Vector;

/**
 * Classe représentant une personne
 * 
 * @author Morin Alice
 */

public class Personne {
    /*
     * attribut de classe qui permet de garantir l'unicité du numéro à travers les
     * personnes
     */
    private static int NUMERO = 1;
    /* attribut rajouté pour avoir un numéro de la personne */
    private int numero;
    /* Nom de la personne */
    private String nom;
    /* Prénom de la personne */
    private String prenom;
    /* Axe sociétal du "pouvoir d'achat" */
    private int axe[] = new int[2];

    /**
     * Méthode qui définit ce qui sera affiché lorsque l'on affichera la personne
     * 
     * @return la description de la personne
     */
    public String toString() {
        return "Nom : " + this.nom + " Prénom : " + this.prenom + " Numéro de la personne : " + this.numero;
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

        /* on récupère le numéro de classe et on l'incrémente */
        this.numero = Personne.NUMERO;
        Personne.NUMERO++;

    }

}
