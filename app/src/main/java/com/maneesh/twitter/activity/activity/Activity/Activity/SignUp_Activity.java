package com.maneesh.twitter.activity.activity.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.maneesh.twitter.R;

public class SignUp_Activity extends AppCompatActivity {

    EditText ed1,ed2;
    Button btnsignup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        imageView=findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnsignup=findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
    }

}
