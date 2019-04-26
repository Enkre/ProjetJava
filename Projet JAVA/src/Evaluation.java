package NotesElevesProfesseurs;

import java.util.ArrayList;

public class Evaluation {

	private String matiere;
    private double note;
    Eleve eleve;
    Professeur professeur;

    //constructeur d'initialisation
    public Evaluation(Eleve eleve, Professeur professeur, String matiere, double note)
    {
        this.eleve = eleve;
        this.professeur = professeur;
        this.matiere = matiere;
        this.note = note;
    }
    
    
    //Accesseurs en lecture et écriture
    public double getNote()
	{
		return note;
	}
	public void setNote(double note)
	{
		this.note = note;
    }
	
	public String getMatiere()
	{
		return matiere;
	}
	public void setMatiere(String matiere)
	{
		this.matiere = matiere;
    }
	
	public Professeur getProfesseur()
	{
		return professeur;
	}
	public void setProfesseur(Professeur professeur)
	{
		this.professeur = professeur;
	}


    @Override // Décris un élève
    public String toString()
    {
        return "(" + eleve.toString() + " " + professeur.toString() + " " + this.matiere + " " + this.note + ")";
    }
}
