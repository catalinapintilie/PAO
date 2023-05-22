import java.util.ArrayList;
import java.util.List;

public class listaProduse {

    private List<Produse> articole;

    // Constructor
    public listaProduse() {
        articole = new ArrayList<>();
    }

    public void adaugaProduse(Produse produse) {
        articole.add(produse);
    }

    public void eliminaProduse(Produse produse) {
        articole.remove(produse);
    }

    public List<Produse> getHaine() {
        return articole;
    }

}
