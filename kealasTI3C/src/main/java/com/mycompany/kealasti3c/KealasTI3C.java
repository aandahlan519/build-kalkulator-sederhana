/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kealasti3c;

import java.util.Scanner;

/**
 *
 * @author FUJITSU
 */
public class KealasTI3C {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== KALKULATOR ===");

        while (true) {
            System.out.println();
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            if (!INPUT.hasNextLine()) {
                break;
            }

            String pilihan = INPUT.nextLine().trim();
            if ("0".equals(pilihan)) {
                break;
            }
            if (!"1".equals(pilihan) && !"2".equals(pilihan)
                    && !"3".equals(pilihan) && !"4".equals(pilihan)) {
                System.out.println("Pilihan tidak tersedia. Masukkan angka 0 sampai 4.");
                continue;
            }

            Double angkaPertama = bacaAngka("Masukkan angka pertama: ");
            if (angkaPertama == null) {
                break;
            }

            Double angkaKedua = bacaAngka("Masukkan angka kedua: ");
            if (angkaKedua == null) {
                break;
            }

            if ("4".equals(pilihan) && angkaKedua == 0.0) {
                System.out.println("Error: angka tidak dapat dibagi dengan nol.");
                continue;
            }

            double hasil;
            switch (pilihan) {
                case "1":
                    hasil = penjumlahan(angkaPertama, angkaKedua);
                    break;
                case "2":
                    hasil = pengurangan(angkaPertama, angkaKedua);
                    break;
                case "3":
                    hasil = perkalian(angkaPertama, angkaKedua);
                    break;
                default:
                    hasil = pembagian(angkaPertama, angkaKedua);
                    break;
            }

            if (!Double.isFinite(hasil)) {
                System.out.println("Error: hasil berada di luar jangkauan kalkulator.");
                continue;
            }

            System.out.println("Hasil: " + hasil);
        }

        System.out.println("Kalkulator ditutup.");
    }

    private static Double bacaAngka(String pesan) {
        while (true) {
            System.out.print(pesan);
            if (!INPUT.hasNextLine()) {
                return null;
            }

            String teks = INPUT.nextLine().trim().replace(',', '.');
            try {
                double angka = Double.parseDouble(teks);
                if (Double.isFinite(angka)) {
                    return angka;
                }
            } catch (NumberFormatException e) {
                // Tampilkan pesan validasi di bawah dan minta masukan ulang.
            }
            System.out.println("Masukan tidak valid. Masukkan angka yang benar.");
        }
    }

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static double perkalian(double a, double b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        return a / b;
    }

    public static int penngurangan(int a, int b) {
        return pengurangan(a, b);
    }

    public static void biodata(String nama) {
        System.out.println("__________");
        System.out.println("Nama " + nama);
        System.out.println("__________");
    }
}
