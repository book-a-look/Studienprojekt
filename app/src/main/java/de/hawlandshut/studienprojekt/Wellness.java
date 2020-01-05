package de.hawlandshut.studienprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wellness extends AppCompatActivity {

    private Button button12;
    private Button button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellness);

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSauna();
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMassagen();
            }
        });
    }

    public void openSauna(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }

    public void openMassagen(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }
}