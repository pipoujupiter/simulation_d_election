package projet_apo;

/**
 * Classe représentant le scrutin majoritaire à 1 tour
 * 
 * @author Morin Alice
 */

public class ScrutinMajoritaireUnTour extends Scrutin {

    /**
     * Méthode qui effectue un scrutin majoritaire à 1 tour
     * 
     * @return le candidat qui à gagné les elections
     */
    public Candidat Président() {
        int max = 0;
        int Vote = 0;
        double pourcentage = 0;

        for (int i = 0; i < nombreElecteurs; i++) {
            preference(this.listeElecteurs[i]);
        }
        for (int i = 0; i < nombreCandidats; i++) {
            if (this.listeElectoralle[i].getNombreVoix() > max) {
                max = this.listeElectoralle[i].getNombreVoix();
                Vote = i;

            }

        }
        pourcentage = (this.listeElectoralle[Vote].getNombreVoix() * 100) / nombreElecteurs;
        System.out.println(
                "Le candidat " + Vote + " est le nouveau Président. Il a remporté l'élection avec  " + pourcentage
                        + "% des voix.");
        return this.listeElectoralle[Vote];
    }
}
