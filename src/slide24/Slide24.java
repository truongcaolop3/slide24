/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide24;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Slide24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a , b;
        int c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        if ((a > b) && (a> 0) && (b > 0)) {
            c = a -b;
            System.out.println(a + " - " + b + " = " + c );
        }else
            System.out.println("ban phai nhap lai");
        
        
    }
    
}
