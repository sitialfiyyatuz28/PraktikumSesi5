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
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar(int s){
        super(s);
    }

    int hitungLuas(){
        int s = super.getS();
        return s*s;
    }
    
    int hitungKeliling(){
        int s = super.getS();
        return 4*s;
    }
    
    @Override
    public String toString(){
        String hasil = "Luas Bujur Sangkar :" + hitungLuas() + "\n" + "Keliling Bujur Sangkar :" + hitungKeliling();
        
        return hasil;
    }
}

