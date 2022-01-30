package projet_apo;

/**
 * Classe représentant le scrutin majoritaire à 2 tour
 * 
 * @author Morin Alice
 */

public class ScrutinMajoritaireDeuxTours extends Scrutin {

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
        int Votefinal = 0;
        double pourcentage1 = 0;
        double pourcentage2 = 0;
        double pourcentageFinal = 0;

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
        System.out.println("Les candidats " + Vote1 + " et " + Vote2 + " passent au deuxième tour avec " + pourcentage1
                + "% et " + pourcentage2 + "%.");

        // Mise à 0 des votes pour les 2 candidats du face à face
        this.listeElectoralle[Vote1].setNombreVoix(0);
        this.listeElectoralle[Vote2].setNombreVoix(0);
        for (int i = 0; i < nombreElecteurs; i++) {
            choix(this.listeElecteurs[i], Vote1, Vote2);
        }
        for (int i = 0; i < 2; i++) {
            if (this.listeElectoralle[Vote1].getNombreVoix() > this.listeElectoralle[Vote2].getNombreVoix()) {
                Votefinal = Vote1;
            } else {
                Votefinal = Vote2;
            }

        }
        pourcentageFinal = (this.listeElectoralle[Votefinal].getNombreVoix() * 100) / nombreElecteurs;
        System.out.println(
                "Le candidat " + Votefinal + " est le nouveau Président. Il a remporté l'élection avec  "
                        + pourcentageFinal
                        + "% des voix.");
        return this.listeElectoralle[Votefinal];
    }

    /**
     * Méthode qui comptabilise le nombre de votes pour un des 2 derniers candidats
     * 
     * @param e
     * @param v1
     * @param v2
     * @return le Candidat pour lequel l'électeur à voté
     */
    public Candidat choix(Electeur e, int v1, int v2) {
        double checkaxe1[] = new double[2];
        double checkaxe2[] = new double[2];
        double diff = 4;
        double somme1 = 0;
        double somme2 = 0;
        int Vote = 0;

        for (int i = 0; i < 2; i++) {
            // Calcul de la différence d'opinion sur chaque axe avec le candidat
            checkaxe1[i] = Math.abs(Math.sqrt(Math.pow(e.getAxe(i) - listeElectoralle[v1].getAxe(i), 2)));
            somme1 = somme1 + checkaxe1[i];
            checkaxe2[i] = Math.abs(Math.sqrt(Math.pow(e.getAxe(i) - listeElectoralle[v2].getAxe(i), 2)));
            somme2 = somme2 + checkaxe2[i];
        }
        // L'électeur est le plus proche du candidat v1 ?
        if (somme1 <= somme2) {
            if (somme1 <= diff) {
                diff = somme1;
                Vote = v1;
            }
        } else {
            if (somme2 <= diff) {
                diff = somme2;
                Vote = v2;
            }
        }
        for (int i = 0; i < 2; i++) {
            checkaxe1[i] = 0;
            checkaxe2[i] = 0;
            somme1 = 0;
            somme2 = 0;
        }
        if (diff < 1) {
            listeElectoralle[Vote].setNombreVoix(listeElectoralle[Vote].getNombreVoix() + 1);
            return listeElectoralle[Vote];
        } else {
            voteBlanc.setNombreVoix(voteBlanc.getNombreVoix() + 1);
            return voteBlanc;
        }
    }
}
