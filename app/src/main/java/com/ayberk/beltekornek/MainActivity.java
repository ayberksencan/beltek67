package com.ayberk.beltekornek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Built-in onClickListener Kullanımı*/
        Button button = findViewById(R.id.button);
        ImageView img = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.kaplan);
            }
        });

    }

    //Harici onClick Fonksiyonu Kullanımı
    public void changeImage(View view){

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.aslan);


        /* SORULAR - 1
         * 1) Fonksiyon nedir ?
         * 2) Neden fonksiyon kullanırız?
         * 3) Fonksiyonlar ne döndürür?
         * 4) Fonksiyonlara nerelerden erişim sağlayabiliriz?
         * 5) Fonksiyonlar hangi girdileri alabilir?
         * */

        /* SORULAR - 2
        * 1) Tanımlamayı burada yapmak zorunda mıyız?
        * 2) onCreate içerisinde tanımlanmış olan ögeleri burada kullanabilir miyiz?
        * 3) Eğer kullanamazsak, bu ögeleri her onClick metodunda tekrar tekrar tanımlamak
        * zorunda kalır mıyız?
        * 4) Bu zorunluluğa düşmemek için neler yapabiliriz?
        */



    }
}