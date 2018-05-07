package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Footwear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footwear);
        Button b1,b2;
        b1=(Button)findViewById(R.id.shoe1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Footwear.this,Display.class).putExtra("a","shop1");
                startActivity(toy1);
            }
        });
        b2=(Button)findViewById(R.id.shoe2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Footwear.this,Display.class).putExtra("a","shop2");
                startActivity(toy1);
            }
        });

    }
}
