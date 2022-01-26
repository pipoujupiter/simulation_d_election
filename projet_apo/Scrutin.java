package projet_apo;

/**
 * Classe représentant un scrutin
 * 
 * @author Morin Alice
 */

public class Scrutin {

    protected int nombreCandidats = 15;
    /* Liste des candidats se présentant à aux élections */
    protected Candidat listeElectoralle[] = new Candidat[nombreCandidats];
    protected int nombreElecteurs = 2000;
    /* Liste des électeurs */
    protected Electeur listeElecteurs[] = new Electeur[nombreElecteurs];
    /* Vote blanc */
    protected Candidat voteBlanc = new Candidat();

    /**
     * Méthode de création de Candidats
     * 
     * @param nombreC
     */

    public void setCandidat(int nombreC) {
        nombreCandidats = nombreC;
        for (int i = 0; i < nombreCandidats; i++) {
            Candidat c = new Candidat();
            listeElectoralle[i] = c;
        }
    }

    /**
     * Méthode qui donne la liste électoralle
     * 
     * @return listeElectoralle
     */
    public Candidat[] getCandidat() {
        return listeElectoralle;
    }

    /**
     * Méthode de création d'Electeurs
     * 
     * @param nombreE
     */

    public void setElecteur(int nombreE) {
        nombreElecteurs = nombreE;
        for (int i = 0; i < nombreElecteurs; i++) {
            Electeur e = new Electeur();
            listeElecteurs[i] = e;
        }
    }

    /**
     * Méthode d'implémentation des électeurs crées dans la liste d'électeurs
     * 
     * @param listeE
     * @param nombreE
     */
    public void setListeElecteur(Electeur[] listeE, int nombreE) {
        this.nombreElecteurs = nombreE;
        for (int i = 0; i < nombreE; i++) {
            this.listeElecteurs[i] = listeE[i];
        }
    }

    /**
     * Méthode d'implémentation des candidats crées dans la liste électoralle
     * 
     * @param listeC
     * @param nombreC
     */
    public void setListeCandidat(Candidat[] listeC, int nombreC) {
        this.nombreCandidats = nombreC;
        for (int i = 0; i < nombreC; i++) {
            this.listeElectoralle[i] = listeC[i];
        }
    }

    /**
     * Méthode qui comptabilise le nombre de votes pour un candidat
     * 
     * @param e
     * @return Candidat pour lequel l'électeur à voté
     */
    public Candidat preference(Electeur e) {
        float checkaxe[] = new float[2];
        float diff = 0;
        float somme = 0;
        int Vote = 0;

        for (int i = 0; i < nombreCandidats; i++) {
            for (int j = 0; j < 2; j++) {
                checkaxe[j] = Math.abs(e.getAxe(j) - listeElectoralle[i].getAxe(j)); // Calcul de la différence
                                                                                     // d'opinion sur chaque axe avec le
                                                                                     // candidat
                somme = somme + checkaxe[j];
            }
            // L'électeur est le plus proche du candidat i
            if (somme <= diff) {
                diff = somme;
                Vote = i;
            }
            somme = 0;
            diff = 0;
        }

        // Vérification si le Candidat est assez proche de l'électeur pour qu'il vote
        // pour lui
        if (checkaxe[0] <= 0.2 && checkaxe[1] <= 0.2) {
            listeElectoralle[Vote].setNombreVoix(listeElectoralle[Vote].getNombreVoix() + 1);
            return listeElectoralle[Vote];
        } else {
            voteBlanc.setNombreVoix(voteBlanc.getNombreVoix() + 1);
            return voteBlanc;
        }
    }

    /**
     * Méthode d'affichage si l'électeur à voté pour le candidat
     * 
     * @param pref
     * @return booleen si l'électeur à voté pour le candidat ou non
     */
    public void affPreference(boolean pref) {
        System.out.println(pref);
    }

}
