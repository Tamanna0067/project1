package com.project.intentprac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA = "com.project.intentprac.extra.NAME";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void openActivity(View view) {
                Toast.makeText(MainActivity.this, "ur app is working", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity2.class);
                 name = findViewById(R.id.name);
                String nameText= name.getText().toString();
                intent.putExtra(EXTRA,nameText);
                startActivity(intent);


        }



    }
