package de.hawlandshut.studienprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C4_Wellness extends AppCompatActivity {

    private Button button16;
    private Button button17;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4_wellness);


        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWohnort();
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWohnort();
            }
        });

    }

    public void openWohnort(){
        Intent intent = new Intent(this, C5_Wohnort.class);
        startActivity(intent);
    }
}