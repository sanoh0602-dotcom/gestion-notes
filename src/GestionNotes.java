import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {
        // ÉTAPE 1 : L'en-tête
        System.out.println("=================================");
        System.out.println("   RELEVE DE NOTES - L2          ");
        System.out.println("=================================");

        // ÉTAPE 4 : Les constantes du calcul
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;
        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANGLAIS = 1;

        // ÉTAPE 3 : L'identité au clavier
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Entrez le nom : ");
        String nom = clavier.nextLine();

        System.out.print("Entrez l'âge : ");
        int age = clavier.nextInt();
        clavier.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le matricule : ");
        String matricule = clavier.nextLine();

        // ÉTAPE 5 : Saisie des 6 notes
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

        //  ÉTAPE 5 : Calcul des moyennes par matière
        double moyenneAlgo = (devoirAlgo * POIDS_DEVOIR) + (examenAlgo * POIDS_EXAMEN);
        double moyenneBd = (devoirBd * POIDS_DEVOIR) + (examenBd * POIDS_EXAMEN);
        double moyenneAnglais = (devoirAnglais * POIDS_DEVOIR) + (examenAnglais * POIDS_EXAMEN);

        // AFFICHAGE FINAL & PROVISOIRE
        System.out.println("\nÉtudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);

        // Affichage brut demandé à l'étape
        System.out.printf("Brut : " + moyenneAlgo + " | " + moyenneBd + " | " + moyenneAnglais);
    }
}