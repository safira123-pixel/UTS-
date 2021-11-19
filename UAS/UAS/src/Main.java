
import java.util.Scanner;


public class Main {
    int jenis;
    int cc;
    int pajak;
    int denda;
    
   int hitungPajak( int jenis, int cc){
       if(jenis == 1){
           if(cc < 100){
               pajak = 100000;
           } else if( cc > 100 && cc < 250 ){
               pajak = 250000;
           } else if( cc > 250 ){
               pajak = 500000;
           } else {
               if( cc < 1000){
                   pajak = 750000;
               } else if( cc > 1000 && cc < 2500){
                   pajak = 1000000;
               } else if( cc > 2500){
                   pajak = 1500000;
               }
           }
       }
       return pajak;
   }
   
   void denda(int bulanbayar){
        int bulanHarusbayar = 0;
       if (bulanbayar == bulanHarusbayar ){
           denda = 0;
       } else if(bulanbayar <= 3){
           denda = 5000;
       } else if(bulanbayar > 3){
           denda = bulanbayar*5000;
       }
   }
    
    static void dataKendaraan(){
        Kendaraan[] kArray = new Kendaraan[4];
        kArray[0] = new Kendaraan();
        kArray[0].TNKB = ("BB 23 ADB");
        kArray[0].nama = ("Avanza");
        kArray[0].jenis = (2);
        kArray[0].cc = (1500);
        kArray[0].tahun = (2020);
        kArray[0].bulanHarusBayar = (2);
        
        kArray[1] = new Kendaraan();
        kArray[1].TNKB = ("AS 19 SSD");
        kArray[1].nama = ("Ayla");
        kArray[1].jenis = (2);
        kArray[1].cc = (1000);
        kArray[1].tahun = (2020);
        kArray[1].bulanHarusBayar = (4);
        
        kArray[2] = new Kendaraan();
        kArray[2].TNKB = ("AF 15 UIP");
        kArray[2].nama = ("Beat");
        kArray[2].jenis = (1);
        kArray[2].cc = (100);
        kArray[2].tahun = (2020);
        kArray[2].bulanHarusBayar = (4);
        
        kArray[3] = new Kendaraan();
        kArray[3].TNKB = ("AD 14 HON");
        kArray[3].nama = ("Honda");
        kArray[3].jenis = (1);
        kArray[3].cc = (100);
        kArray[3].tahun = (2020);
        kArray[3].bulanHarusBayar = (4);
          
    }
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println();
    }
}