/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo, bulan;
        double bunga;
        //Format Currency
        DecimalFormat kursIndonesia =(DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        //
        Scanner scan = new Scanner(System.in);
       //input 
        System.out.print("Saldo Awal'  : Rp.");
        saldo = scan.nextInt();
        System.out.print("Bunga/Bulan : ");
        bunga = scan.nextInt();
        System.out.print("Lama(Bulan) : ");
        bulan = scan.nextInt();
       //proses
        int i=1;
        bunga = bunga/100;
        while(i<= bulan){
            saldo = (int) (saldo + (saldo*bunga));
            System.out.println("Saldo di bulan ke-"+i+" "+kursIndonesia.format(saldo));
            i++;
        }
    }
    
}
