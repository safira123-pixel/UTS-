
import java.util.Scanner;
public class MainTransaksi {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner sl = new Scanner (System.in);
        Transaksi t = new Transaksi();
        int jum = 5;
        
        for(int i = 0; i < jum; i++){
            System.out.println("----------------");
            System.out.print("No rekening: ");
            String noRekening = sl.nextLine();
            System.out.print("Nama depan : ");
            String namaDepan = sl.nextLine();
            System.out.print("Nama belakang : ");
            String namaBelakang = sl.nextLine();
            System.out.print("phone: ");
            String phone = sl.nextLine();
            System.out.print("email: ");
            String email = sl.nextLine();
            System.out.print("saldo: ");
            double saldo = s.nextDouble();
            System.out.print("Saldo awal : ");
            double saldoAwal = s.nextDouble();
            System.out.print("saldo akhir : ");
            double saldoAkhir = s.nextDouble();
            System.out.print("Tanggal transaksi: ");
            String tanggalTransaksi = sl.nextLine();
            
            Rekening r = new Rekening(noRekening, namaDepan, namaBelakang, phone, email, saldo, saldoAwal, saldoAkhir, tanggalTransaksi);
            t.tambah(r);

        }
        
        Scanner input = new Scanner(System.in); 
        for (int i = 1; i >= 1 ; i++) {        
        System.out.println("-UTS-");
        System.out.println("1. Tampil data rekening");
        System.out.println(" 2. Tampil data transaksi");
        System.out.println(" 3. mencari saldo >500000");
        System.out.println(" 4. Sorting by name");
        System.out.println(" 5. keluar");
        System.out.print("Pilih (1-5): ");
        int menu = input.nextInt();
        
        if(menu == 1){
            t.tampilRekening();
        } else if (menu == 2){
            t.tampilTransaksi();
        } else if (menu == 3){
            double saldo;
            if (saldo > 50000){
                int cari;
            int posisi = t.FindSeqSearch(cari);
            }
        }
    }
        
        
}
}
