
public class Rekening {
   String noRekening;
   String namaDepan;
   String namaBelakang;
   String phone;
   String email;
   double saldo;
   double saldoAwal;
   double saldoAkhir;
   String tanggalTransaksi;

   
   void Rekening(String nk, String nd, String nb, String p, String e,double saw, double sak, String tt, double ss ){
       noRekening = nk;
       namaDepan = nd;
       namaBelakang = nb;
       phone = p;
       email = e;
       saldo = ss;
       saldoAwal = saw;
       saldoAkhir = sak;
       tanggalTransaksi = tt;
   }
    void tampil(){
        System.out.println("No rekening : "+noRekening);
        System.out.println("nama depan : "+namaDepan);
        System.out.println("nama belakang : "+namaBelakang);
        System.out.println("No telepon : "+phone);
        System.out.println("Email : "+email);
        
    }
    void tampilTransaksi(){
        System.out.println("No rekening : "+noRekening);
       System.out.println("saldo : "+saldo);
        System.out.println("Saldo awal : "+saldoAwal);
        System.out.println("Saldo akhir : "+saldoAkhir);
        System.out.println("Tanggal transaksi : "+tanggalTransaksi); 
    }
        
        
    }

