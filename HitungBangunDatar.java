/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi4;

import java.util.Scanner;

/**
 *
 * @author Siti Alfiyyatuz Z A
 */
public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1. BujurSangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("---Isikan Pilihan---");
        
        int pilihan = sc.nextInt();
        if(pilihan==1){
            System.out.println("\n Masukan nilai sisi : ");
            int s = sc.nextInt();
            //int luas = bs.hitungLuas();
            //int keliling = bs.hitungKeliling();
            
            //System.out.println("Luas BujurSangkar :" + luas);
            //System.out.println("Keliling BujurSangkar :" + keliling);
            BujurSangkar bs = new BujurSangkar(s);
            System.out.println(bs);
        }
       
        else{
            System.out.println("\n Masukan nilai panjang : ");
            int p = sc.nextInt();
            
            System.out.println("\n Masukan nilai lebar : ");
            int l = sc.nextInt();
            
            PersegiPanjang pp = new PersegiPanjang (p,l);
            System.out.println(pp);
            //PersegiPanjang pp = new PersegiPanjang(10,12);
            //int luasPersegi = pp.hitungLuasPersegi();
            //int kelilingPersegi = pp.hitungKelilingPersegi();
            
            //System.out.println("Luas PersegiPanjang :" + luasPersegi);
            //System.out.println("Keliling PersegiPanjang :" + kelilingPersegi);
    }
        
    }
}
