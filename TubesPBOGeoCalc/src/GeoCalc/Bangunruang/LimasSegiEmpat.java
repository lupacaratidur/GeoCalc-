package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class LimasSegiEmpat extends BangunRuang {
    double panjang;
    double tinggiLimas;
    double tinggiSegitiga;

    public double luasPermukaan(){
        return panjang*panjang + 0.5*panjang*tinggiSegitiga + 0.5*panjang*tinggiSegitiga +
                0.5*panjang*tinggiSegitiga + 0.5*panjang*tinggiSegitiga;
    }
    public double Volume(){
        return 0.333333333 * panjang * panjang * tinggiLimas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

}

