package com.yuhu.projectlatihan.with_DI;

import com.yuhu.projectlatihan.with_DI.Senjata;

public class LightKnight {
    //Membuat Variable dari Class Senjata
    private Senjata senjata;

    //Membuat Constructor untuk menerima objek dari class Senjata
    public LightKnight(Senjata senjata) {
        this.senjata = senjata;
    }


    //Membuat Fungsi yang mengembalikan Nilai String
    String setEquip() {
        return "Kolempok LightKnight Bertempur Menggunakan " + senjata.pedang();
    }
}
