import java.math.BigDecimal;

public class Employe extends Personne implements Salarie{
    private BigDecimal salaire;


    public Employe() {
        super();
        salaire = BigDecimal.ZERO;

    }

    public Employe(String nom, String prenom, String adresse, BigDecimal salaire) {
        super(nom,prenom,adresse);
        this.salaire = salaire;
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
