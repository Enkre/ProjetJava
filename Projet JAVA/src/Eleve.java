package NotesElevesProfesseurs;
import java.util.ArrayList;
import java.util.*;

public class Eleve extends NomPrenom 
{

	private int id;
	private static int numero = 0;
	private int jour;
	private int mois;
	private int annee;
	ArrayList<Evaluation> evaluations;
	public static final int NB_EVALUATIONS = 10;
	private Date naissance;
	private Promotion promotion;

	//Constructeur d'initialisation
	public Eleve(String prenom, String nom, int jour, int mois, int annee)
	{
		super(prenom,nom);
		this.naissance = new Date(jour, mois, annee);
        	this.evaluations = new ArrayList<>();
	}
	//Accesseur pour l'identifiant
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = Eleve.numero;
		Eleve.numero++;
    }
	
	//Méthode pour créer des évaluations
	public Evaluation evaluer(Eleve eleve, Professeur professeur, String matiere, double note) {
        Evaluation eval = new Evaluation(eleve, professeur, matiere, note);
        evaluations.add(eval);
        return eval;
	}
	
	//Méthode qui permet de calculer la moyenne des évaluations
	public double moyenne() throws IllegalStateException 
	{
		int somme = 0;
		if (evaluations.isEmpty()) {
			throw new IllegalStateException("L'élève n'a aucune note !");
		}
		for (Evaluation eval : evaluations) {
	        somme += eval.getNote();
		}
        return somme/evaluations.size();
	}
	
	//Méthode qui permet de calculer la médiane des évaluations
	public double mediane() throws IllegalStateException
	{
		int compteur = 0;
		if (evaluations.isEmpty()) {
			throw new IllegalStateException("L'élève n'a aucune note !");
		}
		for (Evaluation eval : evaluations) {
			compteur ++;
		}
		if (compteur%2 == 0) {
			compteur = compteur/2;
		}
		else {
			compteur = ((compteur - 1)/ 2) + 1;
		}
		return evaluations.get(compteur - 1).getNote();
		
	}
	
	//Méthode qui range dans une instance tous les professeurs correcteurs
	public Set<Professeur>getCorrecteurs()
    {
        HashSet<Professeur> correcteurs = new HashSet<Professeur>();
        for (Evaluation eval : evaluations)
        {
            correcteurs.add(eval.getProfesseur());
        }
        return correcteurs;
    }
	

    @Override // Décris un élève
    public String toString()
    {
        try {
            StringBuilder notes = new StringBuilder();
            for(Evaluation eval : evaluations)
            {
                notes.append(eval.getMatiere()).append(" ").append(eval.getNote()).append(" ");
            }
            if (promotion == null) {
                return "\n" + super.toString() + " Id : " + this.getId() + "\nNotes : " + notes + "\nMoyenne = " + moyenne() + "\nMediane = " + mediane() + "\nCorrecteur(s): " + getCorrecteurs();
            }
            return "\n" + super.toString() + " Id : " + this.getId() + "\nPromotion: " + this.promotion.getNom() + "\nNotes : " + notes +  "\nMoyenne = " + moyenne() + "\nMediane = " + mediane() + "\nCorrecteur(s): " + getCorrecteurs();
        } catch(IllegalStateException e) {
            return "";
        }
    }
    
    //Hashcode et equals
    @Override
    public int hashCode() {
        int hash = 3 + id;
        hash += super.hashCode();
        hash = hash * 12 + naissance.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj instanceof Eleve) {
		if (id == ((Eleve) obj).id) {
			return true;
		}
        }
        return false;
    }
}
