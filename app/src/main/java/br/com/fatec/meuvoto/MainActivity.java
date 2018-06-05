package br.com.fatec.meuvoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // https://stackoverflow.com/questions/17877595/i-want-text-view-as-a-clickable-link

    // Declaração de variáveis
    TextView txtvNovoCadastro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvNovoCadastro = (TextView) findViewById(R.id.txtvNovoCadastro);

        // Adicionando Eventos
        txtvNovoCadastro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v == txtvNovoCadastro ) {
            novoCadastro(v);
        }
    }

    public void novoCadastro(View v){
        Intent intencao = new Intent(this, CadastroActivity.class);
        startActivity(intencao);
    }
}
