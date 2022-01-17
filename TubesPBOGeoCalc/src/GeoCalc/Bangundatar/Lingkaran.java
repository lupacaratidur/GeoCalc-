package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class Lingkaran extends BangunDatar {
    double jarijari;
    double phi = 3.14;

    public double luas(){
        return phi*jarijari*jarijari;
    }

    public double keliling(){
        return phi*2*jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
