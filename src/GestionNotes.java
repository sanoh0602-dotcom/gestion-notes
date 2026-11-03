import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   RELEVE DE NOTES - L2          ");
        System.out.println("=================================");


        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le prénom : ");
        String prenom = clavier.nextLine();

        System.out.print("Entrez le nom : ");
        String nom = clavier.nextLine();

        System.out.print("Entrez l'âge : ");
        int age = clavier.nextInt();

        // on consomme le saut de ligne restant après nextInt()
        clavier.nextLine();

        System.out.print("Entrez le matricule : ");
        String matricule = clavier.nextLine();

        // Fermeture du Scanner
        clavier.close();

        // affichage
        System.out.println("\nÉtudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);
    }
}