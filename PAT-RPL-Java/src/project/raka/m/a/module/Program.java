package project.raka.m.a.module;

public class Program {

    // Buat module / function (fungsi) public agar dapat diakses diluar kelas
    // Void artinya kosong. Fungsi yang diawali dengan kata kunci void memiliki makna fungsi tersebut tidak menghasilkan nilai yang dapat dikembalikan jika kita meng-assign fungsi tersebut ke sebuah variabel.
    public void moduleMath (int prgMath,int nilai_a, int nilai_b) {

        switch (prgMath) {
            case 1:
                // Formula / Rumus Penjumlahan
                int penjumlahan = nilai_a + nilai_b;

                // Output program
                System.out.println("=============================");
                System.out.println("Hasil " + nilai_a + " + " + nilai_b + " = " + penjumlahan);
                System.out.println("=============================");
                break;
            case 2:
                // Formula / Rumus Pengurangan
                int pengurangan = nilai_a - nilai_b;

                // Output program
                System.out.println("=============================");
                System.out.println("Hasil " + nilai_a + " - " + nilai_b + " = " + pengurangan);
                System.out.println("=============================");
                break;
            case 3:
                // Formula / Rumus Perkalian
                int perkalian = nilai_a * nilai_b;

                // Output program
                System.out.println("=============================");
                System.out.println("Hasil " + nilai_a + " x " + nilai_b + " = " + perkalian);
                System.out.println("=============================");
                break;
            case 4:
                // Formula / Rumus Pembagian
                int pembagian = nilai_a / nilai_b;

                // Output program
                System.out.println("=============================");
                System.out.println("Hasil " + nilai_a + " - " + nilai_b + " = " + pembagian);
                System.out.println("=============================");
                break;
        }
    }
}
