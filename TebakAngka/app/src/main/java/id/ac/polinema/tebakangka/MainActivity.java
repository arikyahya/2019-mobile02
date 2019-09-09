package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private Button guess, reset;
    int random = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRandomNumber();
        number = findViewById(R.id.number_input);
        guess = findViewById(R.id.guess_button);
        reset = findViewById(R.id.reset_button);
    }

    // TODO: generate angka random di sini
    private int initRandomNumber() {
        random = (int) (Math.random() * 100);
        return random;
    }

    public void handleGuess(View view) {
        int numberr = Integer.parseInt(String.valueOf(number.getText()));
        if (numberr > random) {
            Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
        } else if (numberr < random) {
            Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
        }
    }

    public void handleReset(View view) {
        number.setText("");
        initRandomNumber();
    }
}
