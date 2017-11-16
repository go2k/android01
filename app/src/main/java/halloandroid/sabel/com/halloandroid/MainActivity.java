package halloandroid.sabel.com.halloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvNachricht;
    private Button btnWeiterFertig;
    private EditText etEingabe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNachricht = findViewById(R.id.tv_nachricht);
        btnWeiterFertig = findViewById(R.id.btn_weiter_fertig);
        etEingabe = findViewById(R.id.et_eingabe);

        tvNachricht.setText(R.string.willkommen);
        btnWeiterFertig.setText(R.string.weiter);

        btnWeiterFertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNachricht.setText(getString(R.string.hallo, etEingabe.getText()));
            }
        });

    }


}
