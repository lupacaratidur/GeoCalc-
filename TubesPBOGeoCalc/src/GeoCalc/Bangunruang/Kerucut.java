package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class Kerucut extends BangunRuang {
    double phi = 3.14;
    double jarijari;
    double sisi;
    double tinggi;

    @Override
    public double luasPermukaan(){
        return phi*jarijari*(jarijari+sisi);
    }
    @Override
    public double Volume(){
        return 0.333333333*phi*jarijari*jarijari*tinggi;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
