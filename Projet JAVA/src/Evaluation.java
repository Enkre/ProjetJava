public class Evaluation {
    private String matiere;
    private double note;
    Eleve eleve;
    Professeur professeur;

    //constructeur d'initialisation
    public Evaluation(Eleve eleve,Professeur professeur,String matiere,float note)
    {
        this.eleve=eleve;
        this.professeur=professeur;
        this.matiere= matiere;
        this.note=note;
    }

    @Override // Décris un élève
    public String toString()
    {
        return eleve.toString() + professeur.toString()+ this.matiere + this.note;
    }
}
