package com.example.exampledagger.di;

import com.example.exampledagger.Coche;
import com.example.exampledagger.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module// para ún modulo
public class MotorModule {
    // el modulo se encarga de proveer a nuestra a actividad todas las instancias necesarias para que funcione nuestra clase


    // Todos los métodos dentro de un modulo llevan la etiqueta @Provides
    // los métodos proporcionan objetos para la inyección de dependencias
    @Singleton
    @Named("diesel")
    @Provides
    public Motor providerMotorDiesel(){
        return new Motor("diesel");
    }

    // etiqueta "name" sirve para diferenciar un método de otro cuando tienen el mismo tipo de respuesta
    @Named("gasolina")
    @Provides
    public Motor providerMotorDieselGasolina(){
        return new Motor("gasolina");
    }

    @Provides
    public Coche providerCOche(@Named("diesel") Motor motor){
        return new Coche(motor);
    }

    // etiqueta "SINGLETON" solo te permite instanciar el objeto una vez

    // SCOPE ciclo de vida de las dependencias, cuando queremos que comiencen y cuando queremos que acaben. Porlo general queremos que esten vivos en el ciclo de vida de una ativity o un fragment.

}
