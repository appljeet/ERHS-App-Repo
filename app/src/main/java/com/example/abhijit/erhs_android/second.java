package com.example.abhijit.erhs_android;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView mytv;
    Typeface myfont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(second.this, signin.class));
            }
        });

        //added SF PRO Display Font
        //if you want to add more fonts, copy the format below.
        //Just don't forget to call your TextViews and Buttons.
        mytv = (TextView)findViewById(R.id.textView);
        myfont = Typeface.createFromAsset(this.getAssets(),"fonts/SF-Pro-Display-Regular.otf");
        mytv.setTypeface(myfont);
    }
}
