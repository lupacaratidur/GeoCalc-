package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class Persegi extends BangunDatar {
    double sisi;

    public double luas(){
        return sisi*sisi;
    }

    public double keliling(){
        return 4*sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
