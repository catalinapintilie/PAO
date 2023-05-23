package LivrareMagazine.Model;

import java.util.ArrayList;
import java.util.List;
public class Comanda {

    private int id;
    private Utilizator utilizator;
    private List<Produse> articole;
    private double totalPlata;
    private String stare;

    // Constructor
    public Comanda(int id, Utilizator utilizator) {
        this.id = id;
        this.utilizator = utilizator;
        articole = new ArrayList<>();
        totalPlata = 0;
        stare = "Nu s-a procesat comanda";
    }

    // Acces
    public int getId() {
        return id;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public List<Produse> getarticole() {
        return articole;
    }

    public double getTotalPlata() {
        return totalPlata;
    }

    public String getStare() {
        return stare;
    }

    public void adaugaProduse(Produse produse) {
        articole.add(produse);
        totalPlata += produse.getPret();
    }

    public void eliminaProduse(Produse produse) {
        articole.remove(produse);
        totalPlata -= produse.getPret();
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

}
