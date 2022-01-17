package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class Trapesium extends BangunDatar {
    double sisiPendek;
    double sisiPanjang;
    double sisiMiring;
    double tinggi;

    public double luas(){
        return 0.5*(sisiPanjang+sisiPendek)*tinggi;
    }

    public double keliling(){
        return sisiMiring+sisiMiring+sisiPendek+sisiPanjang;
    }

    public void setSisiPendek(double sisiPendek) {
        this.sisiPendek = sisiPendek;
    }

    public void setSisiPanjang(double sisiPanjang) {
        this.sisiPanjang = sisiPanjang;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
