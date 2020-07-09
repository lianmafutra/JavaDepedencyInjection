package com.yuhu.projectlatihan.with_DI;

import com.yuhu.projectlatihan.with_DI.Senjata;

public class DarkKnight {
    //Membuat Variable dari Class Senjata
    private Senjata senjata;

    //Membuat Constructor untuk menerima objek dari class Senjata
    public DarkKnight(Senjata senjata) {
        this.senjata = senjata;
    }

    //Membuat Fungsi yang Mengembalikan Nilai String
    String setEquip(){
        return "Kolempok DarkKnight Bertempur Menggunakan " + senjata.tombak();
    }
}
