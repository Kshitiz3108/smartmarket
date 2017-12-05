package app.com.smartmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        final EditText ed1,ed2;
        TextView tx1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.username);
        ed2 = (EditText)findViewById(R.id.password);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("admin")&&ed2.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),"Redirecting..",Toast.LENGTH_SHORT).show();
                    Intent toy=new Intent(MainActivity.this,home.class);
                    startActivity(toy);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}
