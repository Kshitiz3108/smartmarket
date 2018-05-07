package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodBeve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_beve);
        Button b1,b2;
        b1=(Button)findViewById(R.id.Food1);
        b2=(Button)findViewById(R.id.Food2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(FoodBeve.this,Display.class).putExtra("a","shop7");;
                startActivity(toy1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(FoodBeve.this,Display.class).putExtra("a","shop8");;
                startActivity(toy1);
            }
        });
    }
}
