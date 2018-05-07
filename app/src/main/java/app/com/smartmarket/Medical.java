package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        Button b1,b2;
        b1=(Button)findViewById(R.id.medical1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Medical.this,Display.class).putExtra("a","shop5");
                startActivity(toy1);
            }
        });
        b2=(Button)findViewById(R.id.medical2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(Medical.this,Display.class).putExtra("a","shop6");
                startActivity(toy1);
            }
        });
    }
}
