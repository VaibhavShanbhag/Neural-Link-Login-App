package com.example.neurallinksolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginClick = findViewById(R.id.login);
        Button facebookClick = findViewById(R.id.facebookLogin);

        loginClick.setOnClickListener(this);
        facebookClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        CheckBox remember_me = findViewById(R.id.remember_me);

        if(v.getId() == R.id.login)
        {
            String Username = String.valueOf(username.getText());
            String Password = String.valueOf(password.getText());

            if (Username.equals("Admin") && Password.equals("12345"))
            {
                if(remember_me.isChecked())
                {
                    Toast.makeText(this, "Valid Username and Password", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(this, "Remember me not checked", Toast.LENGTH_LONG).show();
                }
            }

            else
            {
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_LONG).show();
            }
        }

        if (v.getId() == R.id.facebookLogin)
        {
            Toast.makeText(this, "Facebook login is not available for now", Toast.LENGTH_LONG).show();
        }


    }

}