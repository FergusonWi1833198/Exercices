import java.math.BigDecimal;

public class Employe {
    private String nom;
    private String prenom;
    private String adresse;
    private BigDecimal salaire;


    public Employe() {
        nom = "";
        prenom = "";
        adresse = "";
        salaire = BigDecimal.ZERO;

    }

    public Employe(String nom, String prenom, String adresse, BigDecimal salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public BigDecimal getSalaire() {
        return salaire;
    }

    public void setSalaire(BigDecimal salaire) {
        this.salaire = salaire;
    }

    public BigDecimal calculerPaie(){
        return salaire;
    }

    @Override
    public String toString(){
        return "L'employé " + getPrenom() + " " + getNom() + " habite au " + getAdresse() +
                " et gagne " + calculerPaie().toPlainString() + "$ annuellement.";
    }
}
