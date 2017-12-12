package adivinha.cursoandroid.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     private Button botaoJogar;
     private TextView textoRelsultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarid);
        textoRelsultado =  findViewById(R.id.resultadoid);


        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroaleatorio = randomico.nextInt(10);
                textoRelsultado.setText("Numero escolhido:" + numeroaleatorio);

            }
        });
    }
}
