/**
 * Classe représentant un candidat
 * 
 * @author Morin Alice
 */

public class Candidat extends Electeur {

    /* Nom de la personne */
    private String nom;
    /* Prénom de la personne */
    private String prenom;
    /* Nombre de voix pour le candidat */
    private int nombreVoix;

    /**
     * Méthode d'affichage des données du candidat
     * 
     * @return données du candidat
     */
    public void affCandidat() {
        System.out.println(" Numéro électeur : " + numeroelecteur);
        System.out.println("Nom : " + nom + " Prénom : " + prenom);
        System.out.print("Axe : [");
        for (int i = 0; i < 2; i++) {
            System.out.print(axe[i] + " ");
        }
        System.out.print("]");
    }

    /**
     * Méthode pour set le nombre de voix pour le candidat
     * 
     * @param nombreVoix
     */
    public void setNombreVoix(int nombreVoix) {
        this.nombreVoix = nombreVoix;
    }

    /**
     * Méthode pour accéder au nombre de de voix pour le candidat
     * 
     * @return nombreVoix
     */
    public int getNombreVoix() {
        return this.nombreVoix;
    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     */

    public Candidat(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
