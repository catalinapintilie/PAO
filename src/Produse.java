public class Produse {
        private int id;
        private String nume;
        private double pret;

        // Constructor
        public Produse(int id, String nume, double pret) {
            this.id = id;
            this.nume = nume;
            this.pret = pret;
        }

        //Acces
        public int getId() {
            return id;
        }

        public String getNume() {
            return nume;
        }

        public double getPret() {
            return pret;
        }
}
