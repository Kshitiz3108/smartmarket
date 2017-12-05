package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button21);
        b3=(Button)findViewById(R.id.button31);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(shop.this,Stationary.class);
                startActivity(toy1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy2=new Intent(shop.this,Medical.class);
                startActivity(toy2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy3=new Intent(shop.this,Footwear.class);
                startActivity(toy3);
            }
        });
    }
}
