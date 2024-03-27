package com.example.androidactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView Nameveiw,Phoneveiw,Emailveiw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Nameveiw  = findViewById(R.id.NameView) ;
        Phoneveiw = findViewById(R.id.PhoneView) ;
        Emailveiw = findViewById(R.id.EmailView) ;

        String username = getIntent().getStringExtra("UserName");
        String phoneNo    = getIntent().getStringExtra("phone");
        String Email    = getIntent().getStringExtra("email");

        Nameveiw.setText(username);
        Phoneveiw.setText(phoneNo);
        Emailveiw.setText(Email);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}