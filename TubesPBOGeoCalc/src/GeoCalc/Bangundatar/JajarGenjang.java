package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class JajarGenjang extends BangunDatar {
    double alas;
    double tinggi;
    double sisiMiring;

    public double luas(){
        return alas*tinggi;
    }

    public double keliling(){
        return 2*(alas+sisiMiring);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
}
