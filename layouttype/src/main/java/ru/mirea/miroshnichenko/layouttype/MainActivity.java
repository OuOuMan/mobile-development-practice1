package ru.mirea.miroshnichenko.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        /* Закомментировать при изменении ContentView строки с 19 по 26 */

        TextView myTextView = (TextView) findViewById(R.id.textView228);
        myTextView.setText("Second text from Mirea and George");

        Button button = findViewById(R.id.button22);
        button.setText("Mirea George Button");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);

    }
}