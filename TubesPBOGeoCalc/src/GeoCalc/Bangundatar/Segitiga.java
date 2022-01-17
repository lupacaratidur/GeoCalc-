package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    public double luas(){
        return 0.5*alas*tinggi;
    }

    public double keliling(){
        return alas+alas+alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
