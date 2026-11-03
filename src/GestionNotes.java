import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   RELEVE DE NOTES - L2          ");
        System.out.println("=================================");


        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;
        final int COEF_ALGO = 3;
        final int COEF_BD = 2;
        final int COEF_ANGLAIS = 1;


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

        clavier.close();

        System.out.println("\nÉtudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);
    }
}