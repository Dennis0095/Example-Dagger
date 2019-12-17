package com.example.exampledagger;

public class Motor {

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    private String tipoMotor;

    public String getTipoMotor(){
        return ("Motor: " + tipoMotor);
    }
}
