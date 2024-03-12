import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah DATA Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda: ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.print("Masukan nama mahasiswa: ");
                scanner.nextLine(); // Consume newline
                String name = scanner.nextLine();

                String nim;
                while (true) {
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = scanner.nextLine();
                    if (nim.matches("\\d{15}")) {
                        break;
                    } else {
                        System.out.println("NIM Harus 15 Digit!!!");
                    }
                }

                System.out.print("Masukkan jurusan mahasiswa: ");
                String major = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(name, nim, major);
                mahasiswaList.add(mahasiswa);
                System.out.println("Data mahasiswa berhasl di tambah.");

            } else if (userChoice == 2) {
                System.out.println("\nData Mahasiswa:");
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    System.out.println(mahasiswa);
                }
            } else if (userChoice == 3) {
                System.out.println("Adios");
                break;
            } else {
                System.out.println("\nInvalid option, please try again.");
            }
        }

        scanner.close();
    }
}