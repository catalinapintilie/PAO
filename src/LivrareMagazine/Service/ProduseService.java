package LivrareMagazine.Service;

import LivrareMagazine.Model.Produse;

import java.util.ArrayList;
import java.util.List;
public class ProduseService
{
    private final List<Produse> produse;

    public ProduseService()
    {
        produse = new ArrayList<>();
    }

    public void adaugaProduse(Produse produse)
    {
        produse.add(produse);
    }

    public void eliminaProduse(Produse produce)
    {
        produse.remove(produce);
    }

    public List<Produse> cautaProduse(String criterii)
    {
        return null;
    }
}