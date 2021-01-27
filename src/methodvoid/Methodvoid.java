
package methodvoid;

public class Methodvoid {
    String nama, makanan;//menggunakan tipe data String
    
    public static void main(String[] args) {
        // membuat objek dari class methodvoid
        Methodvoid hewan =new Methodvoid();
        //memanggil method void 
        hewan.Kucing();
        hewan.Kambing();
        hewan.Ular();
    }// membuat method void
    void Kucing(){
        nama = "Anggora";
        makanan = "Whiskas";
    }
    void Kambing(){
        nama = "Etawa";
        makanan = "Rumput";
    } 
    void Ular(){
        nama = "Phyton";
        makanan = "Tikus dan Ayam";
    }
}
