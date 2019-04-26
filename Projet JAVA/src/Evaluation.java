package NotesElevesProfesseurs;

import java.util.ArrayList;

public class Evaluation implements Comparable {

    private String matiere;
    private double note;
    Eleve eleve;
    Professeur professeur;

    //Constructeur d'initialisation
    public Evaluation(Eleve eleve, Professeur professeur, String matiere, double note)
    {
        this.eleve = eleve;
        this.professeur = professeur;
        this.matiere = matiere;
        this.note = note;
    }

    //Méthode qui permet d'ajouter des évaluations en fonction du nombre max autorisé
    public void addEvaluation()
    {
        if (eleve.evaluations.size() <= eleve.NB_EVALUATIONS) {
            eleve.evaluations.add(this);
        }
        else {
            System.out.println("Le nombre maximum d'évaluation (" + eleve.NB_EVALUATIONS + ") par élève a été dépassé !");
        }
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

    @Override
    public int compareTo(Object obj)
    {
        Evaluation evaluation = (Evaluation)obj;
        double diff = this.note - evaluation.getNote();
        /* For Ascending order*/
        if (diff < 0) {
            return -1;
        }
        if (diff > 0) {
            return 1;
        }
        return 0;
    }

    @Override // Décris un élève
    public String toString()
    {
        return "(" + eleve.toString() + " " + professeur.toString() + " " + this.matiere + " " + this.note + ")";
    }
}
