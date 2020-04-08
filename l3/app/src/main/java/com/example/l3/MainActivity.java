package com.example.l3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Создание заглавной буквы
    public String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Phares result = new Phares();
                String temp = result.phase;
                String[] arrTemp = temp.split(" ");
                String upper = firstUpperCase(arrTemp[0]);
                String answer = upper + " " + arrTemp[1] + " " + arrTemp[2] + " - это " + arrTemp[1] + " " + arrTemp[0] + " " + arrTemp[2] + ".";
                textView.setText(answer);

            }
        });

    }
}

class Phares{
    private String[] wordListOne = {"круглосуточный", "трех-звенный",
            "30-футовьй", "взаимный", "обоюдный выигрыш", "фронтэнд",
            "на основе веб-технологий", "проникащий", "умный", "динамичный"};

    private String[] wordListTwo = {"уполномоченный", "трудный",
            "чистый продукт", "ориентированный", "центральный",
            "распределенный", "кластеризованный", "фирменный",
            "нестандартный ум", "позиционированный", "сетевой",
            "сфокусированный", "использованный с выгодой", "выровненный",
            "целесообразный", "общий", "совместный", "ускоренный"};

    private String[] wordListThree = {"процесс", "пункт разгрузки",
            "выход из положения", "тип структуры", "талант", "подход",
            "уровень завоеванного внимания", "портал", "период времени",
            "обзор", "образец", "пункт следования"};
    private int oneLength = wordListOne.length;
    private int twoLength = wordListTwo.length;
    private int threeLength = wordListThree.length;
    //Генерируем три случайных числа
    private int rl = (int) (Math.random() * oneLength) ;
    private int r2 = (int) (Math.random() * twoLength) ;
    private int r3 = (int) (Math.random() * threeLength);
    //Теперь строим фразу
    String phase =  wordListOne[rl] + " " + wordListTwo[r2] + " " + wordListThree[r3];

}