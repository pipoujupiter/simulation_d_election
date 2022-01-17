/**
 * Classe représentant un candidat
 * 
 * @author Morin Alice
 */

public class Candidat extends Personne {

    /* Nombre de voix pour le candidat */
    private int nombreVoix;

    /**
     * Le constructeur présent sur le diagramme
     * 
     * @param nom    de la personne
     * @param prenom de la personne
     */

    public Candidat(String nom, String prenom) {
        super(nom, prenom);
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

}
