package ru.mirea.miroshnichenko.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.tvOut);
        Button buttonOk = findViewById(R.id.btnOk);

        View.OnClickListener clickBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView.setText("Нажата кнопка ОК");
            };
        };
        buttonOk.setOnClickListener(clickBtnOk);
    }

    public void cancelButtonHandler(View view)
    {
        TextView myTextView = (TextView) findViewById(R.id.tvOut);
        myTextView.setText("Нажата кнопка Cancel");
    }
}