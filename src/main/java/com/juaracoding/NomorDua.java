package com.juaracoding;

public class NomorDua {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris

        for (int i = 1; i <= n; i++) {
            // Cetak garis bawah jika baris saat ini genap
            if (i % 2 == 0) {
                System.out.print("_");
            }

            // Cetak angka-angka
            for (int j = 1; j <= n - i + 1; j += 2) {
                System.out.print(j + (i - 1) * 2);

                if (j < n - i + 1) {
                    System.out.print("_");
                }
            }

            // Cetak garis bawah di akhir baris jika perlu
            if ((n - i + 1) % 2 == 0) {
                System.out.print("_");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}




