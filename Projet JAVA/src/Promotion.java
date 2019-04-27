package NotesElevesProfesseurs;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Promotion
{
    private String nom;
    private List<Eleve> eleves;

    //Constructeur d'initialisation
    public Promotion(String nom)
    {
        this.nom = nom;
        this.eleves = new ArrayList<>();
    }

    //Accesseur et mutateur pour le nom
    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void add(Eleve eleve)
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
        for (Eleve eleves : eleves)
        {
            if (eleves.getId() == id) {
                return eleves;
            }
        }
        return null;
    }

    public void triEleve(int sens, int type)
    {
        Collections.sort(eleves, new Compare(sens, type));
    }
}
