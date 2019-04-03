public class Eleve extends NomPrenom {

    private int id;
    private int jour;
    private int mois;
    private int annee;
    Evaluation evaluation;
    private static final int NB_EVALUATIONS = 10;





    public void setId(int id){
        this.id = id;
    }

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

    @Override // Décris un élève
    public String toString()
    {
        return super.toString();
    }


}
