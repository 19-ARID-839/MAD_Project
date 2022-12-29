package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {
    public static final  String TAG="TAG";
    EditText mFullname,mEmail,mPassword,mPhone = findViewById(R.id.phone);
    Button mRegisterBtn = findViewById(R.id.registerbtn);
    TextView mloginBtn,mcreateText;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mFullname=(EditText) findViewById(R.id.fullname);
        mEmail=(EditText)findViewById(R.id.email);
        mPassword=(EditText)findViewById(R.id.password);
        mloginBtn=(TextView) findViewById(R.id.createText);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);

            }
        });
        mcreateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);

            }
        });
//        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final String email=mEmail.getText().toString().trim();
//                String password=mPassword.getText().toString().trim();
//                final String fullname=mFullname.getText().toString();
//                final String phone=mPhone.getText().toString();
//                if (TextUtils.isEmpty(email)){
//                    mEmail.setError("Email is Required");
//                    return;
//                }
//                if (TextUtils.isEmpty(password)){
//                    mEmail.setError("Password is Required");
//                    return;
//                }
////               progressBar.setVisibility(View.VISIBLE);
//
//            }
//        });
    }

}