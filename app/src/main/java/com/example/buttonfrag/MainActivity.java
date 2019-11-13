package com.example.buttonfrag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static userdetail_db userdetail_db;
    TextView signup,tv_forgetpass;
    EditText edt_email,edt_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        signup = findViewById(R.id.tv_signup);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),userInfo.class));
                finish();
            }
        });
        userdetail_db = Room.databaseBuilder(getApplicationContext(),userdetail_db.class,"Userdb")
                .allowMainThreadQueries()
                .build();
    }
}
