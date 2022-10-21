import java.util.Scanner;

public class TaksAjiNurkholis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ini adalah type data
        int menu,sisi,bidang,bidang1, jari, panjang, lebar,alas,tinggi;
        boolean kembali = true;
        boolean kembali1 = true;

        //ini adalah perulangan
        while(kembali1) {

            //inputan program
            System.out.println("------------------------------------");
            System.out.println("kalkulator Penghitung Luas dan Volum");
            System.out.println("------------------------------------");
            System.out.println("Menu");
            System.out.println("1 Hitung Luas Bidang");
            System.out.println("2 Hitung Volum");
            System.out.println("0 Tutup Aplikasi");
            System.out.println("----------------------");
            System.out.print("Pilih Menu : ");
            menu = in.nextInt();

            //ini adalah kondisi
            if (menu == 0){
                System.out.println("Anda Keluar Gan !!!!!!");
                System.exit(0);
            }

            while (kembali) {

                //ini adalah memakai switch
                switch (menu) {
                    case 1:
                        System.out.println("--------------------------------");
                        System.out.println("Pilih Bidang Yang Akan di Hitung");
                        System.out.println("--------------------------------");
                        System.out.println("1. Persegi");
                        System.out.println("2. Persegi Panjang");
                        System.out.println("3. Lingkaran");
                        System.out.println("4. Segitiga");
                        System.out.println("0. Kembali Ke Menu Sebelumnya");
                        System.out.print("Pilihan Anda : ");
                        bidang = in.nextInt();
                        if (bidang == 1) {
                            System.out.println("--------------------------------");
                            System.out.println("     Anda Memilih Persegi");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Sisi : ");
                            sisi = in.nextInt();
                            System.out.println("Hasil Menghitung Persegi : " + persegi(sisi));
                        }
                        if (bidang == 2) {
                            System.out.println("--------------------------------");
                            System.out.println("  Anda Memilih Persegi Panjang");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Panjang : ");
                            panjang = in.nextInt();
                            System.out.print("Masukan Lebar   :");
                            lebar = in.nextInt();
                            System.out.print("Hasil Menghitung Persegi Panjang : " + PersegiPanjang(panjang, lebar));
                        }
                        if (bidang == 3) {
                            System.out.println("--------------------------------");
                            System.out.println("     Anda Memilih Lingkaran");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Jari-Jari : ");
                            jari = in.nextInt();
                            System.out.print("Hasil Menghitung Lingkaran : " + Lingkaran(jari));
                        } else if (bidang == 4) {
                            System.out.println("--------------------------------");
                            System.out.println("     Anda Memilih Segitiga");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Alas     : ");
                            alas = in.nextInt();
                            System.out.print("Masukan Tinggi : ");
                            tinggi = in.nextInt();
                            System.out.print("Hasil Menghitung Segitigas : " + Segitiga(alas, tinggi));
                        } else if (bidang == 0) {
                            kembali = false;
                        }
                        break;

                    case 2:
                        System.out.println("--------------------------------");
                        System.out.println("Pilih Volume Yang Akan di Hitung");
                        System.out.println("--------------------------------");
                        System.out.println("1. Kubus");
                        System.out.println("2. Balok");
                        System.out.println("3. Tabung");
                        System.out.println("0. Kembali Ke Menu Sebelumnya");
                        System.out.print("Pilihan Anda : ");
                        bidang1 = in.nextInt();
                        if (bidang1 == 1) {
                            System.out.println("--------------------------------");
                            System.out.println("     Anda Memilih Kubus");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Nilai Sisi : ");
                            sisi = in.nextInt();
                            System.out.print("Hasil Menghitung Kubus : " + Kubus(sisi));
                        } else if (bidang1 == 2) {
                            System.out.println("--------------------------------");
                            System.out.println("  Anda Memilih Balok");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan nilai Panjang : ");
                            panjang = in.nextInt();
                            System.out.print("Masukan Nilai Lebar   : ");
                            lebar = in.nextInt();
                            System.out.print("Masukan Nilai Tinggi  :");
                            tinggi = in.nextInt();
                            System.out.print("Hasil Menghitung Balok : " + Balok(panjang, lebar, tinggi));
                        } else if (bidang1 == 3) {
                            System.out.println("--------------------------------");
                            System.out.println("     Anda Memilih Tabung");
                            System.out.println("--------------------------------");
                            System.out.print("Masukan Nilai Tiinggi     : ");
                            tinggi = in.nextInt();
                            System.out.print("Masukan Nilai Jari-Jari : ");
                            jari = in.nextInt();
                            System.out.print("Hasil Menghitung Tabung : " + Tabung(tinggi, jari));
                        } if (bidang1 == 0) {
                        kembali = false;
                    }
                        break;
                }
            }
        }
    }

    //di sini method dan operasi matematk
    static int persegi(int sisi){
        return sisi * sisi;
    }
    public static int PersegiPanjang(int panjang, int lebar){
        int hasil;
        hasil = panjang * lebar;
        return hasil;
    }
    public static float Lingkaran(int jari){
        float luas;
        luas = (float) (3.14*jari*jari);
        return luas;
    }
    static float Segitiga(int alas, int tinggi) {
        float hasil;
        hasil = (float) (0.5 * alas * tinggi);
        return hasil;
    }
    static int Kubus(int sisi){
        return sisi*sisi*sisi;
    }
    static int Balok(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }
    static float Tabung(int tinggi, int jari){
        float hasil;
        hasil = (float) (3.14*tinggi*jari);
        return hasil;
    }
}
