package app.com.smartmarket;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void searchShop (View view){
        Intent myintent= new Intent(home.this,shop.class);
        startActivity(myintent);
    }

    public void offers (View view){
        Intent myintent= new Intent(home.this,shop.class);
        startActivity(myintent);
    }

    public void profile (View view){
        Intent myintent= new Intent(home.this,Profile.class);
        startActivity(myintent);
    }


}
