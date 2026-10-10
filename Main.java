import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("\n--- Pilihan Bangun Datar/Ruang ---");
            System.out.println("1. Bujur Sangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder/Tabung");
            System.out.println("4. Tes Polimorfisme");
            System.out.println("5. Selesai");
            System.out.print("Input pilihan: ");
            menu = in.nextInt();
            in.nextLine();

            if (menu == 1) {
                System.out.print("Warna: ");
                String w = in.nextLine();
                System.out.print("Sisi: ");
                double s = in.nextDouble();
                BujurSangkar bs = new BujurSangkar(s, w);
                bs.cetakAtribut();
            } else if (menu == 2) {
                System.out.print("Warna: ");
                String w = in.nextLine();
                System.out.print("Jari-jari: ");
                double r = in.nextDouble();
                Lingkaran lk = new Lingkaran(r, w);
                lk.cetakAtribut();
            } else if (menu == 3) {
                System.out.print("Warna: ");
                String w = in.nextLine();
                System.out.print("Jari-jari: ");
                double r = in.nextDouble();
                System.out.print("Tinggi: ");
                double t = in.nextDouble();
                Tabung tb = new Tabung(t, r, w);
                tb.cetakAtribut();
            } else if (menu == 4) {
                BentukGeometri[] daftarBentuk = {
                    new BujurSangkar(5, "Hijau"),
                    new Lingkaran(3.5, "Hitam"),
                    new Tabung(12, 4, "Putih")
                };
                for (BentukGeometri bg : daftarBentuk) {
                    bg.cetakAtribut();
                }
            }
        } while (menu != 5);

        in.close();
    }
}