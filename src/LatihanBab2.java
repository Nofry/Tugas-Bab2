import java.util.Scanner;
class ATM{
    String nama,pin, noRek;
    int saldo ,uang;
  public ATM(String nama,String pin, int saldo, String noRek){
       this.nama = nama;
       this.pin = pin;
       this.noRek = noRek;
       this.saldo = saldo ;
       uang = 0;
   }
  public void getSaldo(){
       System.out.println("=====SALDO=====");
       System.out.println("Saldo di Rekening anda : Rp."+saldo+";");
       System.out.println("Transaksi Berhasil");
   }
}
public class LatihanBab2 {
    public static void main(String[] args) {
        
        
        
    }
    
}
