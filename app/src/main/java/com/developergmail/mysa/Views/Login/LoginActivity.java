package com.developergmail.mysa.Views.Login;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.developergmail.mysa.R;

public class LoginActivity extends AppCompatActivity {
    EditText editUserId,editPassword,editConfirmPassword;
    Button btnLogin;
    boolean isToLogin=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        InitUi();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.setVisibility(View.GONE);
    }
private void InitUi(){
    editUserId=(EditText)findViewById(R.id.edt_useId);
    editPassword=(EditText)findViewById(R.id.userpass);
    editConfirmPassword=(EditText)findViewById(R.id.confirmuserpass);
    btnLogin=(Button) findViewById(R.id.btn_Login);

    editConfirmPassword.setVisibility(View.GONE);
    btnLogin.setText("Login");

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(isToLogin){
            if(checkPassword()){

            }
            }else {
                if(checkConfirmPassword()){

                }
            }
        }
    });


}


    public boolean checkPassword() {
        final String strPwd=editPassword.getText().toString();
        final String strUserId=editUserId.getText().toString();
        if (TextUtils.isEmpty(strPwd)){

            Toast.makeText(this, "PLEASE TYPE A PASSWORD", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(strUserId)){
            Toast.makeText(this, "ENTER YOUR USER ID", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
    public boolean checkConfirmPassword(){
        final String strPwd=editPassword.getText().toString();
        final String strUserId=editUserId.getText().toString();
        final String strConfirmPassword=editConfirmPassword.getText().toString();
        if (TextUtils.isEmpty(strPwd)){

            Toast.makeText(this, "PLEASE TYPE A PASSWORD", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(strUserId)){
            Toast.makeText(this, "ENTER YOUR USER ID", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(strConfirmPassword)){
            Toast.makeText(this, "ENTER THE CONFIRM PASSWORD FIELD", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    public void register(View view) {

        editConfirmPassword.setVisibility(View.VISIBLE);
        btnLogin.setText("Register");



    }
}
