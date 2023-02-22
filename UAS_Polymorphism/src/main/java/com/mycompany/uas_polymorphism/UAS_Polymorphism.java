/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_polymorphism;

/**
 *
 * @author krist
 */
public class UAS_Polymorphism {

    public static void main(String[] args) {
       BangunRuang br;
       Lingkaran lk = new Lingkaran();
       Kubus kb = new Kubus();
       Balok bl = new Balok();
       
       br = lk;
       br.bentukBangunRuang();
       System.out.println();
       
       br= kb;
       br.bentukBangunRuang();
       System.out.println();
       
       br = bl;
       br.bentukBangunRuang();
        System.out.println();
     }  
       
}
  