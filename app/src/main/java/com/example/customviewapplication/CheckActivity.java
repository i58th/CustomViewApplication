package com.example.customviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class CheckActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox round,cancel,tick,star,square,normal,cloud,update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        round=(CheckBox)findViewById(R.id.round);
        cancel=(CheckBox)findViewById(R.id.cancel);
        star=(CheckBox)findViewById(R.id.star);
        tick=(CheckBox)findViewById(R.id.tick);
        square=(CheckBox)findViewById(R.id.square);
        normal=(CheckBox)findViewById(R.id.normal);
        cloud=(CheckBox)findViewById(R.id.cloud);
        update=(CheckBox)findViewById(R.id.update);


        normal.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        square.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        round.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        star.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        tick.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        cancel.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        cloud.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        update.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        int id = buttonView.getId();

        if(id==normal.getId())
            Toast.makeText(this, "Normal Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==square.getId())
            Toast.makeText(this, "Square Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==round.getId())
            Toast.makeText(this, "Round Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==star.getId())
            Toast.makeText(this, "Star Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==tick.getId())
            Toast.makeText(this, "Tick Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==cancel.getId())
            Toast.makeText(this, "Cancel Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==cloud.getId())
            Toast.makeText(this, "Cloud Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
        else if(id==update.getId())
            Toast.makeText(this, "Update Option is Checked: "+isChecked, Toast.LENGTH_SHORT).show();
    }
}
