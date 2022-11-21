package pablobruixolanavarro.ejercicio3examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pablobruixolanavarro.ejercicio3examen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ibTokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "tokio");
                startActivity(intent);
            }
        });

        binding.lbTokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "tokio");
                startActivity(intent);
            }
        });


        binding.ibBerlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "berl_n");
                startActivity(intent);
            }
        });

        binding.lbBerlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "berl_n");
                startActivity(intent);
            }
        });

        binding.ibDenver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "denver");
                startActivity(intent);
            }
        });

        binding.lbDenver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "denver");
                startActivity(intent);
            }
        });

        binding.ibMoscu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "mosc_");
                startActivity(intent);
            }
        });

        binding.lbMoscu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "mosc_");
                startActivity(intent);
            }
        });

        binding.ibRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "r_o");
                startActivity(intent);
            }
        });

        binding.lbRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "r_o");
                startActivity(intent);
            }
        });
        binding.ibProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "el_profesor");
                startActivity(intent);
            }
        });

        binding.lbProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info_personaje.class);
                intent.putExtra(Costantes.personajes, "el_profesor");
                startActivity(intent);
            }
        });
    }
}