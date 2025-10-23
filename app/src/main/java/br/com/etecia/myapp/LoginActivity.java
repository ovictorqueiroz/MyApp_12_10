package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    MaterialButton btnEntrar;
    TextView txtRecPass, txtCadastrar;

    TextInputEditText emailInput, passInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnEntrar = findViewById(R.id.btnEntrar);
        txtCadastrar = findViewById(R.id.txtCadastrar);
        txtRecPass = findViewById(R.id.txtRecPass);

        emailInput = findViewById(R.id.emailInput);;
        passInput = findViewById(R.id.passInput);;

        txtCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CadastroUserActivity.class));
                finish();
            }
        });
        txtRecPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecuperarUsuarioActivity.class));
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;

                email = emailInput.getText().toString();
                password = passInput.getText().toString();

                if (email.equals("admin") && password.equals("admin")){
                    startActivity(new Intent(getApplicationContext(), MenuPrincipal.class));
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuário ou senha Inválidos!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}