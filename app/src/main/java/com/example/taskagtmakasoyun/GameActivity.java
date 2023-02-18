package com.example.taskagtmakasoyun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private Button buttonTas;
    private Button buttonKagit;
    private Button buttonMakas;
    private ImageView imageSen;
    private ImageView imagePC;
    private TextView textViewSonuc;
    private TextView txtSen;
    private TextView txtPC;
    private int senPuan = 0;
    private int pcPuan = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        buttonTas = findViewById(R.id.buttonTas);
        buttonKagit = findViewById(R.id.buttonKagit);
        buttonMakas = findViewById(R.id.buttonMakas);
        imageSen = findViewById(R.id.imageSen);
        imagePC = findViewById(R.id.imagePC);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        txtSen = findViewById(R.id.txtSen);
        txtPC = findViewById(R.id.txtPC);

        Random rnd = new Random();

        buttonTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageSen.setImageResource(R.drawable.rock);
                int sayi = rnd.nextInt(3)+1;

                if (sayi==1){
                    imagePC.setImageResource(R.drawable.rock);
                    textViewSonuc.setText("BERABERE!");
                } else if (sayi == 2) {
                    imagePC.setImageResource(R.drawable.paper);
                    textViewSonuc.setText("KAYBETTİN!");
                    pcPuan++;
                    txtPC.setText(String.valueOf(pcPuan));
                }else if (sayi == 3) {
                    imagePC.setImageResource(R.drawable.scissors);
                    textViewSonuc.setText("KAZANDIN!");
                    senPuan++;
                    txtSen.setText(String.valueOf(senPuan));
                }
            }
        });

        buttonKagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageSen.setImageResource(R.drawable.paper);
                int sayi = rnd.nextInt(3)+1;

                if (sayi==1){
                    imagePC.setImageResource(R.drawable.rock);
                    textViewSonuc.setText("KAZANDIN!");
                    senPuan++;
                    txtSen.setText(String.valueOf(senPuan));
                } else if (sayi == 2) {
                    imagePC.setImageResource(R.drawable.paper);
                    textViewSonuc.setText("BERABERE!");
                }else if (sayi == 3) {
                    imagePC.setImageResource(R.drawable.scissors);
                    textViewSonuc.setText("KAYBETTİN!");
                    pcPuan++;
                    txtPC.setText(String.valueOf(pcPuan));
                }

            }
        });

        buttonMakas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageSen.setImageResource(R.drawable.scissors);
                int sayi = rnd.nextInt(3)+1;

                if (sayi==1){
                    imagePC.setImageResource(R.drawable.rock);
                    textViewSonuc.setText("KAYBETTİN!");
                    pcPuan++;
                    txtPC.setText(String.valueOf(pcPuan));
                } else if (sayi == 2) {
                    imagePC.setImageResource(R.drawable.paper);
                    textViewSonuc.setText("KAZANDIN!");
                    senPuan++;
                    txtSen.setText(String.valueOf(senPuan));
                }else if (sayi == 3) {
                    imagePC.setImageResource(R.drawable.scissors);
                    textViewSonuc.setText("BERABERE!");
                }

            }
        });

    }

}

