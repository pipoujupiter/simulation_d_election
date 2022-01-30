package projet_apo;

/**
 * Classe de l'interface
 * 
 * @author Morin Alice
 */

public class Interface {
    public void IMH() {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            Scrutin s = new Scrutin();

            System.out.println("Choix du nombre d'électeurs (max 2000): ");
            int nombreE = input.nextInt();
            s.setElecteur(nombreE);
            System.out.println("Choix du nombre de candidats (maximum 100): ");
            int nombreC = input.nextInt();
            s.setCandidat(nombreC);
            System.out.println("Que voulez vous faire ?");
            System.out.println("Scrutin -1 ");
            System.out.println("Quitter -2 ");
            boolean continuer = true;
            while (continuer == true) {
                switch (input.nextInt()) {

                    // Scrutin
                    case 1:
                        ScrutinMajoritaireUnTour S1 = new ScrutinMajoritaireUnTour();
                        S1.setCandidat(nombreC);
                        S1.setElecteur(nombreE);
                        S1.Président();
                        break;

                    // Quitter
                    default:
                        continuer = false;
                        break;

                }
            }
        }
    }

}
