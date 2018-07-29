package mx.edu.ittepic.clase6_ejemplo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sonidoLeon, sonidoGato, sonidoPerro;
    ImageButton btnLeon, btnGato, btnPerro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeon = findViewById(R.id.btnLeon);
        btnGato = findViewById(R.id.btnGato);
        btnPerro = findViewById(R.id.btnPerro);

        sonidoLeon = MediaPlayer.create(this, R.raw.leon_sonido);
        sonidoGato = MediaPlayer.create(this, R.raw.gato_sonido);
        sonidoPerro = MediaPlayer.create(this, R.raw.perro_sonido);

        btnLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoLeon.start();
            }
        });

        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoGato.start();
            }
        });

        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoPerro.start();
            }
        });


    }



}
