package de.hawlandshut.studienprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KundeSalon extends AppCompatActivity {
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunde_salon);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKategorieauswahl();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
    }

    public void openKategorieauswahl(){
        Intent intent = new Intent(this, Kategorieauswahl.class);
        startActivity(intent);
    }
}
