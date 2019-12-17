package com.example.exampledagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.exampledagger.di.MotorAplication;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Named("gasolina")
    @Inject // con esto se inyecta la dependencia
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //motor = new Motor("Gasolina");
        ((MotorAplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this, motor.getTipoMotor(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, coche.getMotor() , Toast.LENGTH_LONG).show();
    }
}
