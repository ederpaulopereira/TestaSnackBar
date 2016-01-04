package com.example.eder.testasnackbar;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by eder on 04/01/16.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    Button botao1;
    Button botao2;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        botao1 = (Button) findViewById(R.id.btn1);
        botao2 = (Button) findViewById(R.id.btn2);
        botao1.setOnClickListener(this);
        botao2.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                snackbar = Snackbar.make(v, "Arquivo deletado", Snackbar.LENGTH_SHORT);
                snackbar.show();
                break;
            case R.id.btn2:
                snackbar = Snackbar.make(v, "Arquivo deletado", Snackbar.LENGTH_SHORT)
                        .setAction("Desfazer", new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Log.i("log", "Desfeito");
                            }
                        });
                snackbar.show();
                break;
        }

    }
}
