/**
 * Classe représentant un candidat
 * 
 * @author Morin Alice
 */

public class Scrutin {

    /**
     * Méthode qui comptabilise le nombre de votes pour un candidat
     * 
     * @param e
     * @param c
     * @return booleen si l'électeur à voté pour le candidat ou non
     */
    public boolean preference(Electeur e, Candidat c) {
        float checkaxe[] = new float[2];

        for (int i = 0; i < 2; i++) {
            checkaxe[i] = Math.abs(e.getAxe(i) - c.getAxe(i));
            System.out.println("checkaxe :" + checkaxe[i]);
        }
        if (checkaxe[0] <= 2 * 0.05 && checkaxe[1] <= 2 * 0.05) {
            c.setNombreVoix(c.getNombreVoix() + 1);
            return true;
        } else
            return false;
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
