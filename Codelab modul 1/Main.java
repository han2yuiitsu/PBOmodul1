import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenisKelamin, tglLahir;

//      Untuk memasukkan data
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Jenis kelamin (P/L):");
        jenisKelamin = input.nextLine();
        System.out.print("Tanggal lahir (yyyy-mm-dd) :");
        tglLahir = input.nextLine();

//      Menghitung Umur
        LocalDate lahir = LocalDate.parse(tglLahir);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(lahir, sekarang);

        System.out.println("--Output--");
        System.out.println("Nama : " + nama);
        System.out.print("Jenis Kelamin : ");
        if(jenisKelamin.equalsIgnoreCase("P")){
            System.out.println("Perempuan");
        }else{
            System.out.println("Laki-laki");
        }
        System.out.println("Umur Anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan");
    }
}