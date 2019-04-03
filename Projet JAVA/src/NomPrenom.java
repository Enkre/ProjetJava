public class NomPrenom {
    protected String prenom;
    protected String nom;

    public NomPrenom(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }
    public String toString() {
        return "(" + this.nom + "," + this.prenom +")";
    }
}
