public class Professeur extends NomPrenom{


    // Constructeur d'initialisation
   public Professeur(String prenom, String nom)
    {
        super(prenom,nom);
    }
    
    //Méthode qui permet au professeur de rechercher un élève dans la promotion en fonction de son id
    public Eleve rechercher(Promotion promotion, int id) 
    {
        return promotion.rechercher(id);
    }
    
    public void setNote(Promotion promotion, int id, double note, int indice) throws IllegalStateException
    {
        Eleve eleve = rechercher(promotion, id);
        Evaluation eval = null;
        if (eleve == null) {
            throw new IllegalStateException("Eleve inexistant dans la promotion !");
        }
        try {
            eval = eleve.getEvaluation().get(indice);
            eval.setNote(note);
            eval.setProfesseur(this);
        } catch (IndexOutOfBoundsException error) {
            //eval = new Evaluation(eleve, this, matiere, note);
        }
    }

    @Override // Décris un professeur
    public String toString()
    {
        return super.toString();
    }
}
