import java.util.Scanner;

public class Moyenne {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int compteur=0;

        System.out.println("Entrez le nombre d'évaluaion :");
        int NB_EVALUATION = scanner.nextInt();

        double array[] = new double[NB_EVALUATION];

        while (compteur<NB_EVALUATION) {
            System.out.println("Entrez une note :");
            array[compteur] = scanner.nextDouble();
            compteur++;
        }

        double somme = 0;
        for(int i = 0; i < array.length; i++) {
            somme += array[i];
        }
        System.out.println("Votre moyenne est : " + (somme)/array.length);
    }
}
