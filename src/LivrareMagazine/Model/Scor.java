package LivrareMagazine.Model;

public class Scor {
    private int id;
    private int stele;
    private String comentariu;

    public Scor(int id, int stele, String comentariu) {
        this.id = id;
        this.stele = stele;
        this.comentariu = comentariu;
    }

    public int getId() {
        return id;
    }

    public int getStele() {
        return stele;
    }

    public String getComentariu() {
        return comentariu;
    }
}