package de.hawlandshut.studienprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kategorieauswahl extends AppCompatActivity {

    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorieauswahl);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDamen();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHerren();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWellness();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuchungSuchen();
            }
        });
    }

    public void openDamen(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openHerren(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openWellness(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openBuchungSuchen(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }
}