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
public class Bai5 {
    public static int n = 0;
    
    
    public static void main(String[] args) {
       Bai5 bai5 =new Bai5();
        int x=0;
        Scanner sc = new Scanner(System.in);
        do {
            boolean check = false;
            do {
                bai5.menu();
                try {
                    System.out.println("Nhap vao lua chon :");
                    x = Integer.parseInt(sc.nextLine());
                    check = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("hay nhap dung kieu du lieu" + e.toString());
                    check = false;
                }
            } while (check == false);
            switch (x) {
                case 1: 
                bai5.nhap();
                break;
                case 2: 
                if(n==0){
                    System.out.println("ban chua nhap n!hoac ban de n =0");
                }else{
                    System.out.println("Tong 1+...1/"+n+" la:"+bai5.tinhTong1(n));
                    System.out.println("---------------------------------------------");
                }
                break;
                case 3: 
                    if(n==0){
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    }
                    else{
                    System.out.println("Tong 1+...1/"+n+"! la:"+ bai5.tinhTong2(n));
                    System.out.println("---------------------------------------------");
                } break;
            }
        }while (n != 0);
    }
    
    

    
 
    public void menu(){
       System.out.println("1 Nhap vao so nguyen duong n");
       System.out.println("2 Tinh tong :1+....+1/n");
       System.out.println("3 Tinh tong :1+....+1/n!");
    }
    
    public void nhap(){
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap vao n:");
                n = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Sai kiểu dữ liệu" + e.toString());
                check = false;
            }
        } while (check == false);
    }
    
    public float tinhTong1(int a){
        float tong1=0;
        for (int i = 1; i <= a; i++) {
            tong1+=1.0/i;
        }
        return tong1;
    }
    
    
    public float tinhTong2(int a){
        float tong2=0;
        int giaithua=1;
        for (int i = 1; i <= a; i++) {
            giaithua*=i;
            tong2+=1.0/giaithua;
        }
        return tong2;
    }



}

