package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class LimasSegitiga extends BangunRuang {
    double alas;
    double tinggiSegitiga;
    double tinggiLimas;

    @Override
    public double luasPermukaan(){
        return 0.5*alas*tinggiSegitiga+0.5*alas*tinggiSegitiga+0.5*alas*tinggiSegitiga;
    }
    @Override
    public double Volume(){
        return 0.166666667*alas*tinggiSegitiga*tinggiLimas;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }


}

