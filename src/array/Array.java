/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); 
        String[] nama = new String [25];
        int [] nilai = new int [5];
        int l;
       
        System.out.println("Masukkan Panjang Array :");
        l = new Scanner (System.in).nextInt();
        
        for (int x=0;x<l;x++){
        System.out.println("Masukkan Nama :");
        nama[x]= new Scanner(System.in).nextLine();
        System.out.println("Masukkan Nilai :");
        nilai[x]= new Scanner(System.in).nextInt();
        }
        
        for (int x=0;x<l;x++){
            
        System.out.println("nama ke="+nama[x]);
        System.out.println("dengan nilai="+nilai[x]);
    }
    
}
