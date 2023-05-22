
public class Magazin {
    private int id;
    private String nume;
    private String adresa;
    private listaProduse lista;

    // Constructor
    public Magazin(int id, String nume, String adresa) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.lista = new listaProduse();
    }
    // Acces
    public int getId()
    {
        return id;
    }

    public String getNume()
    {
        return nume;
    }

    public String getAdresa()
    {
        return adresa;
    }

    public listaProduse getLista()
    {
        return lista;
    }




}
