package com.yuhu.projectlatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yuhu.projectlatihan.with_DI.DarkKnight;
import com.yuhu.projectlatihan.with_DI.LightKnight;
import com.yuhu.projectlatihan.with_DI.Senjata;

public class Main2Activity extends AppCompatActivity {

    String namaPedang = "Pedang Api";
    String namaTombak = "Tombak Petir";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Membuat Objek dari Class Senjata
        //final Senjata senjata = new Senjata();
        //Membuat Objek dari Class Senjata dengan Parameter
        final Senjata senjata = new Senjata(namaPedang, namaTombak);

        //Membuat Instance atau Objec dari Class Light dan Dark Night
        final LightKnight lightKnight = new LightKnight(senjata);
        final DarkKnight darkNight = new DarkKnight(senjata);
    }
}
