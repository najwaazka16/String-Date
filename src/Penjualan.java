
public class Penjualan extends Pelanggan { 

    public String noFaktur;
    public String namaBarang;
    public String alamat;
    public double hargaBarang;
    public Integer jumlahBeli;
    public double totalBayar;
    public String kasir;
    public static Integer faktur;

 
    public Penjualan (String namaPelanggan, String noFaktur, String kodeBarang,String namaBarang, double hargaBarang, Integer jumlahBeli, String alamat, String kasir) {
        super(namaPelanggan, kodeBarang);
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
        this.alamat = alamat;
        this.kasir = kasir;
        this.totalBayar = hitungTotalBayar();

        cetakStruk();
    }

    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }


    public void cetakStruk(){
        System.out.println("====================================");
        System.out.println("Minimarket BB");
        System.out.println("====================================");
        System.out.println("DATA PELANGGAN");
        System.out.println("------------------------------------");
        System.out.println("nama pelanggan : " + namaPelanggan);
        System.out.println("Alamat         : " + alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------------");
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : Rp." + hargaBarang + " * " + jumlahBeli + " = " + totalBayar);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Bayar  : " + totalBayar);
        System.out.println("========================================");
        System.out.println("Kasir :" + kasir);
        System.out.println("TERIMA KASIH SUDAH BERBELANJA DI MINIMARKET INI");


    }
}


