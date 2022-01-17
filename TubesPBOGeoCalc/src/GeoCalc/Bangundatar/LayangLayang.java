package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class LayangLayang extends BangunDatar {
    double sisiPendek;
    double sisipanjang;
    double Diagonal1;
    double Diagonal2;

    public double luas(){
        return 0.5*Diagonal1*Diagonal2;
    }

    public double keliling(){
        return 2*(sisiPendek+sisipanjang);
    }

    public void setSisiPendek(double sisiPendek) {
        this.sisiPendek = sisiPendek;
    }

    public void setSisipanjang(double sisipanjang) {
        this.sisipanjang = sisipanjang;
    }

    public void setDiagonal1(double diagonal1) {
        Diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        Diagonal2 = diagonal2;
    }
}
