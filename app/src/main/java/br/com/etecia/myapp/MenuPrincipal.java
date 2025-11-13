package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipal extends AppCompatActivity {
    CardView cardBicicletas, cardReservar, cardOnde, cardPlanos, cardPerfilUsuario, cardSAC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardBicicletas = findViewById(R.id.cardBicicletas);
        cardReservar = findViewById(R.id.cardReservar);
        cardOnde = findViewById(R.id.cardOnde);
        cardPlanos = findViewById(R.id.cardPlanos);
        cardPerfilUsuario = findViewById(R.id.cardPerfilUsuario);
        cardSAC = findViewById(R.id.cardSAC);

        cardBicicletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Bicicletas.class));
                finish();
            }
        });

    }
}