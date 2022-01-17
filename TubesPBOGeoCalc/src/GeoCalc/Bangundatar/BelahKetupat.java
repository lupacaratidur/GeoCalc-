package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class BelahKetupat extends BangunDatar {
    double Diagonal1;
    double Diagonal2;
    double sisi;

    public double luas(){
        return 0.5*Diagonal1*Diagonal2;
    }

    public double keliling(){
        return 4*sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setDiagonal1(double diagonal1) {
        Diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        Diagonal2 = diagonal2;
    }
}
