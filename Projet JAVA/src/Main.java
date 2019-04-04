public class Main {

    public static void main(String[] args) {
        //Eleve eleve = new Eleve("Gustave", "Mehaddi");
        //System.out.println(eleve.toString());

         Professeur professeur = new Professeur("Soleil","Tournesol");
        System.out.println(professeur.toString());
        Eleve eleve = new Eleve("Toto", "test", 12, 3, 2019);
        Evaluation evaluation = new Evaluation(eleve, professeur, "maths", 0);
        eleve.mediane(evaluation);

       //Evaluation evaluation = new Evaluation(eleve,professeur,"Mathématiques",8);
       //System.out.println(evaluation);


    }
}
