package com.example.customviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    RadioButton java,cplus,ruby,python,shell,javascript,mongo;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        java=(RadioButton)findViewById(R.id.java);
        cplus=(RadioButton)findViewById(R.id.cplus);
        ruby=(RadioButton)findViewById(R.id.ruby);
        python=(RadioButton)findViewById(R.id.python);
        shell=(RadioButton)findViewById(R.id.shell);
        javascript=(RadioButton)findViewById(R.id.javascript);
        mongo=(RadioButton)findViewById(R.id.mongo);
        rg=(RadioGroup)findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb=(RadioButton)group.findViewById(checkedId);
                String str;
                if(rb !=null)
                {
                    str= rb.getText().toString();
                }else
                    str="No option Selected ";

                Toast.makeText(getApplicationContext(),"Your Selected Option: "+str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
