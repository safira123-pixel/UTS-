
public class Transaksi {
    Double saldo(double s){
        double saldo = s;
        return saldo;
    }
    
    Double saldoAwal(double s){
        double saldoAwal = s;
        return saldoAwal;
    }
    
    Double saldoAkhir(double sak){
        double saldoAkhir = sak;
        return saldoAkhir;
    }
    
    String tanggalTransaksi(String tt){
        String tanggalTransaksi = tt;
       return tanggalTransaksi;
    }
    
    Rekening r[] = new Rekening[5];
   int idx;
   
   void tambah(Rekening rk){
       if(idx < r.length){
           r[idx] = rk;
           idx++;
       } else {
           System.out.println("Data sudah penuh !!");
       }
   }
   
   void tampilRekening(){
       for(Rekening rk : r){
           rk.tampil();
           System.out.println("-------------------------------");
           
       }
   }
   
 void tampilTransaksi(){
       for(Rekening rk : r){
           rk.tampilTransaksi();
           System.out.println("-------------------------------");
           
       }
   }
   
   
   public int FindSeqSearch (int cari){
      int posisi = -1;
      for(int j = 0; j < r.length; j++){
          if(r[j].saldo== cari){
              posisi  = j;
              break;
          }
      }
      return posisi;
  }
   
    public void tampilData(int pos){
      if (pos!= -1){
          System.out.println("No Rekening : "+r[pos].noRekening);
        System.out.println("Nama Depan : "+r[pos].namaDepan);
         System.out.println("Nama Belakang : "+r[pos].namaBelakang);
         System.out.println("No telepon : "+r[pos].phone);
        System.out.println("Email : "+r[pos].email);
        System.out.println("saldo : "+r[pos].saldo);
        System.out.println("Saldo awal : "+r[pos].saldoAwal);
        System.out.println("Saldo akhir : "+r[pos].saldoAkhir);
        System.out.println("Tanggal transaksi : "+r[pos].tanggalTransaksi);
        
      } else {
          System.out.println("data tidak ditemukan");
      }
  }
   
   void bubleShort(){
       for(int i = 0; i < r.length - 1; i++){
           for( int j = 1; j < r.length - i; j++){
               if( r[i].namaDepan > r[j-1].namaDepan){
                   Rekening tmp = r[i];
                   r[i] = r[j];
                   r[j] = tmp;
               } else {
               }
           }
       }
   }
    
}
