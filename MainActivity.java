package com.example.vcalazas.quisvitorgabrielcalazasdalmolin;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton cb1;
    RadioButton cb2;
    RadioButton cb3;
    RadioButton cb4;
    RadioButton cb5;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (RadioButton) findViewById(R.id.certa);
        cb2 = (RadioButton) findViewById(R.id.certa2);
        cb3 = (RadioButton) findViewById(R.id.certa3);
        cb4 = (RadioButton) findViewById(R.id.certa4);
        cb5 = (RadioButton) findViewById(R.id.certa5);

        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void Validar(View v){
        if(cb1.isChecked()){
            tv1.append("  1 esta correta!");
        }else {
            tv1.append("  1 esta errada!");
        }if(cb2.isChecked()){
            tv1.append("  2 esta correta!");
        }else{
            tv1.append("  2 esta errada!");
        }if(cb3.isChecked()){
            tv1.append("  3 esta correta!");
        }else{
            tv1.append("  3 esta errada!");
        }if(cb4.isChecked()){
            tv1.append("  4 esta correta!");
        }else{
            tv1.append("  4 esta errada!");
        }if(cb5.isChecked()){
            tv1.append("  5 esta correta!");
        }else{
            tv1.append("  5 esta errada!");
        }
    }
}
