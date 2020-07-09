package com.yuhu.projectlatihan.without_DI;

public class DarkKnight {

    //Membuat Instance / Objek dari Class Senjata
    private Senjata senjata = new Senjata();

    //Membuat Fungsi yang Mengembalikan Nilai String
    public String setEquip(){
        return "Kelompok DarkKnight Bertempur Menggunakan " + senjata.tombak();
    }
}
