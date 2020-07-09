package com.yuhu.projectlatihan.with_DI;

//Class ini nantinya akan diakses oleh Class LightKnight dan DarkKnight
public class Senjata {
    //Deklarasi variable yang di butuhkan
    private String namaPedang;
    private String namaTombak;

    //Membuat Konstruktor untuk menentukan Nama senjata yang akan di pilih
    public Senjata(String namaPedang, String namaTombak) {
        this.namaPedang = namaPedang;
        this.namaTombak = namaTombak;
    }

    //Membuat 2 Buah Fungsi yang Mengenbalikan Nilai String dengan Data Berbeda
    String tombak(){
        return namaTombak;
    }
    String pedang(){
        return namaPedang;
    }
}
