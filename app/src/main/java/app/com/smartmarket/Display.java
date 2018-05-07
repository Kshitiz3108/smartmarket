package app.com.smartmarket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Display extends AppCompatActivity {
    public FirebaseDatabase mFirebaseDatabse;
    public FirebaseAuth mAuth;
    public FirebaseAuth.AuthStateListener mAuthListener;
    public DatabaseReference myRef,tRef,aRef;
    public String shopID;
    public ListView mListView;
    String name,add,email,phone;
    InfoShop is;
    TextView tv,nam,ph,addr,mail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        final String sname = getIntent().getExtras().getString("a");
        //mAuth=FirebaseAuth.getInstance();
        myRef=FirebaseDatabase.getInstance().getReference();

        tv = (TextView) findViewById(R.id.status);
        nam = (TextView) findViewById(R.id.sName);
        ph = (TextView) findViewById(R.id.sPhone);
        addr = (TextView) findViewById(R.id.sAdd);
        mail = (TextView) findViewById(R.id.sEmail);


        tRef=myRef.child("status").child(sname);
        tRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                String abc = ds.getValue(String.class).toString();
                if(abc.equals("0")){
                    tv.setText("Closed");
                }
                else{
                    tv.setText("Open");
                }}
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        aRef=myRef.child("info").child(sname);
        aRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    switch (ds.getKey().toString()){
                        case "add": addr.setText(ds.getValue(String.class).toString());
                            break;
                        case "email": mail.setText(ds.getValue(String.class).toString());
                            break;
                        case "name": nam.setText(ds.getValue(String.class).toString());
                            break;
                        case "phone": ph.setText(ds.getValue(String.class).toString());
                            break;

                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
