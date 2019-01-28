public class Main {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran ();
        bujursangkar BujurSangkar = new bujursangkar ();

        lingkaran.setr(20);
        lingkaran.KelilingLingkaran();
        System.out.println("hasil Keliling lingkaran ="+ lingkaran.getHasil());

        BujurSangkar.setsisi(4);
        BujurSangkar.menghitungKeliling();
        System.out.println("hasil Keliling bujursangkar ="+ BujurSangkar.getHasil());
    }
}
