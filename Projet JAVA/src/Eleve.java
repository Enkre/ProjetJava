public class Eleve extends NomPrenom {

    private int id;
    private int jour;
    private int mois;
    private int annee;
    Evaluation evaluation;
    private static final int NB_EVALUATIONS = 10;

    //Constructeur d'initialisation
    public Eleve(String prenom, String nom, int jour, int mois, int annee)
    {
        super(prenom,nom);
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }

    //Accesseur pour l'identifiant
    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }
    
    public double mediane(Evaluation evaluation)
	{
		double note;
		note = evaluation.getNote();
		System.out.println(note);
		return note;
	}

    @Override // Décris un élève
    public String toString()
    {
        return super.toString();
    }


}
