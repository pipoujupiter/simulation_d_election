/**
 * Classe représentant un électeur
 * 
 * @author Morin Alice
 */

public class Electeur extends Personne {

    /*
     * attribut de classe qui permet de garantir l'unicité du numéro à travers les
     * personnes
     */
    private static int NUMERO = 1;
    /* attribut rajouté pour avoir un numéro de la personne */
    private int numeroelecteur;

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     * @param axe    sociétal de la personne
     */
    public Electeur(String nom, String prenom) {
        super(nom, prenom);

        this.numeroelecteur = Electeur.NUMERO;
        Electeur.NUMERO++;
    }

}
