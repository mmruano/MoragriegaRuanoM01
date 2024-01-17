package com.vedruna.moragriegaruanom01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView nameText, popUpText;
    private EditText passwordText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameText = findViewById(R.id.nameText);
        passwordText = findViewById(R.id.passwordText);
        popUpText = findViewById(R.id.popUpText);
        loginButton = findViewById(R.id.loginButton);
    }

    public void LoginClick(View view) {
        String name = nameText.getText().toString();
        String password = passwordText.getText().toString();

        if (name.equals("admin") && password.equals("admin")) {
            popUpText.setText("Usuario y contraseña correcta");

            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("admin", name);
            startActivity(intent);
        } else {
            popUpText.setText("Usuario o contraseña incorrecta");
        }
    }
}