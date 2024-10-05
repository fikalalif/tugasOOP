/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaclass;

/**
 *
 * @author Fikal Alif
 */
class Animal{
    String jenis ;
    String makan;
    int umur;
    Boolean mamalia;
    
    void cat(String jenis, String makan, int umur,Boolean mamalia){
        this.jenis = jenis;
        this.makan = makan;
        this.umur = umur;
        this.mamalia = mamalia;
    }
//    void show(String jenisHewan, String jenisMakan, int umurHewan,Boolean typeMamalia){
//        this.jenis = jenisHewan;
//        this.makan = jenisMakan;
//        this.umur = umurHewan;
//        this.mamalia = typeMamalia;
//    }

    public Animal(String jenis, String makan, int umur, Boolean mamalia) {
        this.jenis = jenis;
        this.makan = makan;
        this.umur = umur;
        this.mamalia = mamalia;
    }
    public String getJenis() {
        return jenis;
    }

    public String getMakan() {
        return makan;
    }

    public int getUmur() {
        return umur;
    }

    public Boolean getMamalia() {
        return mamalia;
    }
    
}

public class JavaClass {

    public static void main(String[] args) {
        Animal hewan = new Animal();
        hewan.jenis = "kucing";
        hewan.makan = "daging";
        hewan.umur = 2;
        hewan.mamalia = true;
        System.out.println("Jenis hewan : " + hewan.jenis);
        System.out.println("Makanan : "+hewan.makan);
        System.out.println("Umur : "+hewan.umur);
        System.out.println("Mamalia : "+hewan.mamalia);
        
        Animal hewan1 = new Animal("ikan pesut","daging",14,true);
        System.out.println("jenis hewan"+hewan1.getJenis());
        System.out.println("makan hewan"+hewan1.getMakan());
        System.out.println("jenis hewan"+hewan1.getUmur());
        System.out.println("jenis hewan"+hewan1.getMamalia());
        
        
    }
}
