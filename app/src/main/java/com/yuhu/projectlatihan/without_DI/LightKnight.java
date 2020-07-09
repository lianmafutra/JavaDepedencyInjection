package com.yuhu.projectlatihan.without_DI;

public class LightKnight {
    //Membuat Intance / Objek dari Class Senjata
    private Senjata senjata = new Senjata();

    //Membuat Fungsi yang mengembalikan Nilai String
    public String setEquip() {
        return "Kelompok LightKnight Bertempur Menggunakan " + senjata.pedang();
    }
}
