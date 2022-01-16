/**
 * Classe représentant un candidat
 * 
 * @author Morin Alice
 */

public class Candidat extends Personne {
    /*
     * attribut de classe qui permet de garantir l'unicité du numéro à travers les
     * personnes
     */
    private static int NUMERO = 1;
    /* attribut rajouté pour avoir un numéro de la personne */
    int numerocandidat;

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     * @param p1     paramètre 1 de l'axe sociétal de la personne
     * @param p2     paramètre 2 de l'axe sociétal de la personne
     */

    public Candidat(String nom, String prenom, double p1, double p2) {
        super(nom, prenom, p1, p2);

        this.numerocandidat = Candidat.NUMERO;
        Candidat.NUMERO++;
    }

}
