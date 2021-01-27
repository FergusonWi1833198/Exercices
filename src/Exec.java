import java.math.BigDecimal;

public class Exec extends Employe {
    private BigDecimal bonus;

    public Exec(String nom, String prenom, String adresse, BigDecimal salaire, BigDecimal bonus) {
        super(nom, prenom, adresse, salaire);
        this.bonus = bonus;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calculerPaie() {
        return getSalaire().add(bonus);
    }
}
