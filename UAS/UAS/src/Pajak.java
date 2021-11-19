
public class Pajak {
    int kode;
    int nominal;
    int denda;
    int bulanbayar;
    int indeks;
    
    Kendaraan listKendaraan[] = new Kendaraan[26];
    
    Pajak(int ko, int no, int de, int bb){
        kode = ko;
        nominal = no;
        denda = de;
        bulanbayar = bb;
    }
    
    void tambah(Kendaraan k) {
        if(indeks < listKendaraan.length){
            listKendaraan[indeks] = k;
            indeks++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }
    
    void tampil(){
        for(Kendaraan k : listKendaraan){
            k.tampil();
        }
    }
    
    void insertionShort(){
        for(int i = 1; i < listKendaraan.length; i++){
            Kendaraan temp = listKendaraan[i];
            int j = i;
            while( j > 0 && listKendaraan[j - 1].TNKB > temp.TNKB){
                listKendaraan[j] = listKendaraan[j - 1];
                j--;
            }
            listKendaraan[j] = temp;
        }
    }
    
    void sequentialSearch(int cari){
        
    }
    
    
    
    
    
    }

