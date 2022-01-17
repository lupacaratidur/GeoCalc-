package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class Tabung extends BangunRuang {
    double phi = 3.14;
    double jarijari;
    double tinggi;

    @Override
    public double luasPermukaan(){
        return 2*phi*jarijari*tinggi+2*phi*jarijari*jarijari;
    }
    @Override
    public double Volume(){
        return phi*jarijari*jarijari*tinggi;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
