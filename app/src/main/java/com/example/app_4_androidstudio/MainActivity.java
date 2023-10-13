//Abel Ibarra

package com.example.app_4_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private CheckBox check_suma;
    private CheckBox check_resta;
    private CheckBox check_multi;
    private CheckBox check_div;
    private CheckBox check_elevar;
    private CheckBox check_mod;
    private CheckBox check_arrel;
    private CheckBox check_clean;
    private CheckBox check_exit;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        check_suma = (CheckBox) findViewById(R.id.check_suma);
        check_resta = (CheckBox) findViewById(R.id.check_resta);
        check_multi = (CheckBox) findViewById(R.id.check_multi);
        check_div = (CheckBox) findViewById(R.id.check_div);
        check_elevar = (CheckBox) findViewById(R.id.check_elevar);
        check_mod = (CheckBox) findViewById(R.id.check_mod);
        check_arrel = (CheckBox) findViewById(R.id.check_arrel);
        check_clean = (CheckBox) findViewById(R.id.check_clean);
        check_exit = (CheckBox) findViewById(R.id.check_exit);
        result = (TextView) findViewById(R.id.result);
    }
    public void calculate(View view) {

        result.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        if (check_suma.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long suma = n1 + n2;

                String resultat_suma = String.valueOf(suma);
                result.setText(resultat_suma);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_resta.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long resta = n1 - n2;

                String resultat_resta = String.valueOf(resta);
                result.setText(resultat_resta);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_multi.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long multi = n1 * n2;

                String resultat_multi = String.valueOf(multi);
                result.setText(resultat_multi);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_div.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long div = n1 / n2;

                String resultat_div = String.valueOf(div);
                result.setText(resultat_div);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_elevar.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                for (int i = 0; i < n2; i++) {
                    n1 *= n1;
                }

                long elevar = n1;

                String resultat_elevar = String.valueOf(elevar);
                result.setText(resultat_elevar);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_mod.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long mod = n1 % n2;

                String resultat_mod = String.valueOf(mod);
                result.setText(resultat_mod);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (check_arrel.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long arrel = (long) Math.sqrt(n1);

                String resultat_arrel = String.valueOf(arrel);
                result.setText(resultat_arrel);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }

        check_clean.setChecked(false);

    }
    public void clean(View view) {
        if (check_clean.isChecked()) {

            n1.setText(""); //neteje el texte de l edittext
            n2.setText("");
            result.setText("");

            check_suma.setChecked(false);
            check_resta.setChecked(false);
            check_multi.setChecked(false);
            check_div.setChecked(false);
            check_elevar.setChecked(false);
            check_mod.setChecked(false);
            check_arrel.setChecked(false);
        }

        check_clean.setChecked(false); //desactive el checkbox per a poder utilitzar les altres checkbox per que si no estan sempre en false
    }

    public void exit(View view) {
        finish();
        System.exit(0);
        // https://stackoverflow.com/questions/6014028/closing-application-with-exit-button
    }

}