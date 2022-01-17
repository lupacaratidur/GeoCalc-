package GeoCalc.Bangunruang;

import GeoCalc.BangunRuang;

public class PrismaSegitiga extends BangunRuang {
    double sisi;
    double tinggiPrisma;
    double alas;
    double tinggiSegitiga;

    public double luasPermukaan(){
        return (sisi+sisi+sisi)*tinggiPrisma+alas*tinggiSegitiga;
    }

    public double Volume(){
        return 0.5*alas*tinggiSegitiga*tinggiPrisma;
    }


    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }
}
