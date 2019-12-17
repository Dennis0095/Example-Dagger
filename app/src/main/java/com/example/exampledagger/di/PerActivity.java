package com.example.exampledagger.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)// ciclo de vida de una actividad
public  @interface PerActivity {

}
