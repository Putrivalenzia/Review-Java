package com.juaracoding;

public class NomorDua {
    public static void main(String[] args) {
        // Inisialisasi objek StringBuilder untuk menyimpan pola
        StringBuilder print = new StringBuilder();

        // Loop pertama untuk mengisi StringBuilder
        for (int i = 1; i <= 9; i ++) {
            if (i % 2 == 0) {
                // Jika i genap, tambahkan underscore ke StringBuilder
                print.append("_");
            } else {
                // Jika i ganjil, tambahkan nilai i ke StringBuilder
                print.append(i);
            }
        }

        // Cetak pola hasil dari loop pertama
        System.out.println(print);

        // Loop kedua untuk menghapus karakter pertama dan terakhir secara berulang
        for (int i = 0; i < 9 / 2; i++) {
            // Panggil metode removeFirstAndLast() untuk mengubah Print
            print = removeFirstAndLast(print);
            // Cetak hasil dari perubahan strPrint
            System.out.println(print);
        }
    }

    // Metode untuk menghapus karakter pertama dan terakhir dari StringBuilder
    public static StringBuilder removeFirstAndLast(StringBuilder strBuilder) {
        // Menggunakan substring untuk mengambil potongan string
        return new StringBuilder(strBuilder.substring(1, strBuilder.length() - 1));
    }
}
