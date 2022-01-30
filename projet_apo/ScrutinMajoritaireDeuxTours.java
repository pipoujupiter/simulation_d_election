package projet_apo;

/**
 * Classe représentant le scrutin majoritaire à 2 tour
 * 
 * @author Morin Alice
 */

public class ScrutinMajoritaireDeuxTours extends ScrutinMajoritaireUnTour {

    /**
     * Méthode qui effectue un scrutin majoritaire à 2 tours
     * 
     * @return le candidat qui à gagné les elections
     */
    public Candidat Président() {
        int max1 = 0;
        int max2 = 0;
        int Vote1 = 0;
        int Vote2 = 0;
        double pourcentage1 = 0;
        double pourcentage2 = 0;

        for (int i = 0; i < nombreElecteurs; i++) {
            preference(this.listeElecteurs[i]);
        }
        for (int i = 0; i < nombreCandidats; i++) {
            if (this.listeElectoralle[i].getNombreVoix() > max1) {
                max1 = this.listeElectoralle[i].getNombreVoix();
                Vote1 = i;
            }
            if (this.listeElectoralle[i].getNombreVoix() > max2 && this.listeElectoralle[i].getNombreVoix() < max1) {
                max2 = this.listeElectoralle[i].getNombreVoix();
                Vote2 = i;
            }
        }
        pourcentage1 = (this.listeElectoralle[Vote1].getNombreVoix() * 100) / nombreElecteurs;
        pourcentage2 = (this.listeElectoralle[Vote2].getNombreVoix() * 100) / nombreElecteurs;
        System.out.println("Les candidats " + Vote1 + " et " + Vote2 + " passent au deuxième tour.");
        return this.listeElectoralle[Vote1];
    }
}
