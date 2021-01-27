
package methodvoid;

public class non_void {
    String hewan = "Domba";
    int kandang1 = 20 , kandang2 = 50, hasil;
    
     public static void main(String[] args) {
     //Membuat objek dari class non_void
         non_void data = new non_void();
     //Memanggil data pada method non void
         data.jenis();
         data.jumlah();
     }
     String jenis(){
         //mengemblikan nilai hewan 
         return hewan;
     }
     int jumlah(){
         hasil = kandang1+kandang2;
         return hasil;//mengembalikan nilai dari hasi
     }
}
