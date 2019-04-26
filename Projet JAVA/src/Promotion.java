package NotesElevesProfesseurs;
import java.util.List;
import java.util.ArrayList;

public class Promotion {
	private String nom;
	private List<Eleve> eleves;
	
	//Constructeur d'initialisation
	public Promotion() {
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
	
	//Accesseur en lecture des élèves qui retourne une copie
	public List<Eleve> getEleves() 
	{ 
		return new ArrayList<>(eleves);
	}
	
	public Eleve rechercher(int id)
    {
        for (Eleve eleve : eleves)
        {
            if (equals(eleve) == true) {
                return eleve;
            }
        }
        return null;
    }
}
