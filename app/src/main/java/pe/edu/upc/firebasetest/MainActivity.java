package pe.edu.upc.firebasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Firebase mRef;
    TextView textticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        textticket = (TextView) findViewById(R.id.textTicket);
        mRef = new Firebase("https://shining-heat-2604.firebaseio.com/");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object data = dataSnapshot.getValue();
                String asdasd = ((HashMap) data).get("ticket").toString();
                textticket.setText(asdasd);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
