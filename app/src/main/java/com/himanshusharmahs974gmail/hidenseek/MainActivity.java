package com.himanshusharmahs974gmail.hidenseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView mtext  ;
    public Button mbutt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtext=(TextView)findViewById(R.id.text1);
        mbutt =(Button)findViewById(R.id.button);
        mbutt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.button:

                mtext.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
