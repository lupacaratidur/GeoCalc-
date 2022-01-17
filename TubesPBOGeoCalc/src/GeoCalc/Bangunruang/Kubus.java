package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class Kubus extends BangunRuang {
    public double sisi;


    @Override
    public double luasPermukaan(){
        return 6*sisi*sisi;
    }
    @Override
    public double Volume(){
        return sisi*sisi*sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
