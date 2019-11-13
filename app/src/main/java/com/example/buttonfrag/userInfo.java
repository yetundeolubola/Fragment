package com.example.buttonfrag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userInfo extends AppCompatActivity {

 EditText username,password,confirm_password,email,phonenumber;
 Button createacct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        username = findViewById(R.id.username);
        email = findViewById(R.id.edt_email);
        password = findViewById(R.id.edt_pass);
        confirm_password = findViewById(R.id.edt_confirmpass);
        phonenumber = findViewById(R.id.edt_phnnum);
        createacct = findViewById(R.id.btn_createAcct);


        createacct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String Email = email.getText().toString();
                String pass = password.getText().toString();
                String confirmpass = confirm_password.getText().toString();
                int phoneNumber = Integer.parseInt(phonenumber.getText().toString());

                user_detail userdetail = new user_detail();
                userdetail.setEmail(Email);
                userdetail.setPhonemummber(phoneNumber);
                userdetail.setUsername(user);
                userdetail.setPassword(pass);
                userdetail.setPassword(confirmpass);
                MainActivity.userdetail_db.user_dao().adduser(userdetail);
                Toast.makeText(getApplicationContext(), "Registration Sucessfully",Toast.LENGTH_SHORT).show();


                username.setText("");
                email.setText("");
                phonenumber.setText("");
                password.setText("");
                confirm_password.setText("");

            }
        });

    }

}
