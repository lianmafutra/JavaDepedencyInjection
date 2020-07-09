package com.yuhu.projectlatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yuhu.projectlatihan.without_DI.DarkKnight;
import com.yuhu.projectlatihan.without_DI.LightKnight;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Deklarasi dan Inisialisasi View
        final TextView reportBattle = findViewById(R.id.txt_result);
        Button startBattle = findViewById(R.id.btn_tes);

        //Membuat Instance atau Object dari Class Light dan Dark Night
         final LightKnight lightKnight = new LightKnight();
        final DarkKnight darkKnight = new DarkKnight();

        //Menambahkan listener pada Button
        startBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Menampilkan Data pada TextView yang diambil dari Fungsi setEquip dari kedua Class tersebut
                String getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip();
                reportBattle.setText(getReport);
            }
        });

    }

}
