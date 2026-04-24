package com.mycompany.tugas02;

public class Main {
    public static void main(String[] args) {

        Produk p1 = new Produk();
        Produk p2 = new Produk("Laptop", 8000000);

        p1.tampilkanProduk();
        System.out.println();

        p2.tampilkanProduk();
        System.out.println();

        System.out.println("Harga setelah diskon 10%: " + p2.hitungDiskon(10));
    }
}