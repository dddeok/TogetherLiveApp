package com.example.togetherliveapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {


    Button login_btn;
    Button sign_up_btn;
    EditText edit_id;
    EditText edit_pasword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn = (Button)findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_LONG).show();

                startActivity(new Intent(LoginActivity.this, MainPageActivity.class));
                finish();
            }
        });

        edit_id = (EditText)findViewById(R.id.edit_id);
        edit_id.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    edit_id.setHint("");
            }
        });

        edit_pasword = (EditText)findViewById(R.id.edit_password);
        edit_pasword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    edit_pasword.setHint("");
            }
        });

    }
}
