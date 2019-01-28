public class Lingkaran {
    private double phi=3.14;
    private int r;
    private double hasil;

    public void KelilingLingkaran () {
        this.hasil = phi * r;
    }
    public void setr (int r){
        this.r= r;
    }
    public double getHasil (){
        return hasil;
    }
}
