
package methodvoid;

public class methodstatic {
    static String nama;
    static int tahun2 = 2021 ,tahun1 = 2004, umur;
    static double rata_rata;
    
      public static void main(String[] args) {
          //memanggil data pada method static
          nama = "Zulfa Rizka Melati";
          umur_saya();
          nilaiUS();
      }
      //menambhkan sifat static pada method return
      static int umur_saya(){
          umur = tahun2 - tahun1;
          return umur;
      }
      //menambhkan sifat static pada method void
      static void nilaiUS(){
         rata_rata = 85.18; 
      }
}
