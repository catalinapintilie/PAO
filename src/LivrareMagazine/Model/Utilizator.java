package LivrareMagazine.Model;

import java.util.ArrayList;
import java.util.List;
public class Utilizator {

    private int id;
    private String nume;

    private List<Comanda> comenzi;

    // Constructor
    public Utilizator(int id, String nume) {
        this.id = id;
        this.nume = nume;
        comenzi = new ArrayList<>();
    }

    // Acces
    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void adaugaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }


}
