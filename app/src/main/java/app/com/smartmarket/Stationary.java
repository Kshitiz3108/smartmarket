package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stationary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationary);
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
        b1=(Button)findViewById(R.id.stationary1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Stationary.this,Display.class).putExtra("a","shop3");
                startActivity(toy1);
            }
        });
        b2=(Button)findViewById(R.id.stationary2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Stationary.this,Display.class).putExtra("a","shop4");;
                startActivity(toy1);
            }
        });
    }
}
