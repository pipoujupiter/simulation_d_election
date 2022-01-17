import java.util.Random;

/**
 * Classe représentant un électeur
 * 
 * @author Morin Alice
 */

public class Electeur {

    /* Axe societal de la personne */
    protected float axe[] = new float[2];
    /*
     * attribut de classe qui permet de garantir l'unicité du numéro à travers les
     * personnes
     */
    private static int NUMERO = 1;
    /* attribut rajouté pour avoir un numéro de la personne */
    int numeroelecteur;

    /**
     * Méthode qui affiche les données de l'électeur
     * 
     * @return données Electeur
     */
    public void affElecteurs() {
        System.out.println(" Numéro électeur : " + numeroelecteur);
        System.out.print("Axe : [");
        for (int i = 0; i < 2; i++) {
            System.out.print(axe[i] + " ");
        }
        System.out.print("]");

    }

    /**
     * Le constructeur présent sur le diagramme
     * 
     */

    public Electeur() {
        this.numeroelecteur = NUMERO;
        NUMERO++;
        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            float nb;
            nb = random.nextInt(11);
            nb = nb / 10;
            axe[i] = nb;
        }
    }

}
