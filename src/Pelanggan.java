import java.text.SimpleDateFormat;
import java.util.Date;

public class Pelanggan implements Minimarketnya {

    
public String namaPelanggan;
public String kodeBarang;

public Pelanggan (String namaPelanggan, String kodeBarang) {
    this.namaPelanggan = namaPelanggan;
    this.kodeBarang = kodeBarang;

     Date time = new Date();

     SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy");
     SimpleDateFormat waktu = new SimpleDateFormat("HH : mm : ss");
     String format = tanggal.format(time);
     String String = waktu.format(time);

     System.out.println("Tanggal\t : " + format);
     System.out.println("Waktu\t : " + String);

}

@Override
public void cetakStruk() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cetakStruk'");
}

@Override
public Integer totalBayar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
}
}
 