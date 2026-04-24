package com.mycompany.tugas02;

import java.text.NumberFormat;
import java.util.Locale;

public class Produk {
    private String namaProduk;
    private int harga;

    public Produk() {
        this.namaProduk = "Tidak diketahui";
        this.harga = 0;
    }

    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    private String formatRupiah(int angka) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getInstance(indonesia);
        return format.format(angka);
    }

    public void tampilkanProduk() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + formatRupiah(harga));
    }

    public String hitungDiskon(int persen) {
        int hasil = harga - (harga * persen / 100);
        return "Rp" + formatRupiah(hasil);
    }
}