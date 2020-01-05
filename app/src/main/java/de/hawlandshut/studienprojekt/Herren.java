package de.hawlandshut.studienprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Herren extends AppCompatActivity {

    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herren);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriseure();
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKosmetikstudios();
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManikuerePedikuere();
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHaarentfernung();
            }
        });
    }

    public void openFriseure(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openKosmetikstudios(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openManikuerePedikuere(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openHaarentfernung(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }
}