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

    }
    public void footwea (View view){
        Intent myIntent=new Intent(shop.this,Footwear.class);
        startActivity(myIntent);
    }

    public void medica (View view){
        Intent myIntent=new Intent(shop.this,Medical.class);
        startActivity(myIntent);
    }

    public void Stationar (View view){
        Intent myIntent=new Intent(shop.this,Stationary.class);
        startActivity(myIntent);
    }

    public void FoodBev (View view){
        Intent myIntent=new Intent(shop.this,FoodBeve.class);
        startActivity(myIntent);
    }
    public void BeautySe (View view){
        Intent myIntent=new Intent(shop.this,beauty.class);
        startActivity(myIntent);
    }

    public void Garmen (View view){
        Intent myIntent=new Intent(shop.this,Garment.class);
        startActivity(myIntent);
    }
}
