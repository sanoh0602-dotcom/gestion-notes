import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {

        // --- EN-TÊTE DU PROGRAMME ---
        System.out.println("=================================");
        System.out.println("   RELEVE DE NOTES - L2          ");
        System.out.println("=================================");

        // --- CONSTANTES DU CALCUL ---
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;
        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANGLAIS = 1;

        Scanner clavier = new Scanner(System.in);

        // --- SAISIE DE L'IDENTITÉ ---
        System.out.print("Entrez le prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Entrez le nom : ");
        String nom = clavier.nextLine();

        System.out.print("Entrez l'âge : ");
        int age = clavier.nextInt();
        clavier.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le matricule : ");
        String matricule = clavier.nextLine();

        // --- SAISIE DES 6 NOTES ---
        System.out.print("Devoir Algorithmique : ");
        double devoirAlgo = clavier.nextDouble();
        System.out.print("Examen Algorithmique : ");
        double examenAlgo = clavier.nextDouble();

        System.out.print("Devoir Base de données : ");
        double devoirBd = clavier.nextDouble();
        System.out.print("Examen Base de données : ");
        double examenBd = clavier.nextDouble();

        System.out.print("Devoir Anglais : ");
        double devoirAnglais = clavier.nextDouble();
        System.out.print("Examen Anglais : ");
        double examenAnglais = clavier.nextDouble();

        clavier.close();

        // --- CALCULS DES MOYENNES ---
        double moyenneAlgo = (devoirAlgo * POIDS_DEVOIR) + (examenAlgo * POIDS_EXAMEN);
        double moyenneBd = (devoirBd * POIDS_DEVOIR) + (examenBd * POIDS_EXAMEN);
        double moyenneAnglais = (devoirAnglais * POIDS_DEVOIR) + (examenAnglais * POIDS_EXAMEN);

        int sommeCoefs = COEF_ALGO + COEF_BD + COEF_ANGLAIS;
        double moyenneGenerale = ((moyenneAlgo * COEF_ALGO) + (moyenneBd * COEF_BD) + (moyenneAnglais * COEF_ANGLAIS)) / sommeCoefs;

        // --- AFFICHAGE FINAL FORMATÉ ---
        System.out.println("\nÉtudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);
        System.out.println("---------------------------------");

        System.out.printf("Algorithmique      (coef %d) : %.2f%n", COEF_ALGO, moyenneAlgo);
        System.out.printf("Base de données    (coef %d) : %.2f%n", COEF_BD, moyenneBd);
        System.out.printf("Anglais            (coef %d) : %.2f%n", COEF_ANGLAIS, moyenneAnglais);

        System.out.println("---------------------------------");
        System.out.printf("Moyenne générale             : %.2f%n", moyenneGenerale);
        System.out.println("=================================");
    }
}