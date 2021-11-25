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
public class Bai4 {
    public static void main(String[] args){
        int n;
        System.out.println("Nhập số điện ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n >0 && n <50){
            System.out.println("Số tiền điện là: "+(n *5000));
        }else if(n> 50){
            System.out.println("Số tiền điện là: "+(50*5000+(n-50)*6200));
        }
    }
}
