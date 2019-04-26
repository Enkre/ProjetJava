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

    @Override // Décris un professeur
    public String toString()
    {
        return super.toString();
    }
}
