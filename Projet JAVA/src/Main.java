package NotesElevesProfesseurs;

public class Main {
	
	public static void main(String[] args) 
	{
        //Eleve eleve = new Eleve("Gustave", "Mehaddi");
        //System.out.println(eleve.toString());

        Professeur professeur = new Professeur("Soleil","Tournesol");
        System.out.println(professeur.toString());
        Eleve eleve = new Eleve("Toto", "test", 12, 3, 2019);
       for(int i = 0; i < 5; i++) {
        	eleve.evaluations.add(new Evaluation(eleve, professeur, "matiere", i*4));
       }
       System.out.println("Moyenne : " + eleve.moyenne(eleve));
       System.out.println("Médiane : " + eleve.mediane(eleve));
       //Evaluation evaluation = new Evaluation(eleve,professeur,"Mathématiques",8);
       //System.out.println(evaluation);
	}
	
	
}

