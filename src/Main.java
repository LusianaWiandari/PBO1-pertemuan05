public class Main {
    public static void main(String[] args) {
        Pensil pensil = new Pensil();
        pensil.jenis = "2B";
        pensil.tahun = 2020;

        Pensil pensilku = new Pensil();
        pensilku.jenis = "4B";
        pensilku.tahun = 2023;

        pensil.info();
        pensilku.info();

    }
}