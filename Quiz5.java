/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg11;

/**
 *
 * @author Aiman Yoviar
 */
public class Quiz5 {
     public static void main(String[] args) {
          int a, b, c, d, e;
          int maks;

           a = 6;
           b = 7;
           c = 15;
           d = 8;
           e = 4;
           
           // membuat struktur kondisi if
           if (a > b && a > c && a > d && a > e){
               maks = a;
            }else if(b > a && b > c && b > d && b > e){
                maks = b;
            } else if(c > a && c > b && c > d && c > e){
                maks = c;
            } else if(d > a && d > b && d > c && d > e){
                maks = d;
            } else {
                maks = e;
             }
            System.out.println("Angka Maksimum adalah= "+maks);
            
   
     }
}

