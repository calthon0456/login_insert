package br.com.etecia.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textUsername = findViewById(R.id.username);
                TextView textPassword = findViewById(R.id.password);
                String username = textUsername.getText().toString();
                String password = textPassword.getText().toString();

                if(username.equals("admin") && password.equals("123456")){
                    Intent intentGoHome = new Intent(MainActivity.this, HomeActivity.class);
                    System.out.println("Bem Vindo");
                }else{
                    System.out.println("Erro ao Logar");
                }
            }
        });

    }
    private void alert(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

