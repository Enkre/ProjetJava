package NotesElevesProfesseurs;
import java.util.List;
import java.util.ArrayList;

public class Promotion {
    private String nom;
    private List<Eleve> eleves;

    //Constructeur d'initialisation
    public Promotion(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<>();
    }

    //Accesseur pour le nom
    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void add (Eleve eleve)
    {
        eleves.add(eleve);
        eleve.setPromotion(this);
    }

    //Accesseur en lecture des élèves qui retourne une copie
    public List<Eleve> getEleves()
    {
        return new ArrayList<>(eleves);
    }

    //Méthode qui permet de rechercher un élève dans la promotion en fonction de son id
    public Eleve rechercher(int id)
    {
        for (Eleve eleve : eleves)
        {
            if (eleve.equals(eleve) == true) {
                return eleve;
            }
        }
        return null;
    }
}
