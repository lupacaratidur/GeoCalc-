package GeoCalc.Bangundatar;

import GeoCalc.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public double luas(){
        return panjang*lebar;
    }

    public double keliling(){
        return 2*(panjang*lebar);
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
