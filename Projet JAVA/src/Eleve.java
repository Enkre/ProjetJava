package NotesElevesProfesseurs;
import java.util.ArrayList;

public class Eleve extends NomPrenom 
{

	private int id;
	private int jour;
	private int mois;
	private int annee;
	ArrayList<Evaluation> evaluations;
	public static final int NB_EVALUATIONS = 10;

	//Constructeur d'initialisation
	public Eleve(String prenom, String nom, int jour, int mois, int annee)
	{
		super(prenom,nom);
	    this.jour = jour;
	    this.mois = mois;
        this.annee = annee;
        evaluations = new ArrayList<>();
	}
	//Accesseur pour l'identifiant
	public int getId()
	{
		return id;
	}

	public void setId()
	{
		this.id = id;
    }
	
	static double moyenne(Eleve eleve) {
		int somme = 0;
		try {
	        for (Evaluation eval : eleve.evaluations) {
	        	somme += eval.getNote();
	        }
		} catch(IllegalStateException e) {
			System.out.println("Aucune note n'a été saisie !");
		} catch(ArythmeticException e) {
			System.out.println("Division par 0");
			// Add evaluation
		}
        return somme/eleve.evaluations.size();
	}
	
	public double mediane(Eleve eleve)
	{
		int compteur = 0;
		for (Evaluation eval : eleve.evaluations) {
			compteur ++;
		}
		if (compteur%2 == 0) {
			compteur = compteur/2;
		}
		else {
			compteur = ((compteur - 1)/ 2) + 1;
		}
		return eleve.evaluations.get(compteur - 1).getNote();
		
	}
	
	

    @Override // Décris un élève
    public String toString()
    {
        return super.toString();
	}
}
