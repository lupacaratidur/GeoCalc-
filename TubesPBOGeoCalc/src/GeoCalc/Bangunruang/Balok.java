package GeoCalc.Bangunruang;
import GeoCalc.BangunRuang;

public class Balok extends BangunRuang {
    public double panjang;
    public double lebar;
    public double tinggi;



    @Override
    public double luasPermukaan(){
        return 2*(panjang*lebar*tinggi);
    }
    @Override
    public double Volume(){
        return panjang*lebar*tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
