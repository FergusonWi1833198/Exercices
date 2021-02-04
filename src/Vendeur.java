import java.math.BigDecimal;

public class Vendeur extends Employe {
    private BigDecimal tauxCommission;
    private BigDecimal volumeVente;

    public Vendeur(BigDecimal tauxCommission, BigDecimal volumeVente) {
        this.tauxCommission = tauxCommission;
        this.volumeVente = volumeVente;
    }

    public Vendeur(String nom, String prenom, String adresse, BigDecimal salaire, BigDecimal tauxCommission, BigDecimal volumeVente) {
        super(nom, prenom, adresse, salaire);
        this.tauxCommission = tauxCommission;
        this.volumeVente = volumeVente;
    }

    public Vendeur(){
        tauxCommission = BigDecimal.ZERO;
        volumeVente = BigDecimal.ZERO;
    }

    public BigDecimal getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(BigDecimal tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public BigDecimal getVolumeVente() {
        return volumeVente;
    }

    public void setVolumeVente(BigDecimal volumeVente) {
        this.volumeVente = volumeVente;
    }

    @Override
    public BigDecimal calculerPaie(){
        return getSalaire().add(tauxCommission.multiply(volumeVente));
    }
}
