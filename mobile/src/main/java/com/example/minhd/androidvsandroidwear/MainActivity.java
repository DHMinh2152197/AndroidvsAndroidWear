package com.example.minhd.androidvsandroidwear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName,edtPassword;
    CheckBox chboxSaveInfor;
    Button btnLogin,btnSignUp;
    TextView txtGetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        setChboxSaveInfor();

        setBtnLogin();


    }

    public void mapping() {

        edtUserName=findViewById(R.id.edt_userName);
        edtPassword=findViewById(R.id.edt_password);
        chboxSaveInfor=findViewById(R.id.chbox_saveInformation);
        btnLogin=findViewById(R.id.btn_login);
        btnSignUp=findViewById(R.id.btn_signup);
        txtGetPassword=findViewById(R.id.txt_getPassWord);
    }

    public void setChboxSaveInfor(){
        chboxSaveInfor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"Infor Saved",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setBtnLogin(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Login Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setBtnSignUp(){
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Sign up Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
