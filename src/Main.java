import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employe alice = new Employe("Audet", "Alice", "100 rue Rose", BigDecimal.valueOf(35_000));
        Employe bernard = new Employe("Bérubé", "Bernard", "45 rue Tulipe", BigDecimal.valueOf(41_000));
        Employe charlie = new Employe("Charbonneau", "Charlie", "12 rue Rhododendron", BigDecimal.valueOf(45_000));

        Vendeur diane = new Vendeur("Dion", "Diane", "990 rue Lilas", BigDecimal.valueOf(35_000),
                BigDecimal.valueOf(0.05), BigDecimal.valueOf(250_000));

        Exec eve = new Exec("Edwards", "Eve", "1001 rue Lys", BigDecimal.valueOf(85_000), BigDecimal.valueOf(10_000));

        System.out.println(alice);
        System.out.println(bernard);
        System.out.println(charlie);
        System.out.println(diane);
        System.out.println(eve);
    }
}
