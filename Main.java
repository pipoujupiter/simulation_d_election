public class Main {

    public static void main(String[] args) {
        Candidat c = new Candidat("Monsieur", "Président");
        c.affCandidat();
        Scrutin s = new Scrutin();
        for (int i = 0; i < 100; i++) {
            Electeur e = new Electeur();
            s.affPreference(s.preference(e, c));
        }

    }

}
