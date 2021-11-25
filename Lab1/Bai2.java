/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Bai2 {
       public static void main(String[] args) {
       int a,b,c,max,min, ck, cm;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so a:");
       a = sc.nextInt();
       System.out.println("Nhap so  b:");
       b = sc.nextInt();
        System.out.println("Nhap so  c:");
       c = sc.nextInt();
       max = (a>b)?a:b;
       min = (a>b)?b:a;
       System.out.println("Max la:"+max);
       System.out.println("Min la:"+min);
       
       System.out.println("Lớn nhất trong 3 số");
       ck = a;
       if(b > ck){
           ck = b;
       }
       if(c> ck){
           ck = c;
       }
       System.out.println(ck);
       System.out.println("Bé nhất trong 3 số");
       cm = a;
       if(b< cm){
           cm = b;
          
       }
       if(c < cm){
           cm = c;
       }
           System.out.println(cm);
 }

}
