package projet_apo;

/**
 * Classe représentant un scrutin
 * 
 * @author Morin Alice basé sur le travail de Anthony Gonzalez.
 */

public class Scrutin {

    protected int nombreCandidats = 100;
    /* Liste des candidats se présentant à aux élections */
    protected Candidat listeElectoralle[] = new Candidat[nombreCandidats];
    protected int nombreElecteurs = 2000;
    /* Liste des électeurs */
    protected Electeur listeElecteurs[] = new Electeur[nombreElecteurs];
    /* Vote blanc que l'on considère comme un candidat à part entière */
    protected Candidat voteBlanc = new Candidat();

    /**
     * Méthode qui comptabilise le nombre de votes pour un candidat
     * 
     * @param e
     * @return Candidat pour lequel l'électeur à voté
     */
    public Candidat preference(Electeur e) {
        double checkaxe[] = new double[2];
        double diff = 4;
        double somme = 0;
        int indiceVote = 0;

        for (int i = 0; i < nombreCandidats; i++) {
            for (int j = 0; j < 2; j++) {
                // Calcul de la différence d'opinion sur chaque axe avec le candidat
                checkaxe[j] = Math.abs(Math.sqrt(Math.pow(e.getAxe(j) - listeElectoralle[i].getAxe(j), 2)));
                somme = somme + checkaxe[j];
            }
            // L'électeur est le plus proche du candidat i
            if (somme <= diff) {
                diff = somme;
                indiceVote = i;
            }
            for (int j = 0; j < 2; j++) {
                checkaxe[j] = 0;
                somme = 0;
            }

        }

        // Vérification si le Candidat est assez proche de l'électeur pour qu'il vote
        // pour lui
        if (diff < 1) {
            listeElectoralle[indiceVote].setNombreVoix(listeElectoralle[indiceVote].getNombreVoix() + 1);
            // System.out.println("Cet électeur vote pour le candidat " + indiceVote);
            return listeElectoralle[indiceVote];
        } else {
            voteBlanc.setNombreVoix(voteBlanc.getNombreVoix() + 1);
            return voteBlanc;
        }
    }

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
}
