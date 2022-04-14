/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg11;
import java.util.Scanner;
/**
 *
 * @author Aiman Yoviar
 */
public class Quiz8 {

    private static String namaBuahterbanyak;
    private static int jumlahBuahterbanyak;
       public static void main(String[] args) {
           Scanner userInput = new Scanner(System.in);
           System.out.print("Input jumlah buah: ");
           int jumlahBuah = userInput.nextInt();
           String[] namaBuah = new String[jumlahBuah];
           int[] banyakBuah = new int[jumlahBuah];
           masukanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);
           int hasil = buahTerbanyak(jumlahBuah, namaBuah, banyakBuah);
           
           System.out.println("Nominal buah terbanyak: "+hasil);
       }
     static void masukanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
      for (int i = 0; i < jumlahBuah; i++ ){
          System.out.print("Masukan nama buah "+(i+1)+":");
          namaBuah[i] = userInput.next();
          System.out.print("Masuka banyak buah "+namaBuah[i] +":");
          banyakBuah[i] = userInput.nextInt();
         
      }  
     }
      static int buahTerbanyak(int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
          String namaBuahTerbanyak ="";
          int jumlahBuahTerbanyak = 0;
          for (int i = 0; i < jumlahBuah; i++){
              if(banyakBuah[i] > jumlahBuahTerbanyak){
                  jumlahBuahterbanyak = banyakBuah[i];
                  namaBuahterbanyak = namaBuah[i];
                  
                   }
          }
          System.out.println("Buah terbanyak adalah "+namaBuahterbanyak + "(" +jumlahBuahTerbanyak +")");
          return jumlahBuahTerbanyak;
       }
}

