
public class Kendaraan {
    public String TNKB;
    public String nama;
    public int jenis;
    public int cc;
    public int tahun;
    public int bulanHarusBayar;

    public Kendaraan(String Tn, String n, int j, int c, int t, int bhb) {
        TNKB = Tn;
        nama = n;
        jenis = j;
        cc = c;
        tahun = t;
        bulanHarusBayar = bhb;
    }

    Kendaraan() {
    }
    
    void tampil(){
        System.out.println("TNKB : "+TNKB);
        System.out.println("Nama : "+nama);
        System.out.println("jenis : "+jenis);
        System.out.println("Umur : "+cc);
        System.out.println("Ipk : "+tahun);
        System.out.println("Bulah harus bayar : "+bulanHarusBayar);
        
    }
    
}
