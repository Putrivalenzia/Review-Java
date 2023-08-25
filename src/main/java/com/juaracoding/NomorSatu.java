package com.juaracoding;

public class NomorSatu {
    public static void main(String[] args) {
        // Menampilkan Angka 1 sampai 100 Dengan Menggunakan Perulangan For
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Jika angka merupakan kelipatan 3 dan 5, maka akan dicetak kata "BIZZBUZZ"
                System.out.println(i + " BIZZBUZZ");
            } else if (i % 3 == 0) { // Jika angka merupakan kelipatan 3, maka akan dicetak kata "BIZZ"
                System.out.println(i + " BIZZ");
            } else if (i % 5 == 0) { // Jika angka merupakan kelipatan 5, maka akan dicetak kata "BUZZ"
                System.out.println(i + " BUZZ");
            } else { // Selain angka yang berkelipatan 3 dan 5, maka akan ditampilakan angka
                System.out.println(i);
            }
        }
    }
}
