
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String nama;
        String kodeBarang;
        String noFaktur = "Print";
        String namaBarang;
        Integer hargaBarga;
        Integer jumlahBeli;
        String alamat;
        String kasir;

        Scanner input = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        System.out.print("Nama Pelanggan: ");
        nama = input.next();
        System.out.print("Kode Barang: ");
        kodeBarang = input.next();
        System.out.print("Nama Barang: ");
        namaBarang = input.next();
        System.out.print("Harga Barang: ");
        hargaBarga = angka.nextInt();
        System.out.print("Jumlah Beli: ");
        jumlahBeli = angka.nextInt();
        System.out.print("alamat: ");
        alamat = input.next();
        System.out.print("kasir: ");
        kasir = input.next();

        Penjualan penjualan = new Penjualan(nama, kodeBarang, noFaktur, namaBarang, hargaBarga, jumlahBeli, alamat, kasir);
        
        angka.close();
        input.close();
    }
}