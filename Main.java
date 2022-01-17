public class Main {

    public static void main(String[] args) {
        Electeur p = new Electeur();
        Electeur p1 = new Electeur();

        Candidat c = new Candidat("Monsieur", "Président");

        p.affElecteurs();
        p1.affElecteurs();
        c.affCandidat();
    }

}
