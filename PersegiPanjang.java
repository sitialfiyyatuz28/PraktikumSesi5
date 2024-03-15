/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi4;

/**
 *
 * @author Siti Alfiyyatuz Z A
 */
public class PersegiPanjang extends BangunDatar{
    
    PersegiPanjang(int p, int l){
        super(p,l);
    }
    int hitungLuasPersegi(){
        int p = super.getP();
        int l = super.getL();
        return p*l;
    }
    
    int hitungKelilingPersegi(){
        int p = super.getP();
        int l = super.getL();
        return 2*(p+l);
    }
    
    @Override
    public String toString(){
        String hasil = "Luas PersegiPanjang :" + hitungLuasPersegi() + "\n" + "Keliling PersegiPanjang :" + hitungKelilingPersegi();
        
        return hasil;
    }
}
