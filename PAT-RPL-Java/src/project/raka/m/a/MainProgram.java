package project.raka.m.a;

import project.raka.m.a.module.Program;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        // Buat Variable untuk Pilihan Program serta penampung inputan Nilai A & B, default beri nilai 0 (handle null exception pointer)
        int pilihProgram = 0;
        int nilai_a = 0;
        int nilai_b = 0;

        // Tambahkan Module Scanner untuk membaca inputan
        Scanner inputScan = new Scanner(System.in);

        // Buat Menu tampilan dan Menerima inputan Pilihan Program
        System.out.println("Pilih Program Matematika");
        System.out.println("=============================");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("=============================");
        System.out.print("Masukan pilihan [1-4] : ");
        pilihProgram = inputScan.nextInt();

        // Inisial dan Deklarasikan Kelas, agar dapat memanggil module di kelas tersebut di kelas ini
        Program initProgram = new Program();

        if (pilihProgram == 1) {
            System.out.println("=============================");
            System.out.println("Program terpilih Penjumlahan");
            System.out.println("=============================");
            // Buat inputan nilai A & B
            System.out.print("Masukan Nilai A : ");
            nilai_a = inputScan.nextInt();
            System.out.print("Masukan Nilai B : ");
            nilai_b = inputScan.nextInt();

            // Panggil Program Matematika : Penjumlahan
            initProgram.moduleMath(pilihProgram, nilai_a, nilai_b);
            System.out.println("Program Selesai");
            System.out.println("=============================");
        }
        if (pilihProgram == 2) {
            System.out.println("=============================");
            System.out.println("Program terpilih Pengurangan");
            System.out.println("=============================");
            // Buat inputan nilai A & B
            System.out.print("Masukan Nilai A : ");
            nilai_a = inputScan.nextInt();
            System.out.print("Masukan Nilai B : ");
            nilai_b = inputScan.nextInt();

            // Panggil Program Matematika : Penjumlahan
            initProgram.moduleMath(pilihProgram, nilai_a, nilai_b);
            System.out.println("Program Selesai");
            System.out.println("=============================");
        }
        if (pilihProgram == 3) {
            System.out.println("=============================");
            System.out.println("Program terpilih Perkalian");
            System.out.println("=============================");
            // Buat inputan nilai A & B
            System.out.print("Masukan Nilai A : ");
            nilai_a = inputScan.nextInt();
            System.out.print("Masukan Nilai B : ");
            nilai_b = inputScan.nextInt();

            // Panggil Program Matematika : Penjumlahan
            initProgram.moduleMath(pilihProgram, nilai_a, nilai_b);
            System.out.println("Program Selesai");
            System.out.println("=============================");
        }
        if (pilihProgram == 4) {
            System.out.println("=============================");
            System.out.println("Program terpilih Pembagian");
            System.out.println("=============================");
            // Buat inputan nilai A & B
            System.out.print("Masukan Nilai A : ");
            nilai_a = inputScan.nextInt();
            System.out.print("Masukan Nilai B : ");
            nilai_b = inputScan.nextInt();

            // Panggil Program Matematika : Penjumlahan
            initProgram.moduleMath(pilihProgram, nilai_a, nilai_b);
            System.out.println("Program Selesai");
            System.out.println("=============================");
        }

    }
}
