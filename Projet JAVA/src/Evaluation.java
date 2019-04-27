package NotesElevesProfesseurs;


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

    //Méthode qui permet de tester si une évaluation correspond aux paramètres donnés
    public boolean has(Professeur professeur, String matiere)
    {
        if (this.professeur.getNom() == professeur.getNom() && this.matiere == matiere) {
            return true;
        }
        return false;
    }

    //Accesseurs et mutateurs
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

    //Méthode qui permet de comparer deux objects en fonction de leur note
    @Override
    public int compareTo(Object obj)
    {
        Evaluation evaluation = (Evaluation)obj;
        double diff = this.note - evaluation.getNote();

        if (diff < 0) {
            return -1;
        }
        if (diff > 0) {
            return 1;
        }
        return 0;
    }

    //Méthode qui permet d'afficher l'évaluation d'un élève (matière, note, correcteur)
    @Override
    public String toString()
    {
        return "(" + eleve.toString() + " " + professeur.toString() + " " + this.matiere + " " + this.note + ")";
    }
}
