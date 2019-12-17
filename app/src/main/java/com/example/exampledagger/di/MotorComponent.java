package com.example.exampledagger.di;
import com.example.exampledagger.MainActivity;

import dagger.Component;

// En dagger a todos los componentes se pone la etiqueta Component y el modulo con el que va a trabajar
@PerActivity // con esto le decimos al component que siempre se va a crear por un activity o un fragment o un view
@Component(modules = MotorModule.class)
public interface MotorComponent {
    //Segundo elemento de dagger
    //interfaz COMPONENT es el puente entre los modulos creados

    void inject(MainActivity mainActivity);
}
