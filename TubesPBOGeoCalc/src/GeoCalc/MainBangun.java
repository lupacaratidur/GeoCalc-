package GeoCalc;

import GeoCalc.Bangundatar.*;
import GeoCalc.Bangunruang.*;

import java.util.Scanner;

public class MainBangun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int proses = 0;

        BelahKetupat belahKetupat = new BelahKetupat();
        JajarGenjang jajarGenjang = new JajarGenjang();
        LayangLayang layangLayang = new LayangLayang();
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        Trapesium trapesium = new Trapesium();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Kerucut kerucut = new Kerucut();
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat();
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        Tabung tabung = new Tabung();
            do {
                try {
                    System.out.println("----------Selamat datang di GeoCalc----------");
                    System.out.println("---------------Silahkan pilih------------ ");
                    System.out.println("1. Bangun Ruang");
                    System.out.println("2. Bangun Datar");
                    System.out.print("Masukan pilihan -> ");
                    int pilihBangun = scanner.nextInt();
                    scanner.nextLine();


                    switch (pilihBangun) {
                        case 1:
                            System.out.println();
                            System.out.println("----------BANGUN RUANG----------");
                            System.out.println("1. Kubus");
                            System.out.println("2. Balok");
                            System.out.println("3. Kerucut");
                            System.out.println("4. Tabung");
                            System.out.println("5. Prisma Segitiga");
                            System.out.println("6. limas Segitiga");
                            System.out.println("7. limas Segiempat");
                            System.out.print("Masukan pilihan -> ");

                            int pilihan = scanner.nextInt();
                            scanner.nextLine();
                            switch (pilihan) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");

                                    int pilihan2 = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (pilihan2) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan sisi = ");
                                            double sisi = scanner.nextInt();
                                            kubus.setSisi(sisi);
                                            System.out.println("volumenya adalah = " + kubus.Volume());
                                            break;
                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan sisi = ");
                                            double sisi2 = scanner.nextInt();
                                            kubus.setSisi(sisi2);
                                            System.out.println("Luas permukaannya adalah = " + kubus.luasPermukaan());
                                            break;

                                    }
                                    break;


                                case 2:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan3 = scanner.nextInt();
                                    switch (pilihan3) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Panjang\t= ");
                                            double panjang = scanner.nextInt();
                                            balok.setPanjang(panjang);
                                            System.out.print("Masukan Lebar\t= ");
                                            double lebar = scanner.nextInt();
                                            balok.setLebar(lebar);
                                            System.out.print("Masukan Tinggi\t= ");
                                            double tinggi = scanner.nextInt();
                                            balok.setTinggi(tinggi);
                                            System.out.println("volumenya adalah = " + balok.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Panjang = ");
                                            double panjang1 = scanner.nextInt();
                                            balok.setPanjang(panjang1);
                                            System.out.print("Masukan Lebar = ");
                                            double lebar1 = scanner.nextInt();
                                            balok.setLebar(lebar1);
                                            System.out.print("Masukan Tinggi = ");
                                            double tinggi1 = scanner.nextInt();
                                            balok.setTinggi(tinggi1);
                                            System.out.println("Luas permukaannya adalah = " + balok.luasPermukaan());
                                            break;
                                    }
                                    break;


                                case 3:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan4 = scanner.nextInt();
                                    switch (pilihan4) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Jari-jari\t= ");
                                            double jarijari = scanner.nextInt();
                                            kerucut.setJarijari(jarijari);
                                            System.out.print("Masukan Tinggi\t\t= ");
                                            double tinggi = scanner.nextInt();
                                            kerucut.setTinggi(tinggi);
                                            System.out.println("volumenya adalah = " + kerucut.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Jari-jari\t= ");
                                            double jarijari1 = scanner.nextInt();
                                            kerucut.setJarijari(jarijari1);
                                            System.out.print("Masukan Sisi\t\t= ");
                                            double sisi = scanner.nextInt();
                                            balok.setTinggi(sisi);
                                            System.out.println("Luas permukaannya adalah = " + kerucut.luasPermukaan());
                                            break;
                                    }
                                    break;


                                case 4:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan5 = scanner.nextInt();
                                    switch (pilihan5) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Jari-jari\t= ");
                                            double jarijari = scanner.nextInt();
                                            tabung.setJarijari(jarijari);
                                            System.out.print("Masukan Tinggi\t\t= ");
                                            double tinggi = scanner.nextInt();
                                            tabung.setTinggi(tinggi);
                                            System.out.println("volumenya adalah = " + tabung.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Jari-jari\t= ");
                                            double jarijari1 = scanner.nextInt();
                                            tabung.setJarijari(jarijari1);
                                            System.out.print("Masukan Sisi\t\t= ");
                                            double sisi = scanner.nextInt();
                                            tabung.setTinggi(sisi);
                                            System.out.println("Luas permukaannya adalah = " + tabung.luasPermukaan());
                                            break;
                                    }
                                    break;


                                case 5:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan6 = scanner.nextInt();
                                    switch (pilihan6) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Sisinya\t\t\t\t= ");
                                            double sisi = scanner.nextInt();
                                            prismaSegitiga.setSisi(sisi);
                                            System.out.print("Masukan Tinggi Prismanya\t= ");
                                            double tinggi1 = scanner.nextInt();
                                            prismaSegitiga.setTinggiPrisma(tinggi1);
                                            System.out.print("Masukan Tinggi Segitiganya\t= ");
                                            double tinggi2 = scanner.nextInt();
                                            prismaSegitiga.setTinggiSegitiga(tinggi2);
                                            System.out.print("Masukan Alasnya\t\t\t\t= ");
                                            double alas = scanner.nextInt();
                                            prismaSegitiga.setAlas(alas);
                                            System.out.println("volumenya adalah = " + prismaSegitiga.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Sisinya\t\t\t\t= ");
                                            double sisi1 = scanner.nextInt();
                                            prismaSegitiga.setSisi(sisi1);
                                            System.out.print("Masukan Tinggi Prismanya\t= ");
                                            double tinggi3 = scanner.nextInt();
                                            prismaSegitiga.setTinggiPrisma(tinggi3);
                                            System.out.print("Masukan Tinggi Segitiganya\t= ");
                                            double tinggi4 = scanner.nextInt();
                                            prismaSegitiga.setTinggiSegitiga(tinggi4);
                                            System.out.print("Masukan Alasnya\t\t\t\t= ");
                                            double alas1 = scanner.nextInt();
                                            prismaSegitiga.setAlas(alas1);
                                            System.out.println("Luas permukaannya adalah = " + prismaSegitiga.luasPermukaan());
                                            break;

                                    }
                                    break;


                                case 6:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan7 = scanner.nextInt();
                                    switch (pilihan7) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Alasnya\t\t\t\t= ");
                                            double alas = scanner.nextInt();
                                            limasSegitiga.setAlas(alas);
                                            System.out.print("Masukan Tinggi Segitiganya\t= ");
                                            double tinggi = scanner.nextInt();
                                            limasSegitiga.setTinggiSegitiga(tinggi);
                                            System.out.print("Masukan Tinggi Limasnya\t\t= ");
                                            double tinggi1 = scanner.nextInt();
                                            limasSegitiga.setTinggiLimas(tinggi1);
                                            System.out.println("volumenya adalah = " + limasSegitiga.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Alasnya\t\t\t\t= ");
                                            double alas1 = scanner.nextInt();
                                            limasSegitiga.setAlas(alas1);
                                            System.out.print("Masukan Tinggi Segitiganya\t= ");
                                            double tinggi2 = scanner.nextInt();
                                            limasSegitiga.setTinggiSegitiga(tinggi2);
                                            System.out.print("Masukan Tinggi Limasnya\t\t= ");
                                            double tinggi3 = scanner.nextInt();
                                            limasSegitiga.setTinggiLimas(tinggi3);
                                            System.out.println("Luas permukaannya adalah = " + limasSegitiga.luasPermukaan());
                                            break;
                                    }
                                    break;


                                case 7:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung volume");
                                    System.out.println("2. Hitung Luas permukaan");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilihan8 = scanner.nextInt();
                                    switch (pilihan8) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Panjang\t= ");
                                            double panjang = scanner.nextInt();
                                            limasSegiEmpat.setPanjang(panjang);
                                            System.out.print("Masukan Tinggi Limasnya\t= ");
                                            double tinggi = scanner.nextInt();
                                            limasSegiEmpat.setTinggiLimas(tinggi);
                                            System.out.println("volumenya adalah = " + limasSegiEmpat.Volume());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Panjang \t\t\t\t= ");
                                            double panjang1 = scanner.nextInt();
                                            limasSegiEmpat.setPanjang(panjang1);
                                            System.out.print("Masukan Tinggi Segitiganya\t= ");
                                            double tinggi1 = scanner.nextInt();
                                            limasSegiEmpat.setTinggiSegitiga(tinggi1);
                                            System.out.print("Masukan Tinggi Limasnya\t= ");
                                            double tinggi2 = scanner.nextInt();
                                            limasSegiEmpat.setTinggiLimas(tinggi2);
                                            System.out.println("Luas permukaannya adalah = " + limasSegiEmpat.luasPermukaan());
                                            break;
                                    }
                                    break;
                            }
                            break;



                        case 2:
                            System.out.println();
                            System.out.println("----------BANGUN DATAR----------");
                            System.out.println("1. Persegi");
                            System.out.println("2. Persegi Panjang");
                            System.out.println("3. Segitiga");
                            System.out.println("4. Lingkaran");
                            System.out.println("5. Belah Ketupat");
                            System.out.println("6. Layang-layang");
                            System.out.println("7. Jajar Genjang");
                            System.out.println("8. Trapesium");
                            System.out.print("Masukan pilihan -> ");
                            int pilihpilih = scanner.nextInt();

                            switch (pilihpilih) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih = scanner.nextInt();

                                    switch (pilih) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan sisi = ");
                                            double sisi = scanner.nextInt();
                                            persegi.setSisi(sisi);
                                            System.out.println("Luasnya adalah = " + persegi.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan sisi = ");
                                            double sisi1 = scanner.nextInt();
                                            persegi.setSisi(sisi1);
                                            System.out.println("Luasnya adalah = " + persegi.keliling());
                                            break;

                                    }
                                    break;


                                case 2:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih1 = scanner.nextInt();

                                    switch (pilih1) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Panjang\t= ");
                                            double panjang = scanner.nextInt();
                                            persegiPanjang.setPanjang(panjang);
                                            System.out.print("Masukan Lebar\t= ");
                                            double lebar = scanner.nextInt();
                                            persegiPanjang.setLebar(lebar);
                                            System.out.println("Luasnya adalah = " + persegiPanjang.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Panjang\t= ");
                                            double panjang1 = scanner.nextInt();
                                            persegiPanjang.setPanjang(panjang1);
                                            System.out.print("Masukan Lebar\t= ");
                                            double lebar1 = scanner.nextInt();
                                            persegiPanjang.setLebar(lebar1);
                                            System.out.println("Kelilingnya adalah = " + persegiPanjang.keliling());
                                            break;
                                    }
                                    break;


                                case 3:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih2 = scanner.nextInt();

                                    switch (pilih2) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Alas\t= ");
                                            double alas = scanner.nextInt();
                                            segitiga.setAlas(alas);
                                            System.out.print("Masukan Tinggi\t= ");
                                            double tinggi = scanner.nextInt();
                                            segitiga.setTinggi(tinggi);
                                            System.out.println("Luasnya adalah = " + segitiga.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Alas\t= ");
                                            double alas1 = scanner.nextInt();
                                            segitiga.setAlas(alas1);
                                            System.out.println("Luasnya adalah = " + segitiga.keliling());
                                            break;
                                    }
                                    break;


                                case 4:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih3 = scanner.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Jari-Jari\t= ");
                                            double jari = scanner.nextInt();
                                            lingkaran.setJarijari(jari);
                                            System.out.println("Luasnya adalah = " + lingkaran.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Jari-Jari\t= ");
                                            double jari1 = scanner.nextInt();
                                            lingkaran.setJarijari(jari1);
                                            System.out.println("Luasnya adalah = " + lingkaran.keliling());
                                            break;
                                    }
                                    break;


                                case 5:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih4 = scanner.nextInt();

                                    switch (pilih4) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Diagonal 1\t= ");
                                            double d1 = scanner.nextInt();
                                            belahKetupat.setDiagonal1(d1);
                                            System.out.print("Masukan Diagonal 1\t= ");
                                            double d2 = scanner.nextInt();
                                            belahKetupat.setDiagonal2(d2);
                                            System.out.println("Luasnya adalah = " + belahKetupat.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Sisinya\t= ");
                                            double sisi = scanner.nextInt();
                                            belahKetupat.setSisi(sisi);
                                            System.out.println("Luasnya adalah = " + belahKetupat.keliling());
                                            break;
                                    }
                                    break;


                                case 6:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih5 = scanner.nextInt();

                                    switch (pilih5) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Diagonal 1\t= ");
                                            double d1 = scanner.nextInt();
                                            layangLayang.setDiagonal1(d1);
                                            System.out.print("Masukan Diagonal 1\t= ");
                                            double d2 = scanner.nextInt();
                                            layangLayang.setDiagonal2(d2);
                                            System.out.println("Luasnya adalah = " + layangLayang.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Sisi Pendek\t= ");
                                            double sisip = scanner.nextInt();
                                            layangLayang.setSisiPendek(sisip);
                                            System.out.print("Masukan Sisi Panjang\t= ");
                                            double sisipp = scanner.nextInt();
                                            layangLayang.setSisiPendek(sisipp);
                                            System.out.println("Kelilingnya adalah = " + layangLayang.keliling());
                                            break;
                                    }
                                    break;


                                case 7:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih6 = scanner.nextInt();

                                    switch (pilih6) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Alas\t= ");
                                            double alas = scanner.nextInt();
                                            jajarGenjang.setAlas(alas);
                                            System.out.print("Masukan Tinggi\t= ");
                                            double tinggi = scanner.nextInt();
                                            jajarGenjang.setTinggi(tinggi);
                                            System.out.println("Luasnya adalah = " + jajarGenjang.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Alas\t= ");
                                            double alas1 = scanner.nextInt();
                                            jajarGenjang.setAlas(alas1);
                                            System.out.print("Masukan Sisi Miring\t= ");
                                            double sisim = scanner.nextInt();
                                            jajarGenjang.setSisiMiring(sisim);
                                            System.out.println("Kelilingnya adalah = " + jajarGenjang.keliling());
                                            break;
                                    }
                                    break;


                                case 8:
                                    System.out.println();
                                    System.out.println("Silahkan pilih");
                                    System.out.println("1. Hitung luas");
                                    System.out.println("2. Hitung keliling");
                                    System.out.print("Masukan pilihan -> ");
                                    int pilih7 = scanner.nextInt();

                                    switch (pilih7) {
                                        case 1:
                                            System.out.println();
                                            System.out.print("Masukan Sisi Pendek\t= ");
                                            double pendek = scanner.nextInt();
                                            trapesium.setSisiPendek(pendek);
                                            System.out.print("Masukan Sisi Panjang\t= ");
                                            double panjang = scanner.nextInt();
                                            trapesium.setSisiPanjang(panjang);
                                            System.out.println("Masukan Tinggi = ");
                                            double tinggi = scanner.nextInt();
                                            trapesium.setTinggi(tinggi);
                                            System.out.println("Luasnya adalah = " + trapesium.luas());
                                            break;

                                        case 2:
                                            System.out.println();
                                            System.out.print("Masukan Sisi Panjang\t= ");
                                            double pjg = scanner.nextInt();
                                            trapesium.setSisiPanjang(pjg);
                                            System.out.println("Masukan Sisi Pendek\t= ");
                                            double pdk = scanner.nextInt();
                                            trapesium.setSisiPendek(pdk);
                                            System.out.print("Masukan Sisi Miring\t= ");
                                            double sisimrg = scanner.nextInt();
                                            trapesium.setSisiMiring(sisimrg);
                                            System.out.println("Kelilingnya adalah = " + trapesium.keliling());
                                            break;
                                    }
                                    break;

                            }
                    }
                } catch (Exception d) {
                    System.out.println("INPUTKAN ANGKA!");
                }
                try {
                    System.out.print("\nHITUNG LAGI ? tekan 0");
                    System.out.print("\nUDAHAN ? tekan 1");
                    System.out.println();
                    System.out.print("-> ");
                    proses = scanner.nextInt();
                    scanner.nextLine();
                    ++proses;

                } catch (Exception dd){
                    System.out.println("INPUTKAN ANGKA! WOY");
                }
                System.out.println();

            } while (proses <= 1);
    }
}

